package com.nttdata.bootcamp.webflux.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nttdata.bootcamp.webflux.model.Person;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

	@Override
	public Flux<Person> searchAll() {
		// TODO Auto-generated method stub
		Person pr1 = new Person();
		pr1.setName("María");
		pr1.setAge(10);
		pr1.setLastName("Gutierrez");
		
		Person pr2 = new Person();
		pr2.setName("Gonzalo");
		pr2.setAge(10);
		pr2.setLastName("Gutierrez");
		
		Person pr3 = new Person();
		pr3.setName("Alba");
		pr3.setAge(18);
		pr3.setLastName("Gutierrez");
		
		Person pr4 = new Person();
		pr4.setName("Marcos");
		pr4.setAge(20);
		pr4.setLastName("Gutierrez");
		
		List<Person> personList = new ArrayList<>();
		personList.add(pr1);
		personList.add(pr2);
		personList.add(pr3);
		personList.add(pr4);
		
		return Flux.fromIterable(personList);
	}

	@Override
	public Mono<Person> addNewPerson(Person person) {
		// TODO Auto-generated method stub
		return Mono.just(person);
	}

}
