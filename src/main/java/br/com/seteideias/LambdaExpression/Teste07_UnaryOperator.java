package br.com.seteideias.LambdaExpression;

import java.util.function.UnaryOperator;

public class Teste07_UnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> i = n -> n*2;
        UnaryOperator<Integer> i2 = n -> n+2;

        Integer integer = i.andThen(i2).apply(2);
        System.out.println(integer);
    }
}
