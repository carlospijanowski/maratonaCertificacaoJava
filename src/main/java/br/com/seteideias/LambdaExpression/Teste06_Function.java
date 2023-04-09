package br.com.seteideias.LambdaExpression;

import br.com.seteideias.LambdaExpression.model.Produto;

import java.util.function.Function;

public class Teste06_Function {
    public static void main(String[] args) {
        String letra = "N";
        Function<Produto,Boolean>booleanFunction=x->x.getNome().startsWith(letra);

        Produto produto = new Produto("Notebook", 1500.00);
        Produto produto2 = new Produto("Mesa", 500.00);
        Boolean aBoolean = booleanFunction.apply(produto);
        Boolean aBoolean2 = booleanFunction.apply(produto2);
        System.out.println("COMECAO COM "+letra+" ? -> "+ aBoolean);
        System.out.println("COMECAO COM "+letra+" ? -> "+ aBoolean2);

    }
}
