public class Feline extends Mammal {
    String Breed;

    public Feline(String type,String name, double weight, String LivingRegion,String Breed) {
        super(name, type,weight,LivingRegion);
        this.Breed = Breed;
    }

}
