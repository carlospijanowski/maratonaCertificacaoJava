package br.com.seteideias.X_Enum.exemplo_001;

import br.com.seteideias.X_Enum.model.PayloadPedido;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Teste001 {

    static class RepositorioService{
       public static void salvar(PayloadPedido pedido){
           System.out.println("SALVO NO BANCO");
       }

    }

    public static void main(String[] args) throws JsonProcessingException {

        //language=JSON
        String entradaDoPayloadViaController = "{\n" +
                "  \"id\" " +
                " : \"123\", \n" +
                "  \"chega_numero\" : \"sei la\",\n" +
                "  \"boleano\" : true\n" +
                "}";

        Teste001.RepositorioService.salvar(null);



    }



}
