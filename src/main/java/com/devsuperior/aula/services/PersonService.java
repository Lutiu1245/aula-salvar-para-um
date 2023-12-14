package com.devsuperior.aula.services;

import com.devsuperior.aula.DTO.PersonDTO;
import com.devsuperior.aula.DTO.PersonDepartamentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    final PersonRepository personRepository;
    final DepartmentRepository departmentRepository;
    @Autowired
    public PersonService(PersonRepository personRepository, DepartmentRepository departmentRepository) {
        this.personRepository = personRepository;
        this.departmentRepository = departmentRepository;
    }

    public PersonDepartamentDTO insert(PersonDepartamentDTO personDepartamentDTO) {
        Person person = new Person();

        CopyPerson(person, personDepartamentDTO);
        Department department = departmentRepository.getReferenceById(personDepartamentDTO.getDepartment().getId());

        person.setDepartment(department);
        person = personRepository.save(person);
        return new PersonDepartamentDTO(person);
    }

    public  PersonDTO insert(PersonDTO personDTO) {
        Person person = new Person();
        person.setName(personDTO.getName());
        person.setSalary(personDTO.getSalary());

        Department department = departmentRepository.getReferenceById(personDTO.getDepartmentId());

        person.setDepartment(department);
        person = personRepository.save(person);
        return new PersonDTO(person);
    }

    public void CopyPerson(Person person, PersonDepartamentDTO personDepartamentDTO) {
        person.setName(personDepartamentDTO.getName());
        person.setSalary(personDepartamentDTO.getSalary());
    }
}
