package APL_Assignment_01;
public class House {
    private int area;
    private Door door;

    public House(int area) {
        this.area = area;
        this.door = new Door();
    }

    public void ShowData() {
        System.out.println("I am a house, my area is " + area + " m2");
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    public Door GetDoor() {
        return door;
    }

}

class Door {
    private String color;

    public Door() {
        this.color = "red";
    }

    public void ShowData() {
        System.out.println("I am a door, my color is " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class SmallApartment extends House {
    public SmallApartment() {
        super(50);
    }
}

class Person {
    private String name;
    private House house;

    public Person(String name, House house) {
        this.name = name;
        this.house = house;
    }

    public void ShowData() {
        System.out.println("Person name: " + name);
        house.ShowData();
        house.GetDoor().ShowData();
    }
}
class Main {
    public static void main(String[] args) {
        SmallApartment smallApartmentObj = new SmallApartment();

        Person personObj = new Person("Vireak", smallApartmentObj);

        personObj.ShowData();
    }
}