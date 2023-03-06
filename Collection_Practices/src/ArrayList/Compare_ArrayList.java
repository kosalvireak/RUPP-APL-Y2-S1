package ArrayList;
//4. Write a Java program to compare two array lists

import java.util.ArrayList;

public class Compare_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> arraylist1 = new ArrayList<String>();
        ArrayList<String> arraylist2 = new ArrayList<String>();

        arraylist1.add("hello");
        arraylist1.add("hi");
        arraylist1.add("bye bye");

        arraylist2.add("hello");
        arraylist2.add("hi");
        arraylist2.add("bye");
        arraylist2.add("bye bye");

        boolean boolval = arraylist1.equals(arraylist2); //returns true because lists are equal
        System.out.println(boolval);

        for (int i = 0; i <3;i++){
            if(arraylist1.contains(arraylist2.get(i))){
                System.out.println(arraylist1.get(i));
            }
        }

    }

}
