package ArrayList;

import java.util.ArrayList;

//6. Write a Java program to copy one array list into another
public class Copy_ArrayList {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList<>();
        arraylist.add(7);
        arraylist.add(5);
        arraylist.add("hello");
        System.out.println(arraylist);
        ArrayList arraylistNew = new ArrayList<>();
        System.out.println("First array List" + arraylistNew);
        arraylist.forEach((n) -> arraylistNew.add(n));

        System.out.println("Array List After copy: " + arraylistNew);

    }
}
