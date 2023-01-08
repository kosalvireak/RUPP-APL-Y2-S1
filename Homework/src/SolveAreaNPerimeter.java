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
                double areaCir = radius * Math.pow(Math.PI,2);
                double periCir = radius * 2 * Math.PI;
                System.out.println("Area is " + Math.floor(areaCir) +". Perimeter is " + Math.floor(periCir));
                break;
            case 2:
//                Rectangle
                System.out.print("Enter the long side: ");
                double long_side = scannerobject.nextDouble();
                System.out.print("Enter the short side: ");
                double short_side = scannerobject.nextDouble();
                double areaRac = long_side * short_side;
                double periRac = 2* long_side + 2*short_side;
                System.out.println("Area is " + Math.floor(areaRac) +". Perimeter is " + Math.floor(periRac));
                break;
            case 3:
//                Triangle
                System.out.print("Enter the 1st side: ");
                double side1st = scannerobject.nextDouble();
                System.out.print("Enter the 2nd side: ");
                double side2nd = scannerobject.nextDouble();
                System.out.print("Enter the 3rd side (Base) : ");
                double side3rd = scannerobject.nextDouble();
                System.out.print("Enter the 3rd height : ");
                double height = scannerobject.nextDouble();

                double areaTri = 0.5 * side3rd * height ;
                double periTri = side1st + side2nd + side3rd;
                System.out.println("Area is " + Math.floor(areaTri) +". Perimeter is " + Math.floor(periTri));
                break;
            case 4:
//                Ellipse
                System.out.print("Enter the a (major axis): ");
                double majorEll = scannerobject.nextDouble();
                System.out.print("Enter the b (manor axis): ");
                double manorEll = scannerobject.nextDouble();
                double areaEll = majorEll * manorEll * Math.PI;
                double periEll = 2*Math.PI * Math.sqrt((Math.pow(majorEll,2)+ Math.pow(manorEll,2))/2);
                System.out.println("Area is " + areaEll +". Perimeter is " + periEll);

                break;
            case 5:
//                Parallelogram
                System.out.print("Enter the horizontal side: ");
                double horizontal_side = scannerobject.nextDouble();
                System.out.print("Enter the tilt side: ");
                double tilt_side = scannerobject.nextDouble();
                double areaPar = 2*horizontal_side * 2* tilt_side;
                double periPar = horizontal_side * tilt_side;
                System.out.println("Area is " + Math.floor(areaPar) +". Perimeter is " + Math.floor(periPar));

                break;

        }

    }
}
