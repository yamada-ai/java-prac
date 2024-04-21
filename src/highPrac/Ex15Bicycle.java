package highPrac;

public class Ex15Bicycle {
    String bearing;
    int bearing_degree = 90;

    static int convertDir2Degree(String bearing){
        if(bearing.equals("東")){
            return 0;
        }
        if(bearing.equals("北")){
            return 90;
        }
        if(bearing.equals("西")){
            return 180;
        }
        if(bearing.equals("南")){
            return 270;
        }
        return 90;
    }
    static String converDegreer2Dir(int degree){
        if(degree == 0){
            return "東";
        }
        if(degree == 90){
            return "北";
        }
        if(degree == 180){
            return "西";
        }
        if(degree == 270){
            return "南";
        }
        return "北";
    }

    static int normalize_degree(int degree){
        if(degree >= 360){
            return degree - 360;
        }
        if(degree < 0){
            return degree + 360;
        }
        return degree;
    }

    void setBearing(String bearing){
        this.bearing = bearing;
    }

    void turnLeft(){
        this.bearing_degree += 90;
        this.bearing_degree = Ex15Bicycle.normalize_degree(this.bearing_degree);
        this.bearing = Ex15Bicycle.converDegreer2Dir(this.bearing_degree);
        System.out.println("左に曲がったので"+this.bearing+"を向きました");
    }

    void turnRight(){
        this.bearing_degree -= 90;
        this.bearing_degree = Ex15Bicycle.normalize_degree(this.bearing_degree);
        this.bearing = Ex15Bicycle.converDegreer2Dir(this.bearing_degree);
        System.out.println("右に曲がったので"+this.bearing+"を向きました");
    }

    void display(){
        System.out.println(this.bearing);
    }

    
}
