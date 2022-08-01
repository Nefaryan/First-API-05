package it.devehope.First.API05.DTO;

import lombok.Data;

import javax.validation.constraints.NotBlank;


public class CarDTO {


    @NotBlank(message = "Mandatory")
    private String id;
    @NotBlank(message = "Mandatory")
    private String modelName;
    private Double carPrice;

    public CarDTO(String id, String modelName, Double carPrice) {
        this.setId(id);
        this.setModelName(modelName);
        this.setCarPrice(carPrice) ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id='" + getId() + '\'' +
                ", modelName='" + getModelName() + '\'' +
                ", carPrice=" + getCarPrice() +
                '}';
    }
}
