package APLFinal.Exercises2;

public class Electronics extends Product{
    public String manufacturer;

    public Electronics(String name, float price, Integer quantity, String manufacturer) {
        super(name, price, quantity);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", manufacturer: " + manufacturer ;
    }
}
