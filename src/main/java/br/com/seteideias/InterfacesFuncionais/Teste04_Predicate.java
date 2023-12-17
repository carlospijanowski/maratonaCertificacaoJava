package br.com.seteideias.InterfacesFuncionais;

import br.com.seteideias.InterfacesFuncionais.model.Produto;

import java.util.List;
import java.util.function.Predicate;

public class Teste04_Predicate {

    public static void main(String[] args) {

        Predicate<Produto> isCaro = x -> x.getPreco() >= 1500.00;

        Produto produto = new Produto("notebook accer", 1490.00);
        Produto produto2 = new Produto("notebook hp", 1500.00);
        Produto produto3 = new Produto("notebook dell", 6500.00);

        //exemplo 1
        boolean test = isCaro.test(produto);
        System.out.println(test);

        //exemplo 2
        List<Produto> produtoList = List.of(produto, produto2, produto3);
        produtoList.forEach(e-> {
            boolean p = isCaro.test(e);
            System.out.println("RESULTADO PRODUTO "+e.getNome()+" - CARO.: "+p);
        });

        //exemplo 3
        Predicate<Integer> isPar = num -> num % 2 == 0;
        boolean test1 = isPar.test(2);
        System.out.println(test1);

        // exemplo 4 com composicao
        Predicate<Integer> isParOuImpar = x -> x % 2 == 0;
        Predicate<Integer> maiorQueCem = x -> x > 100;

        boolean test4 = isParOuImpar.and(maiorQueCem).test(102);
        System.out.println("RESULTADO DESSA EXPRESSAO.: "+test4);

        // exemplo 5 - usando um metodo
        System.out.println("IGUAL A 50 ? -> "+ igual50().test(50));



    }

    public static Predicate<Integer> igual50 () {
        return x -> x == 50;
    }

}
