package br.com.seteideias.COLECOES.flatMap;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class FlatMapTes {

    public static void main(String[] args) {

        List<List<String>>listaDePessoas = new ArrayList<>();

        List<String> pessoa1 = asList("Carlos", "Cartaxo");
        List<String> pessoa2 = asList("Laura", "Pijanowski");

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);

        System.out.println(listaDePessoas);

        Stream<String> stringStream = listaDePessoas.stream().flatMap(e -> e.stream());

        List<String> collect = stringStream.collect(Collectors.toList());
        System.out.println(collect);

        Supplier<List<String>>sup = () -> asList("1","2");

        System.out.println(sup.get());
        List<String> list = asList("1", "2");

    }



}
