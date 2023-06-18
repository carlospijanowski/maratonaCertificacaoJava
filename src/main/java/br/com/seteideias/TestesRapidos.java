package br.com.seteideias;

import java.util.function.Predicate;

public class TestesRapidos {
    public static void main(String[] args) {

        Predicate<String> p = parametroEntrada -> parametroEntrada.startsWith("C");

        boolean test = p.test("Carlos");
        System.out.println(test);


    }
}