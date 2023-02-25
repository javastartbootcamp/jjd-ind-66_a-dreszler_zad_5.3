package pl.javastart.task.logic;

import pl.javastart.task.model.Product;

public class PriceConverter {
    private static final double FOOD_TAX_RATE = 0.1;
    private static final double ELECTRONICS_TAX_RATE = 0.2;
    private static final double DEFAULT_TAX_RATE = 0.23;
    private static final String FOOD = "jedzenie";
    private static final String ELECTRONICS = "elektronika";

    public double getGrossPrice(Product product) {
        String category = product.getCategory();
        double netPrice = product.getNetPrice();

        double grossPrice = switch (category) {
            case FOOD -> netPrice * (1 + FOOD_TAX_RATE);
            case ELECTRONICS -> netPrice * (1 + ELECTRONICS_TAX_RATE);
            default -> netPrice * (1 + DEFAULT_TAX_RATE);
        };

        return Math.round(grossPrice * 100) / 100.0;
    }

    public String getExtendedProductInfo(Product product) {
        return product.getProductInfo() + "\nCena brutto: " + getGrossPrice(product);
    }
}
