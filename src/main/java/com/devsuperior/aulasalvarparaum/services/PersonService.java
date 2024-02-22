package com.devsuperior.aulasalvarparaum.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aulasalvarparaum.dto.PersonDTO;
import com.devsuperior.aulasalvarparaum.dto.PersonDepartmentDTO;
import com.devsuperior.aulasalvarparaum.entities.Department;
import com.devsuperior.aulasalvarparaum.entities.Person;
import com.devsuperior.aulasalvarparaum.repositories.DepartmentRepository;
import com.devsuperior.aulasalvarparaum.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	public PersonRepository repository;

	@Autowired
	public DepartmentRepository departmentRepository;

	public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {

		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());

		Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId());
		// Department dept = new Department();
		// dept.setId(dto.getDepartment().getId());

		entity.setDepartment(dept);
		entity = repository.save(entity);
		return new PersonDepartmentDTO(entity);

	}

	public PersonDTO insert(PersonDTO dto) {

		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());

		Department dept = departmentRepository.getReferenceById(dto.getDepartmentId());
		// Department dept = new Department();
		// dept.setId(dto.getDepartmentId());

		entity.setDepartment(dept);
		entity = repository.save(entity);
		return new PersonDTO(entity);

	}

}
