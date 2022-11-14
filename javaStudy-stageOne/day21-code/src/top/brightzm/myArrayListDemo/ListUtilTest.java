package top.brightzm.myArrayListDemo;

public class ListUtilTest {
    public static void main(String[] args) {
        ListUtil<String> list = new ListUtil<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");


        System.out.println(list);
        System.out.println("--------------");

        String[] str = {"eee","fff","ggg"};
        list.addAll(str);
        System.out.println(list);

        System.out.println("--------------");
        System.out.println(list.get(4));

    }
}
