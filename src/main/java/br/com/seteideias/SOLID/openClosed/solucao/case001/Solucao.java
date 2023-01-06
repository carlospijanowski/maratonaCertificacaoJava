package br.com.seteideias.SOLID.openClosed.solucao.case001;

public class Solucao {

    public void main( ) {
         new AplicacaoService(new IntegrarEmail());
    }

    public class AplicacaoService {

        private Integrador integrador;

        public AplicacaoService(Integrador integrador) {
            this.integrador = integrador;
        }

    }

    public interface Integrador {
        void enviar();
    }

    public class IntegrarEmail implements Integrador{

        @Override
        public void enviar() {
            //IMPLEMENTACOES DE ENVIO DE EMAIL
        }
    }

    public class IntegrarSms implements Integrador{

        @Override
        public void enviar() {

        }
    }

    public class IntegrarPorWhatsApp implements Integrador{

        @Override
        public void enviar() {

        }
    }

}
