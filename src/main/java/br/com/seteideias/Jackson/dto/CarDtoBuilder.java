package br.com.seteideias.Jackson.dto;

public final class CarDtoBuilder {
    private String id;
    private String model;
    private String color;

    private Proprietario proprietario;

    private CarDtoBuilder() {
    }

    public static CarDtoBuilder aCarDto() {
        return new CarDtoBuilder();
    }

    public CarDtoBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public CarDtoBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    public CarDtoBuilder withProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
        return this;
    }
    public CarDtoBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public CarDto build() {
        return new CarDto(id, model, color,proprietario);
    }
}
