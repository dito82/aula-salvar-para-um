package com.devsuperior.aulasalvarparaum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aulasalvarparaum.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	/*
	 * Realiza operações individuais de acesso ao banco de dados
	 */

}
