package top.brightzm.Test.domain;

/**
 * @description:
 * @author: bright
 * @time: 2023/4/2 下午2:45
 */
public class Student {

    private String name;

    private int age;


    public Student() {
    }

    public Student(String str) {
        this.name = str.split(",")[0];
        this.age = Integer.parseInt(str.split(",")[1]);
    }

    public Student(String name, int age) {
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
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    public String toOtherString() {
        return name + "-" + age;
    }
}
