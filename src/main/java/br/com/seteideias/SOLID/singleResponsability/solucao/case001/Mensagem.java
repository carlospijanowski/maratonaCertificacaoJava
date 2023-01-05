package br.com.seteideias.SOLID.singleResponsability.solucao.case001;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Mensagem {

    private int id;
    private String tipoDoFormato;
    private String remetente;


    public class ConversoraDeFormato {

        public String para(String formatoDaMensagemDesejada) {
            if (Objects.equals(formatoDaMensagemDesejada, "json")) {
                return "implementacao para o formato Json";
            } else {
                return "implementacao para o formato XML";
            }
        }
    }

}
