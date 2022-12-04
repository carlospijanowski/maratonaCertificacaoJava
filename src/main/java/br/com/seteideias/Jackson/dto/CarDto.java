package br.com.seteideias.Jackson.dto;

public class CarDto {

    private String id;
    private String model;
    private String color;

    public CarDto(){

    }
    public CarDto(String id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
