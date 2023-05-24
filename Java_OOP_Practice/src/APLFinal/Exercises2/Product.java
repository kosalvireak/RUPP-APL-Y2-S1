package APLFinal.Exercises2;

public class Product {
    public String name;
    public float price;
    public Integer quantity;

    public Product(String name, float price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return
                "Product_name: " + name +
                ", price: " + price +
                "$, quantity: " + quantity;
    }

}
