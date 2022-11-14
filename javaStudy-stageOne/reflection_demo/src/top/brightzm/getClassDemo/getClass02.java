package top.brightzm.getClassDemo;

import java.lang.reflect.Field;

/**
 * @description: 通过class访问字段
 * @author: bright
 * @time: 2022/11/2 上午10:06
 */
public class getClass02 {
    public static void main(String[] args) throws Exception {
        Class stuClass = Student.class;

        // 获取public字段
        Field score = stuClass.getField("score");
        System.out.println(score);

        // 获取继承的public字段
        Field name = stuClass.getField("name");
        System.out.println(name);

        // 获取private字段
        Field grade = stuClass.getDeclaredField("grade");
        System.out.println(grade);


        // 获取字段信息
        Field f = String.class.getDeclaredField("value");
        System.out.println(f.getName());
        System.out.println(f.getType());
        System.out.println(f.getModifiers());
    }


}

class Student extends Person{
    public int score;
    private int grade;
}


class Person{
    public String name;
}
