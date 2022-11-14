package methodTest;

public class MethodTest4 {
//    比较周长
    public static void main(String[] args) {
        double length1 = getLength(10, 20);
        double length2 = getLength(15,20);
        if(length1>length2){
            System.out.println("length1");
        }else {
            System.out.println("length2");
        }

    }

    public static double getLength(double width, double height) {
        double result = (width + height) * 2;
        return result;
    }
}
