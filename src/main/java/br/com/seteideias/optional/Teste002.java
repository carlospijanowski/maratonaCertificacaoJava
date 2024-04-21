package br.com.seteideias.optional;

import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicReference;

public class Teste002 {

    public static void main(String[] args) {

        int value = 5;
        OptionalInt optionalInt = OptionalInt.empty();

        if (optionalInt.isPresent()) {
            int valor = optionalInt.getAsInt();
            System.out.println("Valor presente: " + valor);
        } else {
            System.out.println("OptionalInt vazio");
        }

        AtomicReference<String> teste = new AtomicReference<>("");

        optionalInt.ifPresentOrElse(it-> {
                    teste.set(getOpaaa("no if"));
                },
                () -> {
                    teste.set(getOpaaa("no else"));
                });

    }

    private static String getOpaaa(String str) {
        System.out.printf(str);
        return str;
    }

}
