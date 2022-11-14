package arrayLIstTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // 键盘录入学生信息,保存到集合中
        ArrayList<Student> studentArrayList = new ArrayList<>();

        // 获取学生信息
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();
            if (!name.equals(" ")) {
                studentArrayList.add(new Student(name,age));
            } else {
                break;
            }
        }

        // 遍历输出

        for (int i = 0; i < studentArrayList.size(); i++) {
            Student stu = studentArrayList.get(i);
            System.out.println(stu.getStudentName()+","+stu.getStudentAge());
        }



    }
}
