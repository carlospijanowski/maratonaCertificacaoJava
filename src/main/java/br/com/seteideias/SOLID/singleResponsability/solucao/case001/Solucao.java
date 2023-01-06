package br.com.seteideias.SOLID.singleResponsability.solucao.case001;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


public class Solucao {
    @Getter
    @Setter
    public class Mensagem {
        private int id;
        private String tipoDoFormato;
        private String remetente;
    }

    public class ConversoraDeFormato {
        String formatoDaMensagemDesejada;

        public ConversoraDeFormato(String formatoDaMensagemDesejada) {
            this.formatoDaMensagemDesejada = formatoDaMensagemDesejada;
        }

        public String para(String formatoDaMensagemDesejada) {
            if (Objects.equals(formatoDaMensagemDesejada, "json")) {
                return "implementacao para o formato Json";
            } else {
                return "implementacao para o formato XML";
            }
        }
    }

    public void main() {
        ConversoraDeFormato formatoQueDesejoEnviar = new ConversoraDeFormato("json");
        //IMPLEMENTACAO DA LOGICA
    }

}
