package br.com.seteideias.optional;

import java.util.*;
import java.util.stream.Collectors;

public class Teste001 {

    public static void main(String[] args) {

        String json = "{\n" +
                "  \"header\":[\n" +
                "    {\n" +
                "      \"key\" : \"chave1\",\n" +
                "      \"value\" : \"valor1\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"key\" : \"chave2\",\n" +
                "      \"value\" : \"valor2\"\n" +
                "    }\n" +
                "  ]" +
                "\n" +
                "}";

//        Map<String, String> map = new HashMap<>();
//        List<String> stringsList = Arrays.asList("key1", "value1", "key2", "value2");
//        System.out.println("");
//        Stream<String> stream = stringsList.stream().filter(e -> e.equals("key1"));


        HashMap<String, String> map = new HashMap<>();
        List<String> strings = Arrays.asList("key1", "key2");
        Map<String, String> collect = strings.stream()
                .collect(Collectors.toMap(e -> e, e -> e));
        String key1 = collect.get("key1");
        System.out.println(key1);


    }


}
