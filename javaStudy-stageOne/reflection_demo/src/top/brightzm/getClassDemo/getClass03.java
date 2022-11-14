package top.brightzm.getClassDemo;

import java.lang.reflect.Field;

/**
 * @description: 获取字段值并设定
 * @author: bright
 * @time: 2022/11/2 下午1:43
 */
public class getClass03 {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("小黑");

        Class cls = cat.getClass();
        Field field = cls.getDeclaredField("name");

        // 通过字段获取对象的字段值
        field.setAccessible(true);
        Object value = field.get(cat);
        System.out.println(value);

        // 设置字段值
        field.set(cat,"小黄");
        System.out.println(cat.getName());

    }

}

class Cat{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}