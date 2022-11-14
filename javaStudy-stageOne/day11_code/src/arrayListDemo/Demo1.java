package arrayListDemo;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        // 创建集合的对象
        ArrayList<String> list = new ArrayList<>();  // 只能存储字符串
        System.out.println(list);
        // 增
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //删
        list.remove("aaa");
        String remove = list.remove(2);
        System.out.println(remove);

        //改
        String result = list.set(1, "eee");
        System.out.println(result);

        //查
        String str = list.get(0);
        System.out.println(str);
        int size = list.size();
        System.out.println(size);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
