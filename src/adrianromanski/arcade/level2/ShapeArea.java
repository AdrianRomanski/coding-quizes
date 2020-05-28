package adrianromanski.arcade.level2;

public class ShapeArea {
//  1 - 1
//  2 - 1+4=5
//  3 - 5+8=13
//  4 - 13+12=25
//  5 - 25+16=41
//  6 - 41+20=61
//  7 - 61+24=85
    static int shapeArea(int n) {
        int shapeArea = 1;
        int add = 4;
        if (n != 1) {
            for (int i = 1; i < n; i++) {
                shapeArea+=add;
                add+=4;
            }
        }
        return shapeArea;
    }

    public static void main(String[] args) {

        for(int i = 1; i < 10; i++) {
            System.out.println(i + " number is: " + shapeArea(i));
        }
    }
}
