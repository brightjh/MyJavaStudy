package top.brightzm.objectStreamDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo4 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 从本地读取多个对象

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myIO/src/top" +
                "/brightzm/objectStreamDemo/b.txt"));

        List<Student> list = (ArrayList<Student>) ois.readObject();

        for(Student stu : list){
            System.out.println(stu);
        }

        ois.close();

    }

}
