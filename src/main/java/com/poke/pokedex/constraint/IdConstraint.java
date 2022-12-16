package com.poke.pokedex.constraint;

import com.poke.pokedex.constraint.validator.IdConstraintValidator;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = {IdConstraintValidator.class})
public @interface IdConstraint {
    String message() default "L'id est égale à zéro";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
