package br.com.seteideias.Evolucao_Do_Java.java8.lambdaExpressions;

interface Figura {
    void desenha();
}

interface Natacao{
    public abstract void nada(boolean ex);
}

public class Exemplo01 {

    public static void main(String[] args) {
        Figura figura = new Figura() {
            @Override
            public void desenha() {
                System.out.println("Desenha!!!");
            }
        };
        figura.desenha();

        Figura figura2 = () -> System.out.println("desenha figura 2 no console");
        figura2.desenha();



    }

}
