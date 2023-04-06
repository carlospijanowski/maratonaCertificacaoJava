package br.com.seteideias.Exceptions_Java;

public class Teste01 {

    public static void main(String[] args) {

        int i = calculoDivisao(5, 0);
        System.out.println(i);

    }

    private static int calculoDivisao(int a, int b) {
//        try{
            return   a /b;
//
//        }catch (ArithmeticException e){
//            throw e;
//        }
    }

}
