package methodTest;

public class MethodTest5 {
    public static void main(String[] args) {
//        方法重载
        int a = 10;
        int b = 20;

        if (compare(a, b)) {
            System.out.println("相等");
        } else {
            System.out.println("不等");
        }
    }

    public static boolean compare(byte a, byte b) {
        return a == b;
    }

    public static boolean compare(short a, short b) {
        return a == b;
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }


}
