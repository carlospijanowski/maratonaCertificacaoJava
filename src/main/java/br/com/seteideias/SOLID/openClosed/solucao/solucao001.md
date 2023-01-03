
class PRINCIPAL { 

    @injecao 
    AplicacaoService service;
 
    service.integra(Integrador integrador);
the code never lies
}


class AplicacaoService {
 
    void integra () { 
        new Integrador().mandarEmail(); 
    }
 
}

interface Integrador {

    integrar();

}

class IntegradorEmail implements Integrador {

    void integrar() {
        logica para enviar o email 
    }   

} 

class IntegradorSMS implements Integrador {

    void integrar() {
        logica para enviar o sms 
    }   

}

