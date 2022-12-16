package com.poke.pokedex.api;

import com.poke.pokedex.model.Pokemon;
import com.poke.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_POKEMON)
public class PokemonController {

    // Dependency inversion (soliD) : utilisation d'une interface et pas directement d'une classe concrète
    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public ModelAndView getAllPokemon() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        modelAndView.addObject("test","test succes");
        return modelAndView;
        //return pokemonService.getAllPokemon();
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
