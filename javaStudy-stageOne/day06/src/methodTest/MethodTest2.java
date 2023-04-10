package methodTest;

public class MethodTest2 {
    public static void main(String[] args) {
//        求圆的面积
        int r = 5;
        getArea(r);

    }

    public static void getArea(double r) {
        double result = 3.14 * (r * r);
        System.out.println(result);
    }
}
