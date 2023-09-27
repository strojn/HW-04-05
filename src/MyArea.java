// file "MyArea.java"
public class MyArea {
    final static double PI = 3.14;//static - щоб був для "static areaOfCircle"
    static void areaOfCircle(double radius) {
//        S = πr2
        System.out.println(PI*radius*radius);
    }
}
