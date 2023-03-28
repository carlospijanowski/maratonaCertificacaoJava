package br.com.seteideias.restTemplate;

import br.com.seteideias.restTemplate.model.JsonHeader;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.http.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Teste001 {

    public static void main(String[] args) throws IOException {

        new ObjectMapper().readValue(payload(), JsonHeader.class);

    }
    private static String payload(){
        return  "{" +
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
