package top.brightzm.ALGTest;

public class ALG04Test {
    public static void main(String[] args) {
        // 爬楼梯，有时一次爬一个，有时一次爬两个，爬20个台阶，总共有多少种爬法
        int sum = getNum(20);
        System.out.println("20阶楼梯有"+sum+"种爬法");
    }

    public static int getNum(int number) {
        if (number == 1 || number == 2) {
            return number;
        }
        return getNum(number - 1) + getNum(number - 2);

    }

}
