package StringTest;

import java.util.Scanner;

public class BigNumberTest {
    public static void main(String[] args) {
        // 获取金额
        int money;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入金额");
            money = sc.nextInt();
            if (money <= 0 || money >= 9999999) {
                System.out.println("你找茬是不是");
            } else {
                break;
            }
        }
        // 转换为大写
        String bigMoney = "";
        while (true) {
            int temp = money % 10;
            bigMoney = getBigNumber(temp) + bigMoney;
            money /= 10;
            if (money == 0) {
                break;
            }
        }

        // 补全到七位数
        while (true) {
            if (bigMoney.length() < 7) {
                bigMoney = "零" + bigMoney;
            } else {
                break;
            }
        }

        // 插入单位
        String allMoney = "";
        String[] units = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        for (int i = 0; i < bigMoney.length(); i++) {
            allMoney = allMoney + bigMoney.charAt(i) + units[i];
        }
        System.out.println(allMoney);

    }

    public static String getBigNumber(int number) {
        // 将金额转换为大写
        String[] bigNumbers = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return bigNumbers[number];

    }


}
