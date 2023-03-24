import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class main {

    public static void main(String[] args) {
    Food Vegetable = new Food();
    Food Fruit = new Food();
    Food Meat = new Food();
    Food Seeds = new Food();

    Scanner scanner_input = new Scanner(System.in);
//    Bird
//    System.out.println("Creating Feline Object");
//    String[] inputs = scanner_input.nextLine().split(" ");
//
//    Bird obj = new Bird(inputs[0],inputs[1],parseDouble(inputs[2]),parseDouble(inputs[3]));
//    System.out.println(obj.toString());

//    Mammal
        System.out.println("Creating Mammal Object");
        String[] constructObj = scanner_input.nextLine().split(" ");
        Mammal Dog = new Mammal(constructObj[0],constructObj[1],parseDouble(constructObj[2]),constructObj[3]);
        System.out.println(Dog.toString());

        System.out.println("Give food to Mammal Object");
        String[] Food = scanner_input.nextLine().split(" ");
        Dog.giveFood(Food[0],parseInt(Food[1]));
        System.out.println(Dog.toString());

    }
}
