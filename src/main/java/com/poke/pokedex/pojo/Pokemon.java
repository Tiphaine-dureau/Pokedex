package com.poke.pokedex.pojo;

import java.util.List;

public class Pokemon {
    private Long id;
    private String surname;
    private List<Capacity> capacities;

    public Pokemon() {
    }

    public Pokemon(Long id, String surname, List<Capacity> capacities) {
        this.id = id;
        this.surname = surname;
        this.capacities = capacities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Capacity> getCapacities() {
        return capacities;
    }

    public void setCapacities(List<Capacity> capacities) {
        this.capacities = capacities;
    }
}
