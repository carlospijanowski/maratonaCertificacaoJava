package br.com.seteideias.LambdaExpression;

import br.com.seteideias.LambdaExpression.model.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Teste03_Supplier {
    public static void main(String[] args) {

        Supplier<List<String>> pessoaSupplier = () -> Arrays.asList("Carlos","Charles");

        System.out.println(pessoaSupplier.get());

    }
}
