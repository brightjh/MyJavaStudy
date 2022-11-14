package top.brightzm.MathDemo;

public class MathTest2 {
    // 统计有多少水仙花数量(三位的自然数)
    public static void main(String[] args) {

        int count = 0;

        for (int i = 100; i <= 999; i++) {
            // 分别取得个位 十位 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            // 进行判断
            double sum = Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3);
            if (sum == i){
                count++;
            }

        }
        System.out.println(count);
    }

}
