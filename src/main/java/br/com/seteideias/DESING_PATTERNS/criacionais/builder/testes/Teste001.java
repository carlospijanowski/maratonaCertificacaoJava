package br.com.seteideias.DESING_PATTERNS.criacionais.builder.testes;

import br.com.seteideias.DESING_PATTERNS.criacionais.builder.model.Adress;

public class Teste001 {
    public static void main(String[] args) {

        Adress build = new Adress().AdressBuilder()
                .rua("rua tal")
                .bairro("bairroso")
                .build();

        System.out.println(build.getBairro());

    }
}
