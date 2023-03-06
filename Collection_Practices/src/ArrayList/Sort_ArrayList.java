package ArrayList;
//3. Write a Java program to sort a given ArrayList

import java.util.ArrayList;
import java.util.Collections;


public class Sort_ArrayList {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList<>();

        arraylist.add(72);
        arraylist.add(234);
        arraylist.add(53);

        System.out.println("Before sort: "+arraylist);
        Collections.sort(arraylist);
        System.out.println("After sort: "+arraylist);
    }
}