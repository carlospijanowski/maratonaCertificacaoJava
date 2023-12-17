package br.com.seteideias.InterfacesFuncionais;

import br.com.seteideias.InterfacesFuncionais.model.Produto;

import java.util.function.Consumer;

public class Teste05_Consumer {
    public static void main(String[] args) {

        Consumer<Produto>produtoConsumer= Teste05_Consumer::imprimir;
//        Consumer<Produto>produtoConsumer= produto -> imprimir(produto);

        Produto tela = new Produto("Tela", 15.50);
        produtoConsumer.accept(tela);

    }

    public static void imprimir (Produto p){
        System.out.println("Produto -> "+p.getNome());
    }
}
