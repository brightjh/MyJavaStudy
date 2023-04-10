package methodTest;

public class MethodTest07 {
    public static void main(String[] args) {
//        求最大值
        int [] array = {1,2,3,4,5};
        int max = getMaxValue(array);
        System.out.println(max);

    }

    public static int getMaxValue(int [] array) {
        int maxValue = array[1];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>maxValue) {
                maxValue = array[i];
            }else {
                continue;
            }
        }


        return maxValue;

    }

}
