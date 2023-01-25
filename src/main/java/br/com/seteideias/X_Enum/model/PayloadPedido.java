package br.com.seteideias.X_Enum.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PayloadPedido {

    private String id;
    @JsonProperty("chega_numero")
    private String numeroDeTransporte;
    private boolean boleano;


}
