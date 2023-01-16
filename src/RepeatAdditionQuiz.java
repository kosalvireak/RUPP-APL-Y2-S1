import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args)
    {
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
        Scanner scanner_input = new Scanner(System.in);
        System.out.print("What is " + number1 +" + "+number2+" ? ");
        int answer = scanner_input.nextInt();
        while (number1 + number2 != answer)
        {
            System.out.print("Wrong Answer. Try again.What is " + number1 +" + "+number2+" ? ");
            answer = scanner_input.nextInt();
        }
        System.out.println("You're right");
    }
}
