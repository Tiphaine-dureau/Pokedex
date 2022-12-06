package com.poke.pokedex.api;

import com.poke.pokedex.model.Pokemon;
import com.poke.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_POKEMON)
public class PokemonController {
    @Autowired
    // Dependency inversion (soliD) : utilisation d'une interface et pas directement d'une classe concrète
    private PokemonService pokemonService;

    // Dependency injection
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public List<Pokemon> getAllPokemon() {
        return pokemonService.getAllPokemon();
    }

    @GetMapping("{id}")
    public Pokemon getPokemonById(@PathVariable(name = "id") Long id) {
        return pokemonService.getPokemonById(id);
    }

    @PostMapping
    public void createPokemon(@RequestBody Pokemon pokemon) {
        pokemonService.createPokemon(pokemon);
    }

    @PutMapping("{id}")
    public void updatePokemon(@PathVariable(name = "id") Long id,
                              @RequestBody Pokemon pokemon) {
        pokemonService.updatePokemon(id, pokemon);
    }

    @DeleteMapping("{id}")
    public void deletePokemon(@PathVariable(name = "id") Long id) {
        pokemonService.deletePokemon(id);
    }
}
