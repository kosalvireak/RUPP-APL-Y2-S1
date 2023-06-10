import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        Integer a = scannerObj.nextInt();
        Integer b = scannerObj.nextInt();
        if(a>b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }

    }
}
