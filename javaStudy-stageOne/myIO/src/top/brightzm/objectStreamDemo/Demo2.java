package top.brightzm.objectStreamDemo;

import java.io.*;

public class Demo2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 从文件中读取对象

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myIO/src/top" +
                "/brightzm/objectStreamDemo/a.txt"));

        Student stu = (Student) ois.readObject();

        System.out.println(stu);

        ois.close();

    }

}
