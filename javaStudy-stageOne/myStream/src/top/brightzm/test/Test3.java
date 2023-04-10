package top.brightzm.test;

import top.brightzm.test.domain.Actor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description:
 * @author: bright
 * @time: 2023/3/31 下午1:43
 */
public class Test3 {

    public static void main(String[] args) {
        List<String> manActors = new ArrayList<>();
        List<String> womenActors = new ArrayList<>();

        Collections.addAll(manActors, "张三,23", "李四四,24", "王五,25", "赵赵六,26", "李二,22", "朱重八,28");
        Collections.addAll(womenActors, "杨三,23", "杨四四,24", "王五,25", "杨赵六,26", "李二,22", "朱重八,28");


        Stream<String> stream1 = manActors.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);
        Stream<String> stream2 = womenActors.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);

        List<Actor> actors = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());

        System.out.println(actors);

    }


}
