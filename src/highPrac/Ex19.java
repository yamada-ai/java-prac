package highPrac;

public class Ex19 {
    public static void main(String[] args) {
        int[][] array = new int[9][9];

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j] = (i+1)*(j+1);
            }
        }
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
