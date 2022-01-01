package Model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private String supply;

    public Product(int id, String name, double price, String description, String supply) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.supply = supply;
    }
    public Product(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }
}
