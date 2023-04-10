package top.brightzm.exception;

/**
 * @description: 异常的常见方法
 * @author: bright
 * @time: 2023/4/3 上午9:25
 */
public class Demo2 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println(e.getMessage());
            // system.out.println(e.toString());
            e.printStackTrace();
        }

        System.out.println("over....");


    }

}
