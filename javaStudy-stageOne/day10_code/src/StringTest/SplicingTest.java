package StringTest;

public class SplicingTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        String str = arrayToString(array);
        System.out.println(str);

    }

    public static String arrayToString(int[] array) {
        if (array == null) {
            return "";
        }
        if (array.length == 0) {
            return "[]";
        }

        String str = "";
        str = str + "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str = str + array[i];
            } else {
                str = str + array[i] + ",";
            }
        }
        str = str + "]";
        return str;


    }
}
