package br.com.seteideias.Anotacoes.criandoAnotacoes.teste;

import lombok.Data;


public class Teste003 {
    @Data
    public class Pessoa {
        private String nome;
    }

    public class Zumbi extends Pessoa {

    }

    String trazerZumbi() {
        Zumbi zumbi = new Zumbi();
        zumbi.setNome("Zumbizasso");
        return zumbi.getNome();
    }

    public static void main(String[] args) {
        String s = new Teste003().trazerZumbi();
        System.out.println("MAIN-> " + s);
    }

}
