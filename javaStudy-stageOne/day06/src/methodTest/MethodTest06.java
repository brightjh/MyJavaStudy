package methodTest;

public class MethodTest06 {
    public static void main(String[] args) {
//        遍历数组
        int[] array = {11, 22, 33, 44, 55, 66};
        getTraverse(array);

    }

    public static void getTraverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ",");
            } else if (i < array.length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i] + "]");
            }

        }

    }

}
