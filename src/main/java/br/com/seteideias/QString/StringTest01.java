package br.com.seteideias.QString;

public class StringTest01 {

    public static void main(String[] args) {
        String nome = "Carlos";
        String nome2 = "Carlos";
        nome = nome2.concat(" Pijanowski");
        System.out.println(nome2 == nome);

        // essa demonstracao mostra que as strings sao imutaveis!!!
    }

}
