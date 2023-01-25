package br.com.seteideias.Anotacoes.criandoAnotacoes.teste;

import lombok.Data;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface TestAnnotation {
    String Developer() default "Rahul";

    String Expirydate();
}

public class Teste002 {

    @Data
    public class Pessoa{
        @TestAnnotation(Expirydate = "01-10-2020")
        private String Developer;
    }

    void fun1() {
        Pessoa pessoa = new Pessoa();
//        pessoa.setDeveloper("Carlos");
        System.out.println("pessoa-> "+pessoa.getDeveloper());
    }


    public static void main(String args[]) {
        new Teste002().fun1();
    }

}
