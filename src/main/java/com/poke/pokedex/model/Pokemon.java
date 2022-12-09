package com.poke.pokedex.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Pokemon")
public class Pokemon {
    @Id
    @SequenceGenerator(name = "pokemon_sequence", sequenceName = "pokemon_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pokemon_sequence")
    @Column(name = "pokemon_id", updatable = false)
    private Long id;
    private String surname;
    @ManyToOne
    @JoinColumn(name = "pokedex_id", nullable = false)
    private Pokedex pokedex; // clé étrangère

    @OneToMany(mappedBy = "pokemon")
    private List<Ability> abilities;

    public Pokemon() {
    }

    public Pokemon(String surname, List<Ability> abilities) {
        this.surname = surname;
        this.abilities = abilities;
    }

    public Pokemon(Long id, String surname, List<Ability> abilities) {
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

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }
}
