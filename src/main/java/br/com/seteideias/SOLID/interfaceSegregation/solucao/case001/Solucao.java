package br.com.seteideias.SOLID.interfaceSegregation.solucao.case001;

public class Solucao {

    public interface CarrinhoQuePodeAcomodarCrianca {
        void esvazia();

        void adicionaItem(String... item);

        void acomodarCrianca(String crianca);
    }

    public interface ApenasCompras {
        void esvazia();

        void adicionaItem(String... item);
    }

    public class Cesta implements ApenasCompras {
        @Override
        public void esvazia() {
        }

        @Override
        public void adicionaItem(String... item) {
        }
    }

    public class Carrinho implements ApenasCompras {
        @Override
        public void esvazia() {
        }

        @Override
        public void adicionaItem(String... item) {
        }

    }

    public void main() throws Exception {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionaItem("MOLHO DE TOMATE");
    }


}
