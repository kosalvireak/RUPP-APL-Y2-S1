package ArrayList;
//5. Write a Java program to search an element in a ArrayList
import java.util.ArrayList;

public class Search_Element {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(7);
        arraylist.add(5);
        arraylist.add(6);
        arraylist.add(2);
        System.out.println(arraylist);
        int num = 5;
        for (Integer arr : arraylist){
            if(arr.equals(num)){
                System.out.println(arraylist.indexOf(arr));
            }
        }
    }

}
