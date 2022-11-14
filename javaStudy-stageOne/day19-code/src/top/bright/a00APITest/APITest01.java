package top.bright.a00APITest;

import java.util.ArrayList;
import java.util.Scanner;

public class APITest01 {
    public static void main(String[] args) {

        // 键盘录入一些 1～100 的整数，并添加到集合中， 直到所有数据之和超过200
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (getSum(list) < 200) {
            System.out.println("请输入1～100的整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            if (num<0 || num>100){
                System.out.println("数字不在范围内，请重新输入");
                continue;
            }
            list.add(num);
            System.out.println(getSum(list));
        }


    }

    // 统计集合的数据总和
    public static int getSum(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }

}
