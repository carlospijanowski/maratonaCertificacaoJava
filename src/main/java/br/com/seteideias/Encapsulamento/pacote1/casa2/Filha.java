package br.com.seteideias.Encapsulamento.pacote1.casa2;

import br.com.seteideias.Encapsulamento.pacote2.casa1.Sogra;
import br.com.seteideias.Encapsulamento.pacote2.casa1.Sogro;

public class Filha extends Sogra {
    String segredoDoCasal = "meu Marido Esta Quase Sendo Demitido";

    public static void main(String[] args) {

        Filha euMesma = new Filha();
        System.out.println("meus pais nao sabem.: "+euMesma.segredoDoCasal);
        System.out.println("meus pais nao sabem.: "+euMesma.segredoDeFamilia);

//        Genro meuMarido = new Genro();
//        System.out.println(meuMarido.);

        Sogro papai = new Sogro();
        System.out.println(papai.gostaDeBrejola);

//        Sogra mamae = new Sogra();
//        System.out.println(mamae.);

    }
}
