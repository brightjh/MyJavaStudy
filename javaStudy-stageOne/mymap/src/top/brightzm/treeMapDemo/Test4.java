package top.brightzm.treeMapDemo;

/**
 * @description:
 * @author: bright
 * @time: 2023/3/28 上午9:20
 */
public class Test4 {
    public static void main(String[] args) {

        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(sum);

    }

    public static int getSum(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

}
