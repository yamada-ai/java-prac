package highPrac;

public class Ex13 {
    public static void main(String[] args) {
        Ex13VendingMachine vm = new Ex13VendingMachine();

        vm.buyItem();
        vm.refillStock(3);
        vm.buyItem();
        vm.putMoney(500);
        vm.buyItem();
        vm.buyItem();
        vm.buyItem();
        vm.refillStock(3);
        vm.buyItem();
        vm.buyItem();
        vm.buyItem();
        
        
    }    
}
