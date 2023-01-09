import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner newscanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = newscanner.nextInt();
        System.out.print("Enter b: ");
        int b = newscanner.nextInt();
        System.out.print("Enter c: ");
        int c = newscanner.nextInt();
        double delta = Math.pow(b,2) - (4*a*c);
        System.out.println(delta);
        System.out.println("Equation: "+ a+"x^2 +("+ b +"x) + (" + c+")");
        if (delta > 0)
        {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Equation has 2 solutions. x1 = "+ x1+ ", x2 = "+ x2);
        }
        else if (delta == 0)
        {
            double x = -b / (2 * a);
            System.out.println("Equation has 1 solution. x1 = x2 = " + x);
        }else
        {
            System.out.println("Equation has No solution. ");
        }


    }
}