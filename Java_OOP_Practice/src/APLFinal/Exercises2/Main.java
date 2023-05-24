package APLFinal.Exercises2;

public class Main {
    public static void main (String[] args){
        Product product = new Product("Laptop",799,50);
        System.out.println(product.toString());
        Electronics electronics = new Electronics("Mouse",12,40,"Japan");
        System.out.println(electronics.toString());
        Book book = new Book(2,1.5f);
        System.out.println("Shipping cost "+ book.calculateShipping(1.5f));
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product);
        shoppingCart.addProduct(electronics);
        System.out.println(shoppingCart.getProducts());
    }
}
