package com.nttdata.bootcamp.webflux.controller;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.reactivestreams.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.webflux.model.Person;
import com.nttdata.bootcamp.webflux.repository.PersonRepository;

import reactor.core.publisher.Flux;

@Controller
public class MainController {
	
	
	@Autowired
	PersonRepository personRepo;
	
	@GetMapping(path="/numbers", produces="text/event-stream")
	public Flux<Integer> numbers() {
		
		Flux<Integer> flux = Flux.range(1, 30).delayElements(Duration.ofSeconds(1));
		
		
		return flux;
	}
	
	@GetMapping(path = "/numbers-with-subcribers", produces="text/event-stream")
	public Flux<Integer> numbersWithSubcribers() {
		
		Flux<Integer> flux = Flux.range(1, 30).delayElements(Duration.ofSeconds(1));
		

		flux.subscribe(n -> System.out.println("Subscriber 2: " + n));

		return flux;
	}
	
	@GetMapping("/person-list")
	public String personList1(Model model) {
		
//		model.addAttribute("personlist",peronslist);
		System.out.println(personRepo.searchAll().toIterable());
		model.addAttribute("personas", personRepo.searchAll().toIterable());
		return "personlist";
	}
}
