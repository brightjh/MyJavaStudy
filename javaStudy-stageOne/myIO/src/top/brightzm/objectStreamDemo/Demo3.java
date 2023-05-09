package top.brightzm.objectStreamDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo3 {

    public static void main(String[] args) throws IOException {
        // 写入多个对象到本地

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myIO/src/top/brightzm" +
                "/objectStreamDemo/b.txt"));

        List<Student> students = new ArrayList<>();

        students.add(new Student("zhang",20));

        students.add(new Student("li",21));

        students.add(new Student("zhao",22));

        oos.writeObject(students);

        oos.close();
    }

}
