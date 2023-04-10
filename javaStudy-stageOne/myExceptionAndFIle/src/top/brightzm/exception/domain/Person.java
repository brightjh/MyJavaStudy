package top.brightzm.exception.domain;

import top.brightzm.exception.AgeOutOfBoundsException;
import top.brightzm.exception.NameFormatException;

/**
 * @description:
 * @author: bright
 * @time: 2023/4/3 上午10:37
 */
public class Person {

    private String name;

    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        int len = name.length();
        if (len < 3 || len > 10) {
            throw new NameFormatException("名称格式有误");
        }

        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        if (age<18||age>30){
            throw new AgeOutOfBoundsException("年龄超出范围");
        }
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
