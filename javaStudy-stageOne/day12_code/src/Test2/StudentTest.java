package Test2;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();
        Student stu1 = new Student("张三",22,"男");
        Student stu2 = new Student("李四",30,"男");
        Student stu3 = new Student("王五",24,"男");
        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);

        int maxAge = StudentUtil.getMaxAge(stu);
        System.out.println(maxAge);

    }
}
