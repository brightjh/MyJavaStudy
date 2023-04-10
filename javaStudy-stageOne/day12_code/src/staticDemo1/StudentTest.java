package staticDemo1;

public class StudentTest {
    public static void main(String[] args) {
        // 创建第一个学生对象
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(22);
        stu1.setGender("男");
        stu1.teacherName = "老师";

        stu1.study();
        stu1.show();

        // 创建第二个学生对象
        Student stu2 = new Student();
        stu2.setName("李四");
        stu2.setAge(24);
        stu2.setGender("男");

        stu2.study();
        stu2.show();


    }

}
