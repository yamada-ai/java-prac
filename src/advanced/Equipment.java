package advanced;
import java.util.HashMap;
import java.util.Map;


public class Equipment {
    String weaponLowName;
    String weaponMidName;
    String weaponHiName;

    int weaponLowAttack;
    int weaponMidAttack;
    int weaponHiAttack;

    int strength;
    String equipment;
    Map<String, Integer> weaponStats = new HashMap<>();

    

    Equipment(){
        this.weaponLowName = "ひのきのぼう";
        this.weaponLowAttack = 7;

        this.weaponMidName = "どうのつるぎ";
        this.weaponMidAttack = 12;

        this.weaponHiName = "レイピア";
        this.weaponHiAttack = 24;

        this.weaponStats.put("ひのきのぼう", 7);
        this.weaponStats.put("どうのつるぎ", 12);
        this.weaponStats.put("レイピア", 24);

        this.strength = 5;
        this.equipment = "";
    }

    void showItems(){
        String[] items = {
            this.weaponLowName,
            this.weaponMidName,
            this.weaponHiName
        };
        System.out.println("どうぐ: ");
        for(String weaponName: items){
            if(weaponName.equals("")){
                continue;
            }
            System.out.println("\t"+weaponName);
        }
    }

    int calcAttack(){
        if(this.weaponStats.containsKey(this.equipment)){
            return this.strength + this.weaponStats.get(this.equipment);
        }
        else{
            return this.strength;
        }
    }

    void showStatus(){
        if(this.weaponStats.containsKey(this.equipment)){
            System.out.println("こうげき力 "+(this.strength + this.weaponStats.get(this.equipment)));
        }
        else{
            System.out.println("こうげき力 "+(this.strength));
        }
    }

    void equip(String weapon){
        if(this.weaponStats.containsKey(weapon)){
            System.out.println(weapon+"を装備した");
            int currentStrength = this.strength + this.weaponStats.getOrDefault(this.equipment, 0);
            int nextStrength = this.strength + this.weaponStats.get(weapon);
            System.out.println("こうげき "+ currentStrength +" -> "+nextStrength);
            this.equipment = weapon;
        }
        else{
            System.out.println(weapon+"はどうぐに存在しません");
        }
    }

    public static void main(String[] args) {
        Equipment eq = new Equipment();
        eq.showItems();;
        eq.showStatus();
        eq.equip("ひのきのぼう");
        eq.showStatus();
        eq.equip("どうのつるぎ");
        eq.showStatus();
        eq.equip("レイピア");
        eq.showStatus();
    }

}
