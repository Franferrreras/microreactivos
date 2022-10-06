package com.nttdata.bootcamp.webflux.repository;

import org.springframework.stereotype.Repository;

import com.nttdata.bootcamp.webflux.model.Person;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface PersonRepository {

	Mono<Person> addNewPerson(final Person person);
	Flux<Person> searchAll();
}
