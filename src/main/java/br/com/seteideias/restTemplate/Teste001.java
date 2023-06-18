//package br.com.seteideias.restTemplate;
//
//import br.com.seteideias.restTemplate.model.JsonHeader;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.TestTemplate;
//
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.http.HttpHeaders;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Teste001 {
//
//
//    public static void main(String[] args) throws IOException {
//
//        new ObjectMapper().readValue(payload(), JsonHeader.class);
//
//
//    }
//
//
//    public void conection() throws Exception {
//// Create a neat value object to hold the URL
//        URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
//
//// Open a connection(?) on the URL(??) and cast the response(???)
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//// Now it's "open", we can set the request method, headers etc.
//        connection.setRequestProperty("accept", "application/json");
//
//// This line makes the request
//        InputStream responseStream = connection.getInputStream();
//
//// Manually converting the response body InputStream to APOD using Jackson
//        ObjectMapper mapper = new ObjectMapper();
//        APOD apod = mapper.readValue(responseStream, APOD.class);
//
//// Finally we have the response
//        System.out.println(apod.title);
//    }
//
//
//    private static String payload(){
//        return  "{" +
//                "  \"header\":[" +
//                "    {" +
//                "      \"key\" : \"chave1\"," +
//                "      \"value\" : \"valor1\"" +
//                "    }," +
//                "    {" +
//                "      \"key\" : \"chave2\"," +
//                "      \"value\" : \"valor2\"" +
//                "    }" +
//                "  ]" +
//                "" +
//                "}";
//    }
//
//}
