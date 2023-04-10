package top.brightzm.exception;

/**
 * @description: 抛出异常
 * @author: bright
 * @time: 2023/4/3 上午9:40
 */
public class Demo3 {

    public static void main(String[] args) {

        int[] arr = {};

        int max = 0;
        try {
            max = getMax(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(max);


    }

    public static int getMax(int[] arr){

        if (arr == null){

            throw new NullPointerException();
        }

        if (arr.length == 0){
            throw new ArrayIndexOutOfBoundsException();
        }


        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }

        }
        return max;

    }

}
