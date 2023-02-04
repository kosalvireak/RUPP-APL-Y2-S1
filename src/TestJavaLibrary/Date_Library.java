package TestJavaLibrary;

import java.util.Date;
import java.util.Random;

public class Date_Library {
    public static  void main(String[] args)
    {
    Date newDate = new Date();
    System.out.println("The elapsed time since Jan 1, 1970 is " + newDate.getTime() + " milliseconds");
    System.out.println("The elapsed time since Jan 1, 1970 is " + newDate+ " milliseconds");

    Random newRandom = new Random();
    System.out.println(newRandom.nextInt(5));}

}
