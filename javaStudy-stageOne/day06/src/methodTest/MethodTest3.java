package methodTest;

public class MethodTest3 {
    public static void main(String[] args) {
//        求季度总营业额
        double sum = getSum(1000,2000,2000);
        System.out.println(sum);

    }

    public static double getSum(double month1, double month2, double month3){
        return month1+month2+month3;
    }
}
