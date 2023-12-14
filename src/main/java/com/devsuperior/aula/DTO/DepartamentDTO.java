package com.devsuperior.aula.DTO;

public class DepartamentDTO {
    private Long id;
    private String name;

    public DepartamentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
