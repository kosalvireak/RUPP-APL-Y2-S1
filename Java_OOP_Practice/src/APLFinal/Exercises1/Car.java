package APLFinal.Exercises1;

public class Car extends Vehicle{
    public Integer numSeats;

    public Car(String make, String model, Integer year, double price, Integer numSeats) {
        super(make, model, year, price);
        this.numSeats = numSeats;
    }

    public Integer getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(Integer numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public String toString() {
        return "Car { " +
                "numSeats: " + numSeats +
                ", make: '" + make + '\'' +
                ", model: '" + model + '\'' +
                ", year: " + year +
                ", price: " + price +
                "$ }";
    }
}
