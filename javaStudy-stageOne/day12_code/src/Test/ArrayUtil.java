package Test;

public class ArrayUtil {

    private ArrayUtil(){}

    public static String printArr(int[] ints){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < ints.length; i++) {
            if (i == ints.length-1){
                sb.append(ints[i]);
            }else {
                sb.append(ints[i]).append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static double getAverage(double[] doubles){
        double sum = 0;
        double count = 0;
        for (int i = 0; i < doubles.length; i++) {
            sum=sum+doubles[i];
            count++;
        }
        return (sum/count);
    }

}
