public class HarmonicSum {
    public static void main(String[] args)
    {
        double sum_l2r = 0f, sum_r2l=0f;
        int n = 50000;
        for (int i = 1 ; i <= n; i ++){
            sum_l2r = sum_l2r + 1f/i;

        }
        System.out.println("harmonic left to right: "+sum_l2r);

        for (int j = n ; j >= 1; j --){
            sum_r2l = sum_r2l + 1f/j;
        }
        System.out.println("harmonic right to left: "+sum_r2l);
        double absDiff = Math.abs(sum_l2r - sum_r2l);
        System.out.printf("The absolute difference  is: %.30f",absDiff);
//        Both of the value are the same, but if I use float as its data type the value with change due to round.
    }
}
