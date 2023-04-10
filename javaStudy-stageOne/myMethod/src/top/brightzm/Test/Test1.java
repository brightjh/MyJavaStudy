package top.brightzm.Test;

import top.brightzm.Test.domain.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @description: 将字符串转为student
 * @author: bright
 * @time: 2023/4/2 下午2:44
 */
public class Test1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Collections.addAll(list, "张三,23", "李四,24", "王五,25", "赵六,26");

        Student[] students = list.stream().map(Student::new).toArray(Student[]::new);

        // 获取姓名放到数组中
        String[] names = Arrays.stream(students).map(Student::getName).toArray(String[]::new);

        // 将student数组 拼成字符串

        String[] strings = Arrays.stream(students).map(Student::toOtherString).toArray(String[]::new);

        System.out.println(Arrays.toString(strings));


    }

}
