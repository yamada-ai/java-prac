package highPrac;

import java.util.Scanner;

public class Ex17 {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] array = new int[10];
        
        for(int i=0; i<array.length; i++){
            System.out.print((i+1)+"番目の数字: ");
            array[i] = s.nextInt();
            System.out.println();
        }
        
        // (1)
        for(int element : array){
            System.out.print(element*2+" ");
        }
        System.out.println();

        // 2
        System.out.print("偶数: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + ", ");
            }
        }
        System.out.println();

        System.out.print("奇数: ");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + ", ");
            }
        }
        System.out.println();

        s.close();
   } 
}
