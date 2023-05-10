package top.brightzm.getMethodDemo;

import java.lang.reflect.Method;

/**
 * @description: 通过反射调用方法
 * @author: bright
 * @time: 2022/11/2 下午6:17
 */
public class GetMethodDemo2 {
    public static void main(String[] args) throws Exception {
        // 调用普通方法

        /*String s = "Hello World";

        Method method = String.class.getMethod("substring", int.class);

        String r = (String) method.invoke(s, 6);

        System.out.println(r);*/

        // 调用静态方法

        /*Method method = Integer.class.getMethod("parseInt", String.class);

        Integer i = (Integer) method.invoke(null, "123");

        System.out.println(i);*/

        // 调用非public方法

        Phone d = new Phone();

        Method m = d.getClass().getDeclaredMethod("setName", String.class);

        m.setAccessible(true);

        m.invoke(d,"屁屁");

        // System.out.println(d.getName());


    }
}

class Dog{
    private String name;
    private int age;


    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Dog{name = " + name + ", age = " + age + "}";
    }
}
