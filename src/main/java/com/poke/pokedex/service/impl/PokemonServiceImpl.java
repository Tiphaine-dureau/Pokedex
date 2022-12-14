package com.poke.pokedex.service.impl;

import com.poke.pokedex.model.Pokemon;
import com.poke.pokedex.repository.PokemonRepository;
import com.poke.pokedex.service.PokemonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonServiceImpl implements PokemonService {
    private final PokemonRepository pokemonRepository;

    public PokemonServiceImpl(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public List<Pokemon> getAllPokemon() {
        return pokemonRepository.findAll();
    }

    @Override
    public Pokemon getPokemonById(Long id) {
        if (checkId(id)) {
            Optional<Pokemon> pokemonOptional = pokemonRepository.findById(id);
            return pokemonOptional.orElse(null);
        } else {
            return null;
        }
    }

    @Override
    public void updatePokemon(Long id, Pokemon pokemon) {
        this.deletePokemon(id);
        pokemonRepository.save(pokemon);
    }

    @Override
    public void createPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }

    @Override
    public void deletePokemon(Long id) {
        pokemonRepository.deleteById(id);
    }

    private boolean checkId(Long id) {
        return id != 0; // return true si id !=0 sinon false
    }
}
