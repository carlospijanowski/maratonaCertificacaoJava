package br.com.seteideias.F_modificadorEstatico.teste;

import br.com.seteideias.F_modificadorEstatico.domain.Carro;

public class CarroTeste01 {

    public static void main (String... args){

        final Carro bmw = new Carro("BMW", 280);
        final Carro mercedes = new Carro("MERCEDES", 275);
        final Carro audi = new Carro("AUDI", 290);


        Carro.velociadeLimite = 100;

        bmw.imprime();
        mercedes.imprime();
        audi.imprime();

    }

}
