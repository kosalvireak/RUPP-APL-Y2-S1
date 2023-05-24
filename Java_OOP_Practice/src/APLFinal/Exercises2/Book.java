package APLFinal.Exercises2;

public class Book implements Shipping{
    public float pricePerPound;
    public float weight;


    @Override
    public float calculateShipping(float weight) {
        return weight * pricePerPound;
    }

    public Book(float pricePerPound, float weight) {
        this.pricePerPound = pricePerPound;
        this.weight = weight;
    }

    public float getPricePerPound() {
        return pricePerPound;
    }

    public void setPricePerPound(float pricePerPound) {
        this.pricePerPound = pricePerPound;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
