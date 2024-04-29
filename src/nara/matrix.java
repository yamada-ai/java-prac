package nara;

/**
 * matrix
 */
public class matrix {

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 5},
            {3, 4, 6}
        };

        int[][] B = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        //showMatrix(A);

        int[][] C = calcMultiMactrix(B, A);

        showMatrix(C);
    }

    public static int[][] calcMultiMactrix(int[][] A, int[][] B){
        // 多分次元数はこう
        int[][] C = new int[A.length][B[0].length];

        for(int i=0; i<C.length; i++){
            for(int j=0; j<C[i].length; j++){
                for(int k=0; k<B.length; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    public static void showMatrix(int[][] A){
        for(int[] I :A){
            for(int i:I){
                System.out.printf("%3d", i);
            }
            System.out.println();
        }
    }
}