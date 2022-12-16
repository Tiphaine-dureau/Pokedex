package com.poke.pokedex.api;

import com.poke.pokedex.model.Ability;
import com.poke.pokedex.service.AbilityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_ABILITY)
public class AbilityController {

    private AbilityService abilityService;

    public AbilityController(AbilityService abilityService) {
        this.abilityService = abilityService;
    }

    @GetMapping("{id}")
    public Ability getAbilityById(@PathVariable(name = "id") Long id){
        return abilityService.getAbilityById(id);
    }

    @PostMapping
    public void createAbility(@RequestBody Ability ability){
        abilityService.createAbility(ability);
    }
}
