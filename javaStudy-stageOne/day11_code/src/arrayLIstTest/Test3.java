package arrayLIstTest;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        // 创建student对象的集合

        // 创建集合
        ArrayList<Student> studentList = new ArrayList<>();

        // 创建student对象
        Student stu1 = new Student("张三", 22);
        Student stu2 = new Student("赵四",21);

        // 将student对象加入集合
        studentList.add(stu1);
        studentList.add(stu2);

        // 遍历集合

        for (int i = 0; i < studentList.size(); i++) {
            String name = studentList.get(i).getStudentName();
            int age = studentList.get(i).getStudentAge();
            System.out.println(name+age);

        }


    }
}
