package top.brightzm.getMethodDemo;

import java.lang.reflect.Method;

/**
 * @description: 通过class获取方法
 * @author: bright
 * @time: 2022/11/2 下午5:57
 */
public class GetMethodDemo1 {
    public static void main(String[] args) throws NoSuchMethodException{
        Class stuClass = Student.class;
        // 获取public方法getSource,传参String
        Method getSource = stuClass.getMethod("getSource", String.class);
        System.out.println(getSource);
        // 获取继承的public方法,无参数
        Method getName = stuClass.getMethod("getName");
        System.out.println(getName);
        // 获取private方法getGrade,参数为int
        Method getGrade = stuClass.getMethod("getGrade", int.class);
        System.out.println(getGrade);

    }

}

class Student extends Person{
    public int getSource(String type){
        return 99;
    }

    public int getGrade(int year){
        return 1;
    }

}

class Person{
    public String getName(){
        return "Person";
    }


}
