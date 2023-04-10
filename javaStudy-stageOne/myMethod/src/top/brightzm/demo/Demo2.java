package top.brightzm.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: bright
 * @time: 2023/4/1 下午8:54
 */
public class Demo2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list,"刘培强","刘华强","刘启","韩朵朵","韩子昂");

        list.stream().filter(new StringOperation()::StringJudge).forEach(System.out::println);



    }

}
