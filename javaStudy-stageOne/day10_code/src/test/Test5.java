package test;

public class Test5 {
    public static void main(String[] args) {
        // 将字符串形式的num1和numb2进行乘积,也是字符串形式
        String num1 = "120";
        String num2 = "12";
        int number1 = toInt(num1);
        int number2 = toInt(num2);
        int result = number1*number2;
        String str = toString(result);
        System.out.println(str);


    }

    // 将字符串中的数字转换为整数
    public static int toInt(String num){
        int number = 0;
        for (int i = 0; i < num.length(); i++) {
            number = number*10+(byte)(num.charAt(i)-48);
        }
        return number;

    }

    public static String toString(int number){
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        return sb.toString();
    }

}
