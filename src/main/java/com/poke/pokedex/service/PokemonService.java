package com.poke.pokedex.service;

import com.poke.pokedex.pojo.Pokemon;
import java.util.List;

public interface PokemonService {
    List<Pokemon> getAllPokemon();

    List<Pokemon> getAllPokemonByName(String name);

    void updatePokemon(String pokemonName, Pokemon pokemon);

    void createPokemon(Pokemon pokemon);

    void deletePokemon(String name);
}
