package br.com.seteideias.Mapper_ObjectMapper.teste;

import br.com.seteideias.Mapper_ObjectMapper.teste.model.Payload;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste001 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Payload o = objectMapper.readValue(payload(), Payload.class);
            Map<String, String> map = new HashMap<>();

            o.getHeaderList().forEach(header -> map.put(header.getKey(), header.getValue()));

            System.out.println(map);

            List<String> list = new ArrayList<>();

            map.forEach((s, s2) -> {list.add(s);list.add(s2);});

            System.out.println(list);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String payload() {
        return "{" +
                "  \"header\":[" +
                "    {" +
                "      \"key\" : \"chave1\"," +
                "      \"value\" : \"valor1\"" +
                "    }," +
                "    {" +
                "      \"key\" : \"chave2\"," +
                "      \"value\" : \"valor2\"" +
                "    }" +
                "  ]" +
                "" +
                "}";
    }
}
