import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args)
    {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if((number % 2) == 0){
            System.out.println("Even");
        }
        else if ((number %2)!= 0)
        {
            System.out.println("Odd");
        }
    }
}
