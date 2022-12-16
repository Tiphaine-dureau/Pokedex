package com.poke.pokedex.service;

import com.poke.pokedex.model.Ability;

public interface AbilityService {

    Ability getAbilityById(Long id);

    void createAbility(Ability ability);
}
