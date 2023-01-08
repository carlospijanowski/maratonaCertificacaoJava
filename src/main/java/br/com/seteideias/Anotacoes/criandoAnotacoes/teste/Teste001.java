package br.com.seteideias.Anotacoes.criandoAnotacoes.teste;

import br.com.seteideias.Anotacoes.criandoAnotacoes.annotations.DispareImediatamente;
import br.com.seteideias.Anotacoes.criandoAnotacoes.annotations.MuitoImportante;
import br.com.seteideias.Anotacoes.criandoAnotacoes.model.Mouse;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.System.out;

public class Teste001 {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

//        @SuppressWarnings("sem uso")
        Mouse mouse = new Mouse("Cremosinha");

        out.println("TEM ANOTACAO NO FIELD");

        if (mouse.getClass().isAnnotationPresent(MuitoImportante.class)) {
            out.println("TEM MUITO IMPORTANTE");
        } else {
            out.println("NAO TEM MUITO IMPORTANTE");
        }


        for (Method declaredMethods : mouse.getClass().getDeclaredMethods()){
            if(declaredMethods.isAnnotationPresent(DispareImediatamente.class)){
                declaredMethods.invoke(mouse);
            }
        }

    }

}
