package top.brightzm.ALGTest;

public class ALG03Test {
    public static void main(String[] args) {
        // 猴子吃桃子，每天都吃剩下桃子的一半再多吃一个，第十天只剩一个，最初桃子有多少
        // 递归经典算法题

        int num = getNum(1);
        System.out.println(num);



    }

    public static int getNum(int day){
        if (day<= 0 || day >= 11){
            System.out.println("时间错误");
            return -1;
        }

        if (day == 10 ){
            return 1;
        }
        return (getNum(day + 1) + 1) * 2;
    }

}
