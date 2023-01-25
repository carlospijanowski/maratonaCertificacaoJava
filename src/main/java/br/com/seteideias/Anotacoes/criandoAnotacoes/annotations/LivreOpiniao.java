package br.com.seteideias.Anotacoes.criandoAnotacoes.annotations;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ValidadorDeNome.class)
public @interface LivreOpiniao {
    String mensagem() default "voce esta errado";
}
