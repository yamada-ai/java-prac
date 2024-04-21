package highPrac;

/**
 * Ex14
 */
public class Ex14 {
    public static void main(String[] args) {
        Ex14Triathlete ta = new Ex14Triathlete();

        ta.move("サイクリングロード");
        ta.changeTool("自転車");
        ta.training();
        ta.move("海");
        ta.changeTool("シューズ");
        ta.training();
        ta.move("公園");
        ta.changeTool("シューズ");
        ta.training();

    }
    
}