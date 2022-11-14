package modelTest1;

import java.util.Random;

public class PrizeTest2 {
    public static void main(String[] args) {
//        直接打乱奖池,效率更高
        int [] prize = {2,588,888,1000,10000};
        int [] newArray = newArray(prize);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

    }

    public static int[] newArray(int [] prize){
        Random r = new Random();
        for (int i = 0; i < prize.length; i++) {
            int temp = prize[i];
            int index = r.nextInt(prize.length);
            prize[i] = prize[index];
            prize[index] = temp;
        }
        return prize;
    }
}
