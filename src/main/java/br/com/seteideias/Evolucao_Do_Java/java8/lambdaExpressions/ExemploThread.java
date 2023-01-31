package br.com.seteideias.Evolucao_Do_Java.java8.lambdaExpressions;

public class ExemploThread {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 1 em execucao ");
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> System.out.println("Thread 2 em execucao"));
        thread2.start();


    }

}
