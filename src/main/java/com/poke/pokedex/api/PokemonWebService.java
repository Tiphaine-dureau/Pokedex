package com.poke.pokedex.api;

import com.poke.pokedex.pojo.Pokemon;
import com.poke.pokedex.service.PokemonService;
import com.poke.pokedex.service.impl.PokemonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_POKEMON)
public class PokemonWebService {

    // Dependency inversion (soliD) : utilisation d'une interface et pas directement d'une classe concrète
    private final PokemonService pokemonService;

    // Dependency injection
    public PokemonWebService(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public List<Pokemon> getAllPokemon() {
        return pokemonService.getAllPokemon();
    }

    @GetMapping("{name}")
    public List<Pokemon> getAllPokemonByName(@PathVariable(name = "name") String name) {
        return pokemonService.getAllPokemonByName(name);
    }

    @PostMapping
    public void createPokemon(@RequestBody Pokemon pokemon) {
        pokemonService.createPokemon(pokemon);

    }

    @PutMapping("{name}")
    public void updatePokemon(@PathVariable(name = "name") String name,
                              @RequestBody Pokemon pokemon) {
        pokemonService.updatePokemon(name, pokemon);
    }

    @DeleteMapping("{name}")
    public void deletePokemon(@PathVariable(name = "name") String name) {
        pokemonService.deletePokemon(name);
    }
}
