public class SumAverageRunningInt {
    public static void main(String[] args)
    {
        int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;
        float average = (lowerbound+upperbound)/2f;
        for (lowerbound = 1; lowerbound<= upperbound; lowerbound++)
        {
            sum += lowerbound;

        }
        System.out.println("The sum of "+lowerbound+" to "+upperbound+" is "+sum);
        System.out.println("The average is " + average);

    }
}
