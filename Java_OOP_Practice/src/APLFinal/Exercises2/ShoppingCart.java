package APLFinal.Exercises2;

import java.util.ArrayList;

public class ShoppingCart {
    public ArrayList<Product> products;
    public ShoppingCart() {
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
}
