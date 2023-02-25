package pl.javastart.task.app;

import pl.javastart.task.logic.PriceConverter;
import pl.javastart.task.model.Product;

public class Main {

    public static void main(String[] args) {
        PriceConverter priceConverter = new PriceConverter();
        Product product1 = new Product("Chleb", "Pyszny chleb", 5.99, "jedzenie");
        Product product2 = new Product("PSP", "Przenośna konsola do gier", 1000, "elektronika");
        Product product3 = new Product("Odkurzacz", "Odkurzacz przemysłowy Karcher", 500);

        System.out.println(priceConverter.getExtendedProductInfo(product1));
        System.out.println(priceConverter.getExtendedProductInfo(product2));
        System.out.println(priceConverter.getExtendedProductInfo(product3));
    }
}
