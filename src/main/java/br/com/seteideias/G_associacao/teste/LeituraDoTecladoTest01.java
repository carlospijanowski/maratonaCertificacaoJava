package br.com.seteideias.G_associacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {

    public static void main(String... args){

        Scanner entrada = new Scanner(System.in);
        System.err.println("digite algo abaixo");
        String nome = entrada.nextLine();
        System.err.println("digite a sua idade abaixo");
        String idade = entrada.nextLine();
        System.err.println("seu nome é.: "+nome+ " e sua idade é.: "+idade);


        int i = Math.subtractExact(10, 5);
        System.out.println(i);


    }

}
