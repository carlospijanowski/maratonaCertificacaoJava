package br.com.seteideias.CompletableFuture;

import org.springframework.scheduling.annotation.Async;

import java.time.Instant;
import java.util.Timer;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public class Teste001 {


    public static void main(String[] args) throws InterruptedException, ExecutionException {

        inicioDeOperacao();

    }

    private static String inicioDeOperacao() throws InterruptedException, ExecutionException {


        Teste001 instance = new Teste001();

        CompletableFuture<String> a = instance.processarPagamento();
        CompletableFuture<String> b = instance.dandoBaixaNoEstoque();

        System.out.println("MANDEI FAZER OS PROCESSOS");

        CompletableFuture.allOf(a, b).join();

        System.out.println(Instant.now() +" tudo feito " + a.get() + b.get());

        return  a.get() + b.get() ;
    }


    private CompletableFuture<String>processarPagamento() throws InterruptedException {
        System.out.println(Instant.now() +" iniciou processarPagamento");
        return CompletableFuture.supplyAsync(()-> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "PAGAMENTO FEITO COM SUCESSO";

        });
    }

    private CompletableFuture<String>dandoBaixaNoEstoque() throws InterruptedException {
        System.out.println(Instant.now() +" iniciou dandoBaixaNoEstoque");
        return CompletableFuture.supplyAsync(()-> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "BAIXA EXECUTADA COM SUCESSO";
        });
    }

}
