package br.com.seteideias.DESING_PATTERNS.criacionais.builder.model;

public class Adress {

    private String rua;
    private String bairro;

    public Adress(){

    }

    public Adress AdressBuilder(){
        return new Adress();
    }

    public Adress rua(String nomeDaRua){
        this.rua = nomeDaRua;
        return this;
    }

    public Adress bairro(String nomeDoBairro){
        this.bairro=nomeDoBairro;
        return this;
    }

    public Adress build(){
        return this;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }
}
