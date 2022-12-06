package com.poke.pokedex.service;

import com.poke.pokedex.model.Pokemon;

import java.util.List;

public interface PokemonService {
    List<Pokemon> getAllPokemon();

    Pokemon getPokemonById(Long id);

    void updatePokemon(Long id, Pokemon pokemon);

    void createPokemon(Pokemon pokemon);

    void deletePokemon(Long id);
}
