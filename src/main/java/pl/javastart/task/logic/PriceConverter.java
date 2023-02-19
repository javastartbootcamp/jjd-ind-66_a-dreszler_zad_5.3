package pl.javastart.task.logic;

import pl.javastart.task.model.Product;

public class PriceConverter {
    private final double foodTaxRate = 0.1;
    private final double electronicsTaxRate = 0.2;
    private final double defaultTaxRate = 0.23;
    private final String food = "jedzenie";
    private final String electronics = "elektronika";

    public double getGrossPrice(Product product) {
        String category = product.getCategory();
        double netPrice = product.getNetPrice();

        double grossPrice = switch (category) {
            case food -> netPrice * (1 + foodTaxRate);
            case electronics -> netPrice * (1 + electronicsTaxRate);
            default -> netPrice * (1 + defaultTaxRate);
        };

        return Math.round(grossPrice * 100) / 100.0;
    }

    public String getExtendedProductInfo(Product product) {
        return product.getProductInfo() + "\nCena brutto: " + getGrossPrice(product);
    }
}
