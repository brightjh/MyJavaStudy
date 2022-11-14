package StringTest;

public class StringBuilderTest {
    public static void main(String[] args) {
//        将数组中的数据按照指定格式输出
        int[] array = {1,2,3};
        String string = toString(array);
        System.out.println(string);
    }


//    转换成字符串
    public  static String toString(int[] array){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < array.length; i++) {
            if (i< array.length-1) {
                sb.append(array[i]).append(',');
            }else {
                sb.append(array[i]);
            }
        }
        sb.append(']');
        return sb.toString();
    }

}
