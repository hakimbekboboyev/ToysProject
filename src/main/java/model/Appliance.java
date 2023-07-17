package model;

public class Appliance {

    private String colour;
    private Double price;
    private Long quantity;

    public Appliance(String colour, Double price, Long quantity) {
        this.colour = colour;
        this.price = price;
        this.quantity = quantity;
    }

    public Appliance() {

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return " {" +
                "\n\t\t'colour' : '" + colour + '\'' +
                ",\n\t\t'price' : " + price +
                ",\n\t\t'quantity' : " + quantity +
                "\n\t}";
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
