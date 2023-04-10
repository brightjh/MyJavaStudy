package arrayLIstTest;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        // 遍历集合
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
