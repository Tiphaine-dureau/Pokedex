package com.poke.pokedex.constraint.validator;

import com.poke.pokedex.constraint.AbilityConstraint;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AbilityConstraintValidator implements ConstraintValidator<AbilityConstraint, String> {
    @Override
    public void initialize(AbilityConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String label, ConstraintValidatorContext constraintValidatorContext) {
        return !StringUtils.hasLength(label);
    }
}
