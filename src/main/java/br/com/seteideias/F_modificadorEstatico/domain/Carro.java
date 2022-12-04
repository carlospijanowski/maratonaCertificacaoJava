package br.com.seteideias.F_modificadorEstatico.domain;

public class Carro {

    private String nome;
    private double velocidadeMaxima;
    public static double velociadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima=velocidadeMaxima;
    }

    public void imprime(){
        System.err.println("--------------------------------------------");
        System.err.println("nome do carro.: "+this.nome);
        System.err.println("nome do velocidade Maxima.: "+this.velocidadeMaxima);
        System.err.println("nome do velociade Limite.: "+Carro.velociadeLimite);
    }


}
