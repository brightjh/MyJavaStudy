package modelTest1;

import java.util.Random;
import java.util.Scanner;

public class TwoColorBall {
    public static void main(String[] args) {
//        模拟双色球中奖判断
        int[] ballNumber = ballNumber();
        int[] userNumber = userNumber(ballNumber);
        String result = priceLevel(ballNumber, userNumber);
        System.out.println(result);

    }

    public static int[] ballNumber() {
        int[] number = new int[7];
        Random r = new Random();
        // 添加红球号码
        int[] array = new int[6];
        for (int i = 0; i < 6; ) {
            int n = r.nextInt(33) + 1;
            if (!contains(n, array)) {  // 数组定义在循环内部会被刷新
                number[i] = n;
                array[i] = n;
                i++;
            }
        }
        // 添加蓝球号码
        number[6] = r.nextInt(16) + 1;

        return number;
    }

    public static boolean contains(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static int[] userNumber(int [] ballNumber) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[7];
        int[] array = new int[6];
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int num = sc.nextInt();
            if (contains(num, array)) {
                System.out.println("红球号码不能重复");
            } else if (num <= 0 || num > 33) {
                System.out.println("没有这个号码");
            } else {
                number[i] = num;
                array[i] = num;
                System.out.println("中奖号码: "+ ballNumber[i]);
                i++;
            }
        }
        System.out.println("请输入蓝球号码");

        while (true) {
            int num = sc.nextInt();
            if (num <= 0 || num > 16) {
                System.out.println("没有这个号码");
            } else {
                number[6] = num;
                System.out.println("中奖号码:"+ballNumber[6]);
                break;
            }
        }

        return number;
    }

    public static String priceLevel(int[] ballNumber, int[] userNumber) {
        int redCount = 0;
        boolean blueBall = false;
        for (int i = 0; i < ballNumber.length; i++) {
            if (ballNumber[i] == userNumber[i]) {
                redCount++;
            }

        }
        if (ballNumber[ballNumber.length - 1] == userNumber[userNumber.length - 1]) {
            blueBall = true;
        }
        // 进行等级判断
        if (redCount==6 && blueBall) {
            return "恭喜获得一等奖--最高1000万元现金";
        } else if (redCount==6) {
            return "恭喜获得二等奖--最高500万元现金";
        } else if (redCount == 5 && blueBall) {
            return "恭喜获得三等奖--3000元现金";
        } else if (redCount==5 || (redCount==4&&blueBall)) {
            return "恭喜获得四等奖--200元现金";
        }else if (redCount==4 || (redCount==3&&blueBall)) {
            return "恭喜获得五等奖--10元现金";
        }else if (redCount>=0 && redCount<=2 && blueBall) {
            return "恭喜获得六等奖--5元现金";
        }else {
            return "很抱歉,你没有中奖";
        }


    }
}
