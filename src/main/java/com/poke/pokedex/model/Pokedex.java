package com.poke.pokedex.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Pokedex")
public class Pokedex {
    @Id
    @SequenceGenerator(name = "pokedex_sequence", sequenceName = "pokedex_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pokedex_sequence")
    @Column(name = "pokedex_id", updatable = false) // updatable false : personne ne pourra modifier l'id - c'est la base qui génère l'id
    private Long id;
    @Column(name = "region")
    private String region;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="pokemon_id")
    private Set<Pokemon> pokemonList = new LinkedHashSet<>();

    public Pokedex() {
    }

    public Pokedex(String region, Set<Pokemon> pokemonList) {
        this.region = region;
        this.pokemonList = pokemonList;
    }

    public Pokedex(Long id, String region, Set<Pokemon> pokemonList) {
        this.id = id;
        this.region = region;
        this.pokemonList = pokemonList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Set<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(Set<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
