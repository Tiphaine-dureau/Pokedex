package com.poke.pokedex.service.impl;

import com.poke.pokedex.model.Ability;
import com.poke.pokedex.repository.AbilityRepository;
import com.poke.pokedex.service.AbilityService;
import org.springframework.stereotype.Service;

@Service
public class AbilityServiceImpl implements AbilityService {
    private final AbilityRepository abilityRepository;

    public AbilityServiceImpl(AbilityRepository abilityRepository) {
        this.abilityRepository = abilityRepository;
    }

    @Override
    public Ability getAbilityById(Long id) {
        return abilityRepository.findById(id).orElse(null);
    }

    @Override
    public void createAbility(Ability ability) {
        abilityRepository.save(ability);

    }
}
