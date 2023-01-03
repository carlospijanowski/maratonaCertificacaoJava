package br.com.seteideias.Jackson.dto;

public class CarDto {

    private String id;
    private String model;
    private String color;

    private Proprietario proprietario;

    public CarDto(){

    }
    public CarDto(String id, String model, String color, Proprietario proprietario) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.proprietario = proprietario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  String getModel(){
        return this.model;
    }

    @Override
    public String toString() {
        return "{" +
                " \"id\" : \"" + id + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
