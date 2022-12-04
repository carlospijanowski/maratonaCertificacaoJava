package br.com.seteideias.Jackson.service;

import br.com.seteideias.Jackson.dto.CarDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CarService {

    public String javaToString(CarDto carDto) throws JsonProcessingException {
        ObjectMapper m = new ObjectMapper();
        return new ObjectMapper().writeValueAsString(carDto);
    }

    public CarDto jsonToJava(String stringJson) throws JsonProcessingException {
        ObjectMapper m = new ObjectMapper();
        return new ObjectMapper().readValue(stringJson, CarDto.class);
    }

    public String jsonNode(String json) throws JsonProcessingException {
        JsonNode jsonNode = new ObjectMapper().readTree(json);
        return jsonNode.get("model").asText();
    }

}
