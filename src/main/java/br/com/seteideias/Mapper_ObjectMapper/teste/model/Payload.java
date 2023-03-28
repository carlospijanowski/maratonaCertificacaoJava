package br.com.seteideias.Mapper_ObjectMapper.teste.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Payload {
    @JsonProperty("header")
    private List<Header> headerList;
}
