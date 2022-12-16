package com.poke.pokedex.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Pokemon")
public class Pokemon {
    @Id
    @SequenceGenerator(name = "pokemon_sequence", sequenceName = "pokemon_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pokemon_sequence")
    @Column(name = "pokemon_id", updatable = false)
    private Long id;
    private String surname;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pokemon_id")
    private Set<Ability> abilities = new LinkedHashSet<>();

    public Pokemon() {
    }

    public Pokemon(String surname, Set<Ability> abilities) {
        this.surname = surname;
        this.abilities = abilities;
    }

    public Pokemon(Long id, String surname, Set<Ability> abilities) {
        this.id = id;
        this.surname = surname;
        this.abilities = abilities;
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

    public Set<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(Set<Ability> abilities) {
        this.abilities = abilities;
    }
}
