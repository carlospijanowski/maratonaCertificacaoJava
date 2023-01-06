package br.com.seteideias.SOLID.interfaceSegregation.problema.case001;

public class Problema {

    public interface CarrinhoDeCompra{
        void esvazia();
        void adicionaItem(String... item);
        void acomodarCrianca(boolean crianca) throws Exception;
    }

    public static class CarrinhoDeSupermercadoComAssentoParaCrianca implements CarrinhoDeCompra{
        @Override
        public void esvazia() {
        }
        @Override
        public void adicionaItem(String... item) {
        }
        @Override
        public void acomodarCrianca(boolean crianca) {
        }
    }

    public static class Cesta implements CarrinhoDeCompra{
        @Override
        public void esvazia() {
        }
        @Override
        public void adicionaItem(String... item) {
        }
        @Override
        public void acomodarCrianca(boolean crianca) throws Exception {
            throw new Exception("eita... nao pode colocar uma crianca dentro do carrinho");
        }
    }

    public void main() throws Exception {
        new Cesta().acomodarCrianca(true);
    }
}
