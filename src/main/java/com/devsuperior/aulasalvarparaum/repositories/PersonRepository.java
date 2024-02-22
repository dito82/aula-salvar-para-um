package com.devsuperior.aulasalvarparaum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aulasalvarparaum.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
	/*
	 * Realiza operações individuais de acesso ao banco de dados
	 */

}
