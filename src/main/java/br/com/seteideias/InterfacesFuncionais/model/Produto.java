package br.com.seteideias.InterfacesFuncionais.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Produto {
    private String nome;
    private double preco;
}
