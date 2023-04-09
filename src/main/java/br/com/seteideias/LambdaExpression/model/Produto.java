package br.com.seteideias.LambdaExpression.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Produto {
    private String nome;
    private double preco;
}
