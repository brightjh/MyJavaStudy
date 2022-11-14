package top.brightzm.setDemo;

import java.util.LinkedHashSet;

public class A03LinkedHashSetDemo {
    public static void main(String[] args) {
        // 创建学生对象
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("张三",23);

        // 存入集合
        LinkedHashSet<Student> students = new LinkedHashSet<>();

        System.out.println(students.add(s3));
        System.out.println(students.add(s2));
        System.out.println(students.add(s1));
        System.out.println(students.add(s4));

        // 遍历集合
        System.out.println(students);

    }
}
