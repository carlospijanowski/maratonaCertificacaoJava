package br.com.seteideias.InterfacesFuncionais;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Teste01_BinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> calc = (x, y) -> (x + y);
        Integer apply = calc.apply(5, 2);
        System.out.println(apply);

        BinaryOperator<Integer> soma = Integer::sum;
        System.out.println(soma);

        Consumer<String> stringConsumer = x -> System.out.println(x);
        stringConsumer.accept("Carlos");

        UnaryOperator<Double> calcularImposto = x -> x * 1.1;
        Double aDouble = calcularImposto.apply(10.0);
        System.out.println("IMPOSTO CALCULADO.: " + aDouble);

    }
}
