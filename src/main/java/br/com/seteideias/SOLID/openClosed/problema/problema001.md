
class PRINCIPAL { 

    @injecao 
    AplicacaoService service;
 
    service.integraViaEmail();

}


class AplicacaoService {
 
    void integraViaEmail () { 
        new Integrador().mandarEmail(); 
    }
 
}

class Integrador {

    void mandarEmail() {
        logica para enviar o email 
    }   

} 