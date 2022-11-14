package top.brightzm.ALGTest;

public class ALG05Test {
    public static void main(String[] args) {
        // 爬楼梯，有时一次爬一个，有时一次爬两个，有时爬三个，爬20个台阶，总共有多少种爬法

        // 1阶楼梯 1种
        // 2阶楼梯 2种
        // 3阶楼梯 3种
        // 4阶楼梯 6种


        int number = 20;

        System.out.println(getNum(number));


    }

    public static int getNum(int number) {
        if (number == 1 || number == 2 || number == 3) {
            return number;
        }
        return getNum(number-1) + getNum(number-2) + getNum(number-3);
    }


}
