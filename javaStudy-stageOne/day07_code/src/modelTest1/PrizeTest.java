package modelTest1;

import java.util.Random;

public class PrizeTest {
    public static void main(String[] args) {
//        模拟抽奖
        Random r = new Random();
        int [] prize = {2,588,888,1000,10000};
        int [] array = new int[prize.length];
        for (int i = 0; i < 5;) {

            int index = r.nextInt(prize.length);
            boolean flag = contains(prize[index], array);
            if(!flag){
                System.out.println("出奖"+prize[index]+"元");
                array[i] = prize[index];
                i++;
            }
//            System.out.println("执行一次");

        }
    }
    public static boolean contains(int prize, int[] indexArray){
        for (int i = 0; i < indexArray.length; i++) {
            if (prize == indexArray[i]) {
                return true;
            }
        }
        return false;
    }

}
//用索引来判断奖池
//但数组没有数据,默认是0,影响判断,不可行