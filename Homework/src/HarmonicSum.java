public class HarmonicSum {
    public static void main(String[] args)
    {
        float sum_l2r = 0f, sum_r2l=0f;
        int n = 50000, j = 1;
        for (int i = 1 ; i <= n; i ++){
            sum_l2r = sum_l2r + 1f/i;
        }
        System.out.println("harmonic left to right: "+sum_l2r);

        for (int m = n ; m >= j; m --){
            sum_r2l = sum_r2l + 1f/m;
//            System.out.println("harmonic right to left: "+sum_r2l);

        }
        System.out.println("harmonic right to left: "+sum_r2l);
    }
}
