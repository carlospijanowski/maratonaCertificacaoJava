package br.com.seteideias.Reflexao_Meta_Programacao.model.teste;

import java.lang.reflect.Constructor;

public class Teste001 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("br.com.seteideias.Reflexao_Meta_Programacao.model.Pessoa");
        var declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> x : declaredConstructors){
            System.out.println(x);
        }
    }
}
