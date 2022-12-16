package com.poke.pokedex.model;

import com.poke.pokedex.constraint.AbilityConstraint;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Ability {
    @Id
    @SequenceGenerator(name = "ability_sequence", sequenceName = "ability_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ability_sequence")
    @Column(name = "ability_id", updatable = false)
    private Long id;

    @AbilityConstraint
    private String label;
    private Long powerful;

    public Ability() {
    }

    public Ability(String label, Long powerful) {
        this.label = label;
        this.powerful = powerful;
    }

    public Ability(Long id, String label, Long powerful) {
        this.id = id;
        this.label = label;
        this.powerful = powerful;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getPowerful() {
        return powerful;
    }

    public void setPowerful(Long powerful) {
        this.powerful = powerful;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || Hibernate.getClass(this) != Hibernate.getClass(object)) return false;
        Ability ability = (Ability) object;
        return id != null && Objects.equals(id,ability.id);
    }

    @Override
    public int hashCode(){
        return getClass().hashCode();
    }
}
