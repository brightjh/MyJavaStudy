package top.brightzm.SortDemo;

public class RecursiveDemo1 {
    public static void main(String[] args) {
        //使用递归的方法获取1～100的和
        int number = 100;
        int sum = getSum(100);
        System.out.println(sum);

    }

    public static int getSum(int number) {
        // 出口
        if (number == 1) {
            return 1;
        }
        return number + getSum(number - 1);

    }

}
