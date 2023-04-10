package studentManage;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {

    private static final String ADD_STUDENT = "1";
    private static final String DEL_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String SELECT_STUDENT = "4";
    private static final String EXIT = "5";

    public static void startSystem() {

        ArrayList<Student> students = new ArrayList<>();

        loop:
        while (true) {
            System.out.println("--------欢迎使用学生管理系统-----------");
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 修改学生");
            System.out.println("4: 查询学生");
            System.out.println("5: 退出");
            System.out.println("请输入你的选择");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case ADD_STUDENT -> addStudent(students);
                case DEL_STUDENT -> delStudent(students);
                case UPDATE_STUDENT -> updateStudent(students);
                case SELECT_STUDENT -> selectStudent(students);
                case EXIT -> {
                    System.out.print("正在退出....");
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }


        }
    }

    // 添加学生
    public static void addStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学生ID");
            id = sc.next();
            if (containsID(id, students)) {
                System.out.println("学生ID已存在");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        System.out.println("请输入学生住址");
        String address = sc.next();
        Student stu = new Student(id, name, age, address);
        students.add(stu);
        System.out.println("学生信息添加成功");
    }

    // 删除学生
    public static void delStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入要删除的学生ID");
        String id = sc.next();
        int index = getIndex(id, students);
        if (index >= 0) {
            students.remove(index);
            System.out.println(id + "删除成功");
            return;
        } else {
            System.out.println("没有此学生");
        }
    }

    // 修改学生
    public static void updateStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生ID");
        String id = sc.next();
        int index = getIndex(id, students);
        if (index < 0) {
            System.out.println("学生不存在");
            return;
        }
        System.out.println("请输入新的学生姓名");
        String name = sc.next();
        System.out.println("请输入新的学生年龄");
        int age = sc.nextInt();
        System.out.println("请输入新的学生住址");
        String address = sc.next();
        Student stu = students.get(index);
        stu.setName(name);
        stu.setAge(age);
        stu.setHomeAddress(address);
        System.out.println("修改用户成功");
    }

    // 查询学生
    public static void selectStudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("当前无学生信息,请添加后查询");
            return;
        }

        System.out.println("id\t姓名\t年龄\t家体住址");
        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getHomeAddress());

        }

    }


    // 判断ID是否存在
    public static boolean containsID(String id, ArrayList<Student> students) {
//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getId().equals(id)) {
//                return true;
//            }
//        }
        return getIndex(id, students) >= 0;
    }

    // 获取学生索引
    public static int getIndex(String id, ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }


}
