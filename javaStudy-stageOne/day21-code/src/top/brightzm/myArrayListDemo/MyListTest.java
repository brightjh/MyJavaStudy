package top.brightzm.myArrayListDemo;

public class MyListTest {
    public static void main(String[] args) {
        // 1.实现类给出具体的类型
        MyList01 myList01 = new MyList01();
        myList01.add("aaa");
        myList01.add("bbb");
        myList01.add("ccc");
        myList01.add("ddd");


        // 2.实现类延续泛型，创建实现类对象再确定类型
        MyList02<Integer> myList02 = new MyList02<>();
        myList02.add(1);
        myList02.add(2);
        myList02.add(3);
        myList02.add(4);


    }
}
