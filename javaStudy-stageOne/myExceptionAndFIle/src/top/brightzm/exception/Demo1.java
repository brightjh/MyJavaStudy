package top.brightzm.exception;

/**
 * @description: try catch多个问题
 * @author: bright
 * @time: 2023/4/3 上午9:05
 */
public class Demo1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        try {
            //System.out.println(arr[10]);
            //System.out.println(2 / 0);
            String s = null;
            System.out.println(s.equals("abc"));
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("NullPointer");
        }

        System.out.println("over");


    }

}
