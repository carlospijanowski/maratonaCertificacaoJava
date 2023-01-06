package br.com.seteideias.SOLID.singleResponsability.problema.case001;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Problema {

    @Getter
    @Setter
    public class Mensagem_DtoOuEntity {
        private int id;
        private String tipoDoFormato;
        private String remetente;

        public String conversor(String formatoDaMensagem) {
            if (Objects.equals(formatoDaMensagem, "json")) {
                return "implementacao para o formato Json";
            } else {
                return "implementacao para o formato XML";
            }
        }
    }

    public void main() {
        String tipoDaMensagem = new Mensagem_DtoOuEntity().conversor("json");
    }

}
