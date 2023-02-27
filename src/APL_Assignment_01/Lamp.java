package APL_Assignment_01;

public class Lamp {
    public boolean state;
    public Lamp(){
        state = true;
    }
    public boolean checkState(){
    return state;
    }
    public void turnOff(){
        state = false;
    }
    public void turnOn(){
        state = true;
    }
    public static void main(String[] args ){
        Lamp lamp = new Lamp();
        lamp.turnOff();
        lamp.turnOn();
        System.out.println("Current Status: "+lamp.checkState());
    }
}
