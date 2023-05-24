package APLFinal.Exercises1;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Cambodia","Angkor",2023,17800);
        Car car = new Car("Phnom Penh","Angkor",2023,19000,4);
        System.out.println(vehicle.toString());
        System.out.println(car.toString());
    }
}
