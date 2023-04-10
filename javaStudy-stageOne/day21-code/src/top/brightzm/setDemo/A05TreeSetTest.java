package top.brightzm.setDemo;

import java.util.TreeSet;

public class A05TreeSetTest {
    public static void main(String[] args) {
        // 创建TreeSet集合，并添加3个学生对象

        //创建学生对象
        Student s1 = new Student("zhangsan",21);
        Student s2 = new Student("lisi",22);
        Student s3 = new Student("wangwu",23);
        Student s4 = new Student("zhaoliu",24);

        //添加到TreeSet中
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        //打印
        System.out.println(ts);



    }

}
