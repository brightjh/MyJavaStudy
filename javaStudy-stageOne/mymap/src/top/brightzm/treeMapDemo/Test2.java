package top.brightzm.treeMapDemo;

import top.brightzm.treeMapDemo.domain.Student;

import java.util.TreeMap;

/**
 * @description: Tree map key:学生对象 value:籍贯 按年龄排序
 * @author: bright
 * @time: 2023/3/26 下午5:30
 */
public class Test2 {

    public static void main(String[] args) {
        TreeMap<Student, String> students = new TreeMap<>();

        students.put(new Student("zhangsan", 21), "beijing");
        students.put(new Student("lisi", 24), "shanghai");
        students.put(new Student("wangwu", 24), "nanjing");

        students.forEach((Student student, String s) ->
                System.out.println(student + " : " + s));
    }

}
