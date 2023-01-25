package br.com.seteideias.Encapsulamento.pacote1.casa2;

import br.com.seteideias.Encapsulamento.pacote2.casa1.Sogro;

public class Genro {
private String segredo = "minha sogra fala de mais";


    public static void main(String[] args) {

        Genro genro = new Genro();
        System.out.println("segredo do genro.: "+genro.segredo);

        Filha minhaQueridaEsposa = new Filha();
        System.out.println(minhaQueridaEsposa.segredoDoCasal);

        Sogro sogro = new Sogro();
        System.out.println(sogro.gostaDeBrejola);

//        Sogra sogra = new Sogra();
//        System.out.println(sogra.);
    }

}
