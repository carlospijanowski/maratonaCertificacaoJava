package br.com.seteideias.Anotacoes.exemploAlura.annotation;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ClasseValidadora.class)
public @interface Validador {
    String orderNumber() default "RE";
}
