package com.poke.pokedex.service.impl;

import com.poke.pokedex.pojo.Pokemon;
import com.poke.pokedex.service.PokemonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class PokemonServiceImpl implements PokemonService {
    private static final List<Pokemon> pokemonList = new ArrayList<>();

    @Override
    public List<Pokemon> getAllPokemon() {
        return pokemonList;
    }

    @Override
    public List<Pokemon> getAllPokemonByName(String name) {
        return pokemonList.stream()
                .filter(pokemon -> pokemon.getSurname().equals(name))
                .collect(Collectors.toList());
    }

    @Override
    public void updatePokemon(String pokemonName, Pokemon pokemon) {
        this.deletePokemon(pokemonName);
        pokemonList.add(pokemon);
    }

    @Override
    public void createPokemon(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }

    @Override
    public void deletePokemon(String name) {
        pokemonList.removeIf(myPokemon -> myPokemon.getSurname().equals(name));
    }
}
