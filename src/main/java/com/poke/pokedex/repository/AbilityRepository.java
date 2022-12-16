package com.poke.pokedex.repository;

import com.poke.pokedex.model.Ability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilityRepository extends JpaRepository<Ability, Long> {
}
