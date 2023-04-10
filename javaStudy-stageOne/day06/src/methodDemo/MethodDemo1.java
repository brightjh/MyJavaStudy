package methodDemo;

public class MethodDemo1 {
    public static void main(String[] args) {
//        带参数方法的定义和调用
        getSum(10,20);
    }

    public static void getSum(int number1, int number2){
        int result = number1 + number2;
        System.out.println(result);

    }

}
