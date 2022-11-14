package top.brightzm.SortDemo;

public class RecursiveDemo2 {
    public static void main(String[] args) {
        // 用递归求5的阶乘
        int number = 5;

        int factorial = getFactorial(number);
        System.out.println(factorial);

    }

    public static int getFactorial(int number){
        if (number ==1){
            return 1;
        }

        return number*getFactorial(number-1);
    }

}
