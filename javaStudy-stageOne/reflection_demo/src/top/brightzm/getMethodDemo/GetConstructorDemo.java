package top.brightzm.getMethodDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetConstructorDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // 获取所有公共构造

        Class<?> clazz = Class.forName("top.brightzm.getMethodDemo.Phone");

        /*Constructor<?>[] constructors = clazz.getConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }*/

        /*Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();

        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }*/

        Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);

        constructor.setAccessible(true);

        Phone p = (Phone) constructor.newInstance("HUAWEI", 22);

        System.out.println(p);
    }

}
