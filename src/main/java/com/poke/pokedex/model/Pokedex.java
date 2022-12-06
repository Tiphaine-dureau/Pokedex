package com.poke.pokedex.model;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "pokedex")
    private List<Pokemon> pokemonList;

    public Pokedex() {
    }

    public Pokedex(String region, List<Pokemon> pokemonList) {
        this.region = region;
        this.pokemonList = pokemonList;
    }

    public Pokedex(Long id, String region, List<Pokemon> pokemonList) {
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

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
