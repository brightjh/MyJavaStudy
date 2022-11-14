package top.bright.a00APITest;

public class APITest03 {
    public static void main(String[] args) {
        // 将一个十进制整数转为二进制
        int number = 255;
        String binary = toBin(number);
        System.out.println(binary);
        System.out.println(Integer.toBinaryString(number));


    }

    public static String toBin(int number){
        StringBuilder sb = new StringBuilder();

        while (number != 0) {
            int remainder = number % 2;
            sb.insert(0,remainder);
            number = number / 2;
        }
        return sb.toString();

    }
}
