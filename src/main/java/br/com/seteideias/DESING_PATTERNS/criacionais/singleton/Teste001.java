package br.com.seteideias.DESING_PATTERNS.criacionais.singleton;

public class Teste001 {

    public static void main(String[] args) {

        ConfigurationApi instance1 = ConfigurationApi.getInstance();
        ConfigurationApi instance2 = ConfigurationApi.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);

    }

}
