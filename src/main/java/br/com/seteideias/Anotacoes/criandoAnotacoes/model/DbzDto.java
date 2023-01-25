package br.com.seteideias.Anotacoes.criandoAnotacoes.model;

import br.com.seteideias.Anotacoes.criandoAnotacoes.annotations.LivreOpiniao;
import lombok.Getter;
import lombok.Setter;


public class DbzDto {

    @LivreOpiniao
    private String nomePersonagem;

    public void nomePeloMetodo(String nomePersonagem){
        this.nomePersonagem = nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }
}
