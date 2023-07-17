package dto;

import model.Appliance;

public class AllProduct {
    private Long id;
    private String name;
    private String category;
    private String colour;
    private Double price;
    private Long quantity;

    public AllProduct(Long id, String name, String category, String colour, Double price, Long quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.colour = colour;
        this.price = price;
        this.quantity = quantity;
    }

    public AllProduct() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
