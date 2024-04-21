package br.com.seteideias.map_e_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste001 {

    public static void main(String[] args) throws InterruptedException {

        Optional<String> s = Optional.of("test para maiusculo");
        s.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("********************************************************************");

        List<String> stringList = List.of("a", "b");
        stringList.stream().map(cada->cada.toUpperCase()).forEach(System.out::println);

        Teste001 teste001 = new Teste001();

        System.out.println(teste001.getSegmentacoesNavegaveis());
    }

    public List<String> getSegmentacoesNavegaveis() throws InterruptedException {

        List<String> paisLista = List.of("Carlos", "Tatiana");
        List<String> filhasLista = List.of("Julia", "Laura");

        List<List<String>> lista = List.of(paisLista, filhasLista);

        System.out.println("lista tamanho.: "+lista.size());

        List<String> collect = lista.stream().flatMap(strings -> strings.stream()).collect(Collectors.toList());

        System.out.println("nova lista tamanho.: "+collect.size());


        System.out.println("*************************");
        List<String> strings = lista.stream()
                .flatMap(paracada -> paracada.stream().map(e -> e.toUpperCase()+ " PIJANOWSKI"))
                .toList();
        System.out.println("strings   .: "+strings);
        System.out.println("strings   .: "+strings.size());


        Thread.sleep(20);
        return List.of("so retornando");
    }



}
