package top.brightzm.getMethodDemo;

import java.lang.reflect.Constructor;

/**
 * @description: 通过反射调用构造方法
 * @author: bright
 * @time: 2022/11/3 上午8:19
 */
public class GetMethodDemo3 {

    public static void main(String[] args)throws Exception {
        //1. newInstance方法 不适用
        Person p = Person.class.newInstance();
        // 只能调用public修饰的空参构造

        //2. 获取constructor 对象
        Constructor cons1 = Integer.class.getConstructor(int.class);
        // 调用方法
        Integer int1 = (Integer) cons1.newInstance(123);
        System.out.println(int1);

        Constructor cons2 = Integer.class.getConstructor(String.class);

        Integer int2 = (Integer) cons2.newInstance("456");
        System.out.println(int2);

    }

}


