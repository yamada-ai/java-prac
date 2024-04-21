package highPrac;

public class Ex16 {
    public static void main(String[] args) {
        // (1)
        int[] array = {0, 1, 2, 3, 4};

        
        // (2)
        for(int element : array){
            System.out.print(element+" ");
        }
        System.out.println();

        // (3)
        String[] array2 = new String[10];
        array2[0] = "初田玲音";
        array2[5] = "初田玲音";

        // (4)
        for(String element : array2){
            if(element == null){
                System.out.print("空 ");
            }
            else{
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }
}
