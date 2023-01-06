package br.com.seteideias.SOLID.openClosed.problema.case001;

public class Problema {

    public void main() {
        new AplicacaoService().integra();
    }

    public class AplicacaoService {
        public void integra() {
//            new Integrador().integrarEmail();
            new Integrador().integrarSms();
        }

    }

    public class Integrador {
        public void integrarEmail() {
            //mandar email
        }

        public void integrarSms() {
            //mandar sms
        }

    }

}
