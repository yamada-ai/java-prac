package highPrac;

public class Ex14Triathlete {
    String place;
    String tool;

    Ex14Triathlete(){
        this.place = "自宅";
        this.tool = "手ぶら";
    }

    void move(String place){
        if(this.place.equals(place)){
            System.out.println("既に"+this.place+"にいます");
            return;
        }
        
        System.out.println(this.place+"から"+place+"へ移動しました");
        this.place = place; 
    }

    void changeTool(String tool){
        if(this.tool.equals(tool)){
            System.out.println("既に"+this.tool+"を使っています");
            return;
        }
        
        System.out.println(this.tool+"から"+tool+"にツールを変更しました");
        this.tool = tool; 
    }

    void training(){
        System.out.println(this.place+"で"+this.tool+"を使用します");
        if(this.place.equals("海") && this.tool.equals("水着")){
            System.out.println("泳ぎの練習をしました");
            return;
        }

        if(this.place.equals("サイクリングロード") && this.tool.equals("自転車")){
            System.out.println("自転車の練習をしました");
            return;
        }

        if(this.place.equals("公園") && this.tool.equals("シューズ")){
            System.out.println("走りの練習をしました");
            return;
        }

        System.out.println("練習できませんでした");
    }
    
}
