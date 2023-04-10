package StringDemo;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
//        将数组转为字符串
        int[] array = {1,2,3,4,5};
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < array.length; i++) {
            sj.add(array[i]+"");
        }
        System.out.println(sj);


    }
}
