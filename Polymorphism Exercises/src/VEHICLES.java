
public class VEHICLES {
    protected double fuel = 0;
    protected double litePerKm = 0;

    public VEHICLES() {
        this.fuel = 0;
        this.litePerKm = 0;
    }

    public VEHICLES(double fuel, double litePerKm) {
        this.fuel = fuel;
        this.litePerKm = litePerKm;
    }
    public double useAC(double distant) {
        double fuelOfUsingAC = distant * 0.9;
        return fuelOfUsingAC;
    }

    public void drive(double distant) {
        double fueAfterUsingAC = this.fuel-useAC(distant);
        double maxDistant = fueAfterUsingAC / litePerKm;
        if (distant > maxDistant) {
            System.out.println("Your vehicle needs refueling");
        } else {
            System.out.println("Your vehicle travelled " + distant + " km");
            // call the remainFuel method
            reduceFuel(distant);
        }
    }

    public void reduceFuel(double distant) {
        this.fuel = this.fuel -((distant * this.litePerKm) + useAC(distant));
    }

    public double reFuel(double fuel) {
        this.fuel += fuel;
        return this.fuel;
    }

    public double remainedFuel() {
        return this.fuel;
    }

}

class TRUCK extends VEHICLES {
    public TRUCK(double fuel, double litePerKm) {
        double newFuelCap = 0.95 * litePerKm;
        this.fuel = fuel;
        this.litePerKm = newFuelCap;
    }
    @Override
    public double useAC(double distant) {
        double fuelOfUsingAC = distant * 1.6;
        return fuelOfUsingAC;
    }
}

class CAR extends VEHICLES {
    public CAR(double fuel, double litePerKm) {
        super(fuel, litePerKm);
    }

    public static void main(String[] args) {
        TRUCK truck = new TRUCK(100, 0.9);
        CAR car = new CAR(15, 0.3);
        car.drive(9);
        car.drive(30);
        car.reFuel(50);
        truck.drive(10);
        System.out.println("Car remained Fuel: " + car.remainedFuel());
        System.out.println("Truck remained Fuel: " + truck.remainedFuel());
    }

}
