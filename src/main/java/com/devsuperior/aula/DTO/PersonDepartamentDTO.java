package com.devsuperior.aula.DTO;

import com.devsuperior.aula.entities.Person;

public class PersonDepartamentDTO {

    private Long id;
    private String name;
    private double salary;

    private DepartamentDTO departament;

    public PersonDepartamentDTO(Long id, String name, double salary, DepartamentDTO department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departament = department;
    }

    public PersonDepartamentDTO(Person person) {
        id = person.getId();
        name = person.getName();
        salary = person.getSalary();
        departament = new DepartamentDTO(person.getDepartment());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public DepartamentDTO getDepartment() {
        return departament;
    }
}
