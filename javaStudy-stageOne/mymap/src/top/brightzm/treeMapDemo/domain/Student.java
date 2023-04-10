package top.brightzm.treeMapDemo.domain;

import java.util.Objects;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/27 下午7:15
 */
public class Student implements Comparable<Student> {

    private String name;

    private int age;


    public Student() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student o) {
        // this 将要添加的元素
        // 0 已经存在的元素
        int com = this.getAge() - o.getAge();

        com = com == 0 ? this.getName().compareTo(o.getName()) : com;

        return com;
        // 返回值
        // 负数: 表示当前添加的元素是小的 存左边
        // 正数: 大的 存右边
        // 0 已经存在 舍弃

    }
}
