package highPrac;

public class Ex15 {
    public static void main(String[] args) {
        Ex15Bicycle bike = new Ex15Bicycle();
        bike.setBearing("北");
        bike.turnLeft();
        bike.turnRight();
        bike.turnLeft();
        bike.turnLeft();
        bike.turnRight();
        bike.turnLeft();
        bike.display();
    }
}
