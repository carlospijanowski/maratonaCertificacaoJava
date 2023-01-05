package br.com.seteideias.SOLID.singleResponsability.problema.case001;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Mensagem {

    private int id;
    private String tipoDoFormato;
    private String remetente;

    public String converte(String formatoDaMensagem) {
        if (Objects.equals(formatoDaMensagem, "json")) {
            return "implementacao para o formato Json";
        } else {
            return "implementacao para o formato XML";
        }
    }

}
