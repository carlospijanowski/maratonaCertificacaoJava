package br.com.seteideias.Anotacoes.criandoAnotacoes.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidadorDeNome implements ConstraintValidator<LivreOpiniao,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.equalsIgnoreCase("CARLOS");
    }
}
