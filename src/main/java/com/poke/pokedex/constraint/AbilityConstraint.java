package com.poke.pokedex.constraint;

import com.poke.pokedex.constraint.validator.AbilityConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = {AbilityConstraintValidator.class})
public @interface AbilityConstraint {
    String message() default "Label vide ou null";

    Class<?>[] groups() default {};

    Class <? extends Payload> [] payload() default{};
}
