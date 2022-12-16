package com.poke.pokedex.constraint.validator;

import com.poke.pokedex.constraint.IdConstraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdConstraintValidator implements ConstraintValidator<IdConstraint, Long> {
    @Override
    public void initialize(IdConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Long id, ConstraintValidatorContext constraintValidatorContext) {
        return id !=0;
    }
}
