package nara;

/**
 * CommonDenominator
 */
public class CommonDenominator {
    public static void main(String[] args) {
        int[] A = {3, 4};
        int[] B = {5, 8};

        int[] C = calcCommonDenominator(A, B);
        System.out.println(C[0]+"/"+C[1]);
    }

    public static int[] calcCommonDenominator(int[] A, int[] B){
        int[] C = new int[2];
        C[1] = SelfMath.GCD(A[1], B[1]);
        C[0] = C[1]/B[1]*B[0] + C[1]/A[1]*A[0];
       
        return C;
    }

}