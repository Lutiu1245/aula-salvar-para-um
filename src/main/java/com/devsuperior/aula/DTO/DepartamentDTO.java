package com.devsuperior.aula.DTO;

import com.devsuperior.aula.entities.Department;

public class DepartamentDTO {
    private Long id;
    private String name;

    public DepartamentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartamentDTO(Department department) {
       id = department.getId();
       name = department.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
