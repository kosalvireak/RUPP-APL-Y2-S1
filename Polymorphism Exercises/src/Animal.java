import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
public class Animal {
    String Name;
    String Type;
    double Weight;

    int qty;
    public Animal(String name ,String type, double weight) {
        Name = name;
        Type = type;
        Weight = weight;
        System.out.println(makeSound(type));
    }

    public void askForFood(){
        System.out.println("I am asking for food. ");
    }
    public String makeSound(String type){
        String sound = "" ;
        if(type.toString()=="Dog"){
            sound = "Woof";
        }
        else if(type == "Mouse"){
            sound = "Squeak";
        }
        else if(type == "Cat"){
            sound = "Meow";
        }
        else if(type == "Tiger"){
            sound = "ROAR!!!";
        }
        return sound;

    }
}

 class Mammal extends Animal {
    String LivingRegion;
    String food = "meat";

    public Mammal(String type,String name, double weight, String LivingRegion ){
        super(name, type,weight); this.LivingRegion = LivingRegion;
        makeSound(Type);
    }

    public void giveFood(String foodGive,int qty){
        if (foodGive == this.food){
            System.out.println(this.Type+" does not eat "+food);
        }
        else{
            this.Weight = this.Weight+ (0.4*qty);
            System.out.println(this.Type+" gain  "+ (0.4*qty));
        }
    }

    @Override
    public String toString() {
        return "Mammal-" + Type + " [" + Name + ", "+Weight+", "+LivingRegion+", "+food+"]";
    }
}

 class Bird extends Animal {
    double WingSize;
     String food = "everything";
    public Bird(String type,String name, double weight,double WingSize) {
        super(name, type,weight);
        this.WingSize = WingSize;
    }

     @Override
     public String toString() {
         return "Bird{" + ", Type='" + Type + '\'' +", Name='" + Name + '\'' +
                 "WingSize=" + WingSize +
                 ", Weight=" + Weight +
                 '}';
     }
 }
 class Feline extends Mammal {
    String Breed;

     @Override
     public String toString() {
         return "Feline{" +", Type='" + Type + '\'' +", Name='" + Name + '\'' +
                 "Breed='" + Breed + '\'' +", Weight=" + Weight +
                 ", LivingRegion='" + LivingRegion + '\'' +
                 ", food='" + food + '\'' +
                 '}';
     }

     public Feline(String type, String name, double weight, String LivingRegion, String Breed) {
        super(name, type,weight,LivingRegion);
        this.Breed = Breed;
    }
     public static void main(String[] args) {
         Scanner scanner_input = new Scanner(System.in);

//    Mammal
         System.out.println("Creating Mammal Object");
         String[] constructObj = scanner_input.nextLine().split(" ");
         Mammal Dog = new Mammal(constructObj[0].toString(),constructObj[1],parseDouble(constructObj[2]),constructObj[3]);
         System.out.println(Dog.toString());

         System.out.println("Give food to Mammal Object");
         String[] Food = scanner_input.nextLine().split(" ");
         Dog.giveFood(Food[0],parseInt(Food[1]));
         System.out.println(Dog.toString());

     }

}

