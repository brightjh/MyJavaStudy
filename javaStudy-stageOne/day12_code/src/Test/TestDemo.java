package Test;

public class TestDemo {
    public static void main(String[] args) {
        int [] ints = {10,20,50,40,34,100};
        System.out.println(ArrayUtil.printArr(ints));

        double [] doubles = {10,20,50,30,40,100};
        System.out.println(ArrayUtil.getAverage(doubles));
    }

}
