package ArrayList;
//1. Write a Java program to create a new ArrayList, add some elements (string) and
//        print out the collection

import java.util.ArrayList;

public class new_ArrayList {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList<>();

        arraylist.add("hello");
        arraylist.add("hi");
        arraylist.add("bye bye");
        System.out.println(arraylist);
    }
}
