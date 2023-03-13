import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private float height;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.height = 0f;
    }

    public Person(String firstName, String lastName, float height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + ' ' + lastName + '\n' +
                "They are : " + height + " foot, " + height*12 + " inch.\n";
    }
}

class Employee extends Person {
    private int id;
    private double hourlyPay;


    public Employee(String firstName, String lastName, float height, int id, double hourlyPay) {
        super(firstName, lastName, height);
        this.id = id;
        this.hourlyPay = hourlyPay;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double getRaise(){
        double newHourly;
        this.hourlyPay += (0.15*hourlyPay);
        newHourly = this.hourlyPay;
        return newHourly;
    }

    public double payDay(double hours){
        double bonus = 0, total = 0;
        if(hours>= 40){
            bonus = hours - 40;
            bonus = bonus * (this.hourlyPay*1.5);
            total = bonus + (40*this.hourlyPay);
        }
        else{
            total = hours * this.hourlyPay;
        }
        return total;
    }

    @Override
    public String toString() {
        return super.toString() +
                "They make " + hourlyPay +"$\n"+
                "They have the employee ID: " + id ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.hourlyPay, hourlyPay) == 0;
    }


    public static  void main(String[] args) {
        Employee employee1 = new Employee("Vireak", "Kosal", 12, 18243, 10);
//        employee1.getRaise();
        System.out.println("payday: " + employee1.payDay(45));
        System.out.println( employee1.toString());
    }
}