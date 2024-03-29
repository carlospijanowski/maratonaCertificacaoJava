package br.com.seteideias.Anotacoes.criandoAnotacoes.teste;

import br.com.seteideias.Anotacoes.criandoAnotacoes.annotations.AnotacaoNoField;
import br.com.seteideias.Anotacoes.criandoAnotacoes.annotations.MuitoImportante;
import br.com.seteideias.Anotacoes.criandoAnotacoes.model.Mouse;

import static java.lang.System.out;

@interface seila{

}



public class Teste001 {

    public static void main(String... args) {

        @SuppressWarnings("sem uso")
        Mouse cremosinha = new Mouse("Cremosinha");

        cremosinha.getClass().getDeclaredAnnotations();
            out.println("TEM ANOTACAO NO FIELD");

        if (cremosinha.getClass().isAnnotationPresent(MuitoImportante.class)) {
            out.println("TEM MUITO IMPORTANTE");
        } else {
            out.println("NAO TEM MUITO IMPORTANTE");
        }

    }

}
