package Logic;

import java.util.Random;

public class dice {
    public static void main(String[] args) {
        int length = 30;

        viewProgress(length, 5);
        System.out.println(rollAllDice(6));
    }

    public static int rollAllDice(int diceNum){
        int sum = 0;
        for(int i=0; i<diceNum; i++){
            sum += rollDice();
        }
        return sum;
    }

    public static int rollDice(){
        Random random = new Random();
        int diceValue = random.nextInt(3) + 1;
        return diceValue;
    }

    public static void viewProgress(int length, int current){
        String progressBar = "";
        for(int i=0; i<length; i++){

            if(i==current){
                progressBar += "▲";
            }
            else{
                progressBar += "-";
            }
        }
        progressBar += "|上がり";
        System.out.println(progressBar);
    }
}
