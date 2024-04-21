package highPrac;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int[] array = new int[50];

        int sum = 0;
        Scanner s = new Scanner(System.in);
        int lenTo100 = 0;

        // input
        for(int i=0; i<array.length; i++){
            System.out.print("入力: ");
            array[i] = s.nextInt();
            sum += array[i];
            lenTo100 = i+1;
            if(sum >= 100){
                break;
            }
        }
        // print
        for(int i=0; i<lenTo100; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }
}
