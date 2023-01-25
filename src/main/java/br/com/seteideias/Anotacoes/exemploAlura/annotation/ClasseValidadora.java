package br.com.seteideias.Anotacoes.exemploAlura.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;

public class ClasseValidadora implements ConstraintValidator<Validador, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        Class<?> classe = constraintValidatorContext.getClass();
        for (Field field : classe.getDeclaredFields()) {
            if (field.isAnnotationPresent(Validador.class)) {
                Validador validador = field.getAnnotation(Validador.class);
                try {
                    field.setAccessible(true);
                    String order = (String) field.get(constraintValidatorContext);
                    System.out.println("PASSANDO AQUI 1");
                    return order.contains("RE");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("PASSANDO AQUI 2");
        return false;
    }
}
