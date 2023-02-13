import java.util.Scanner;

public class Array {
        public static void main(String[] args) {
            Scanner ScannerObject = new Scanner(System.in);
//            String[] cars = new String[5];
//            for (int i=0; i< cars.length;i++){
//                cars[i] = ScannerObject.nextLine();
//            }
//            for (String s: cars){
//                System.out.println(s);
//            }

            Array2 array2Test2 = new Array2();
            array2Test2.Truck = new int[10];
            for (int j=0; j< array2Test2.Truck.length;j++){
                array2Test2.Truck[j] = ScannerObject.nextInt();
            }


        }
}
class Array2{
    int [] Truck;

}