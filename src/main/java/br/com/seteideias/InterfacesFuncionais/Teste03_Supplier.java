package br.com.seteideias.InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Teste03_Supplier {
    public static void main(String[] args) {

        Supplier<List<String>> pessoaSupplier = () -> Arrays.asList("Carlos","Charles");
        System.out.println(pessoaSupplier.get());

        Supplier<Double> randomSupplier = Math::random;
        Supplier<Double> randomSupplier2 = () -> Math.random();

        // Usando o Supplier para obter um número aleatório
        double randomNum = randomSupplier.get();
        System.out.println("Número aleatório: " + randomNum);

    }
}
