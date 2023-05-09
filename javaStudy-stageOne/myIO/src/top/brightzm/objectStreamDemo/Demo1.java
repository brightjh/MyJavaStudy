package top.brightzm.objectStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {

    public static void main(String[] args) throws IOException {
        // 将object写入本地文件

        Student stu = new Student("zhangsan",23);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myIO\\src\\top" +
                "\\brightzm\\objectStreamDemo\\a.txt"));

        oos.writeObject(stu);

        
        oos.close();

    }

}
