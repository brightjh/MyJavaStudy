package Test2;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){};

    // 获取最大年龄
    public static int getMaxAge(ArrayList<Student> students){
        int maxAge = students.get(0).getAge();
        for (int i = 1; i < students.size(); i++) {
            int age = students.get(i).getAge();
            if (age>maxAge){
                maxAge = age;
            }
        }
        return maxAge;
    }

}
