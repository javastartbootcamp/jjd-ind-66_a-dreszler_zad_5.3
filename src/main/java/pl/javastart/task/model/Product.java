package pl.javastart.task.model;

public class Product {
    private String name;
    private String description;
    private double netPrice;
    private String category = "undefined";

    public Product(String name, String description, double netPrice, String category) {
        this(name, description, netPrice);
        this.category = category;
    }

    public Product(String name, String description, double netPrice) {
        this.name = name;
        this.description = description;
        this.netPrice = netPrice;
    }

    public String getProductInfo() {
        String productInfo = "Nazwa produktu: " + name
                + "\nOpis: " + description
                + "\nCena netto: " + netPrice;
        if (category != "undefined") {
            productInfo += "\nKategoria: " + category;
        }
        return productInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
