package highPrac;

public class Ex13VendingMachine {
    static final int PRICE = 120;
    int money;
    int stock;

    void refillStock(int stock){
        if(this.stock >= 10){
            System.out.println("商品がいっぱいです");
        }
        else{
            this.stock += stock;
            System.out.printf("在庫が%d個になりました\n", this.stock);
        }
    }

    void putMoney(int money){
        this.money += money;
        System.out.printf("入金金額が%d円になりました\n", this.money);
    }

    void buyItem(){
        if(this.stock <= 0){
            System.out.println("在庫を追加してください");
            return;
        }

        if(this.money <= 0){
            System.out.println("お金入れてください");
            return;
        }

        // 
        if(this.money < Ex13VendingMachine.PRICE){
            System.out.printf("お金が足りません(現在の残高%d円)\n", this.money);
            return;
        }

        System.out.println("商品を購入しました");
        this.money -= Ex13VendingMachine.PRICE;
        this.stock -= 1;
        if(this.stock == 0){
            System.out.println("在庫切れになりました");
        }

    }
}
