class NoRealRootsException extends Exception{
    public NoRealRootsException(String message){
        super(message);
    }
}
public class NoRealRootsExceptionMainClass {
    public static void findRootByDelta(int a, int b, double delta) throws NoRealRootsException{
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
        }
        else{
            throw new NoRealRootsException("Delta must be equal or greater than 0.");
        }
    }
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int c = 5;
        double delta = Math.pow(b,2) - (4*a*c);
        System.out.println("delta: "+delta);
        try{
            findRootByDelta(a,b,delta);
        }catch (NoRealRootsException e){
            System.out.println("Exception Main : " + e.getMessage());
        }

    }
}