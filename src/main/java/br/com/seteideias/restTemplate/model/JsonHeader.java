package br.com.seteideias.restTemplate.model;

import lombok.Data;

import java.util.List;

@Data
public class JsonHeader {
    private List<Header> headerList;
}
