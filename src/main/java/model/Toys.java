package model;

public class Toys extends Appliance{
    public Toys(Long id, String name, String category, Appliance appliance) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.appliance = appliance;
    }



    private Long id;

    @Override
    public String toString() {
        return "Toys{" +
                "\n\t'id' : " + id +
                ",\n\t'name' : '" + name + '\'' +
                ",\n\t'category' : '" + category + '\'' +
                ",\n\t'appliance' :" + appliance.toString() +
                "\n}";
    }

    private String name;
    private String category;
    private Appliance appliance;


    public Toys() {

    }
}
