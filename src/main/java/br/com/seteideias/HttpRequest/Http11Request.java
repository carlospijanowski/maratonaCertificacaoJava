package br.com.seteideias.HttpRequest;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class Http11Request {
    public static void main(String[] args) {
        Http11Request.request();
    }

    public static void request(){

        String endPoint = "https://carlosteste.requestcatcher.com/test";

        List <String> configsList = new ArrayList <> ();
        configsList.add("User-Agent");
        configsList.add("RENNER-APLICATION");
        int list_size = configsList.size();
        String[] strArray = new String[list_size];
        String[] strings = configsList.toArray(strArray);

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(bodyPayload()))
                .uri(URI.create(endPoint))
                .headers(strArray)
                .build();
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpResponse<String> httpResponse;
        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println("REQUISICAO.:"+endPoint);
            System.out.println("HEADERS.: "+ Arrays.toString(strings));
        } catch (Exception e) {
        }
    }

    private static String bodyPayload() {
    return "{}";
    }

}
