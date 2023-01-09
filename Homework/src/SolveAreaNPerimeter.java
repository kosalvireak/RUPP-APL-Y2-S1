import java.util.Scanner;

public class SolveAreaNPerimeter {
    public static void main(String[] args)
    {
        System.out.println("This program is use to solve Area and Perimeter of below Geometry shape");

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Ellipse");
        System.out.println("5. Parallelogram");
        System.out.print("Choose the given shape: ");
        Scanner scannerobject = new Scanner(System.in);
        int input = scannerobject.nextInt();
        switch (input)
        {
            case 1:
//                Circle
                System.out.print("Enter the radius: ");
                double radius = scannerobject.nextInt();
                double areaCir = Math.PI * Math.pow(radius,2);
                double periCir = radius * 2 * Math.PI;
                System.out.println("Area is " + areaCir +". Perimeter is " + periCir);
                break;
            case 2:
//                Rectangle
                System.out.print("Enter the length: ");
                double long_side = scannerobject.nextDouble();
                System.out.print("Enter the width: ");
                double short_side = scannerobject.nextDouble();
                double areaRac = long_side * short_side;
                double periRac = 2* long_side + 2*short_side;
                System.out.println("Area is " + areaRac +". Perimeter is " +periRac);
                break;
            case 3:
//                Triangle
                System.out.print("Enter the 1st side  (Base): ");
                double side1st = scannerobject.nextDouble();
                System.out.print("Enter the 2nd side: ");
                double side2nd = scannerobject.nextDouble();
                System.out.print("Enter the 3rd side: ");
                double side3rd = scannerobject.nextDouble();
                System.out.print("Enter the height : ");
                double height = scannerobject.nextDouble();

                double areaTri = 0.5 * side1st * height ;
                double periTri = side1st + side2nd + side3rd;
                System.out.println("Area is " + areaTri +", Perimeter is " + periTri);
                break;
            case 4:
//                Ellipse
                System.out.print("Enter the a (major axis): ");
                double majorEll = scannerobject.nextDouble();
                System.out.print("Enter the b (manor axis): ");
                double manorEll = scannerobject.nextDouble();
                double areaEll = majorEll * manorEll * Math.PI;
                double periEll = 2*Math.PI * Math.sqrt((Math.pow(majorEll,2)+ Math.pow(manorEll,2))/2);
                System.out.println("Area is " + areaEll +". Perimeter is around" + periEll);

                break;
            case 5:
//                Parallelogram
                System.out.print("Enter the horizontal side: ");
                double horizontal_side = scannerobject.nextDouble();
                System.out.print("Enter the tilt side: ");
                double tilt_side = scannerobject.nextDouble();
                System.out.print("Enter the height : ");
                double heightPar = scannerobject.nextDouble();
                double periPar= 2* (horizontal_side + tilt_side);
                double areaPar = horizontal_side * heightPar;
                System.out.println("Area is " + areaPar +". Perimeter is " + periPar);

                break;

        }

    }
}
