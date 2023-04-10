package top.brightzm.MathDemo;

public class MathTest3 {
    public static void main(String[] args) {
        // 判断有没有两位的自幂数
        int count = 0;

        for (int i = 10; i < 99; i++) {
            int ge = i%10;
            int shi = i/10%10;
            double sum = Math.pow(ge,2)+Math.pow(shi,2);
            if (sum ==i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);

    }
}
