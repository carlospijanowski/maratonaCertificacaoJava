package br.com.seteideias.InterfacesFuncionais;

import java.util.Comparator;
import java.util.function.*;

public class TodosOsModelosImplementados {
    public static void main(String[] args) {

        System.out.println(validar("Carlos XXXXXXXXXXXXXXXXXXX"));
        System.out.println(validar("Carlos "));

        print("teste no consumer");

        print(binary(5,10));

        print(supplier("Feliz"));

        print(funcition("Carlos Pijanowski Cartaxo"));


    }


    private static boolean validar(String str){
        Predicate<String> p = x -> x.length() > 10;
        return  p.test(str);
    }

    private static void print(Object str){
        Consumer<String> consumer = x -> System.out.println("Recebi.: "+x);
        consumer.accept(str.toString());
    }

    private static Integer binary(Integer n1, Integer n2){
        BinaryOperator<Integer> teste = (x, y)->x*y;
        return teste.apply(n1,n2);
    }

    private static String supplier(String str){
        Supplier<String> supplier = () -> str + " !!!";
        return supplier.get();
    }

    private static Integer funcition(String str){
        Function<String,Integer> funcition = x-> x.trim().length();
        return funcition.apply(str);
    }

    private static void comparable(){
        Comparator<Integer> comparator = (o1, o2) -> {
            return o1>o2?o2:o1;
        };
    }

}
