package top.brightzm.MathDemo;

public class MathTest4 {
    public static void main(String[] args) {
        // 有多少四位自幂数
        int count1 = 0;
        System.out.println("四位玫瑰数有:");
        for (int i = 1000; i < 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int kilo = i / 1000 % 10;
            double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(kilo, 4);
            if (sum == i) {
                System.out.println(i);
                count1++;
            }
        }
        System.out.println("四位玫瑰数的个数是:" + count1);

        System.out.println("====================================");

        // 有多少五位自幂数
        int count2 = 0;
        System.out.println("五角星数有:");
        for (int i = 10000; i < 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int kilo = i / 1000 % 10;
            int wan = i / 10000 % 10;
            double sum = Math.pow(ge, 5) + Math.pow(shi, 5) + Math.pow(bai, 5) + Math.pow(kilo, 5) + Math.pow(wan, 5);
            if (sum == i) {
                System.out.println(i);
                count2++;
            }
        }
        System.out.println("五角星数的个数是:" + count2);

    }

}
