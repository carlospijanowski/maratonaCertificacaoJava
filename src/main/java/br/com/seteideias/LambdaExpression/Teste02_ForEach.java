package br.com.seteideias.LambdaExpression;

import java.util.List;

public class Teste02_ForEach {
    public static void main(String[] args) {

        List<String> stringList = List.of("BIA", "ZEC", "LEO");

        //exemplo 1
        stringList.forEach(e-> System.out.println(e));
        //method Reference
        stringList.forEach(System.out::println);

//        exemplo2
        stringList.forEach(Teste02_ForEach::stringComplementar);
    }

    private static String stringComplementar(String nome){
        return nome + "!!!!!!!";
    }
}
