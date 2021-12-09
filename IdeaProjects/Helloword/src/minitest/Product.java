package minitest;

public class Product {
 private String id;
 private String name;
 private double price;
 private String type;
 private String usd;
 public Product () {
 }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getUsd() {
        return usd;
    }

    public Product (String id, String name, double Price, String type, String usd) {

 }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", usd='" + usd + '\'' +
                '}';
    }
}

