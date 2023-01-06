package br.com.seteideias.Anotacoes.criandoAnotacoes.model;

import br.com.seteideias.Anotacoes.criandoAnotacoes.annotations.AnotacaoNoField;
import br.com.seteideias.Anotacoes.criandoAnotacoes.annotations.MuitoImportante;
import lombok.Data;

@MuitoImportante
@Data
public class Mouse {

    @AnotacaoNoField
    private String nome;
    public Mouse(String nome) {
        this.nome = nome;
    }


    public void fazeBarulho(){
        System.out.println("BEM BAIXINHO O BARULHO");
    }

    public void comeOque(){
        System.out.println("COME RACAO");
    }

}
