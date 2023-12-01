package br.com.seteideias.Interfaces_Funcionais.funcional;

public class Teste001 {

    public static void main(String[] args) {

        Object apply = new FuncioanlImpl().apply("500");


        if(apply instanceof Boolean && ((Boolean) apply).booleanValue() == true){
            System.out.println("bool");
        }

    }
}
