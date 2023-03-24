public class Mammal extends Animal {
    String LivingRegion;
    String food = "meat";
    int qty;

    public Mammal(String type,String name, double weight, String LivingRegion ){
        super(name, type,weight); this.LivingRegion = LivingRegion;
        makeSound(Type);
    }
    private void makeSound(String type){
        String sound = "" ;
        if(type=="Dog"){
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
        System.out.println(sound);

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
