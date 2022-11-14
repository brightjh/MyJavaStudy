package modelTest1;

public class PrimeNumber {
    public static void main(String[] args) {
        //    判断101到两百之间有多少质数,并输出所有质数
        int [] temp = new int[99];
        int j = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = false;
            for (int n =2; n < i; n++) {
                if (i%n == 0) {
                    break;
                }else {
                    flag = true;
                }
            }
            if (flag) {
                temp [j] = i;
                j++;
            }
            }
        int [] array = new int[j];
        for (int i = 0; i < j; i++) {
            array[i] = temp[i];
        }
        System.out.println(j);
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a]+",");

        }

    }


}
