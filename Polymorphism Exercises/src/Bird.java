public class Bird extends Animal {
    double WingSize;

    public Bird(String type,String name, double weight,double WingSize) {
        super(name, type,weight);
        this.WingSize = WingSize;
    }

    @Override
    public String toString() {
        return "Bird{" +"WingSize=" + WingSize +", Name='" + Name + '\'' +
                ", Weight=" + Weight + ", WingSize=" + WingSize +'}';
    }
}
