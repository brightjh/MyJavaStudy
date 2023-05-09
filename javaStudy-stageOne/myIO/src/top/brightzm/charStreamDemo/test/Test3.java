package top.brightzm.charStreamDemo.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;

public class Test3 {

    public static void main(String[] args) throws IOException {
        // 对文档中数据进行排序


        // 获取文件
        FileReader fr = new FileReader("myIO\\src\\top\\brightzm\\charStreamDemo\\test\\a.txt");

        StringBuilder sb = new StringBuilder();

        int i;

        while ((i = fr.read()) != -1) {
            sb.append((char) i);
        }

        fr.close();

        // System.out.println(sb);


        // 排序

        Integer[] array = Arrays.stream(sb.toString().split("-"))
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                })
                .sorted()
                .toArray(Integer[]::new);

        // 写入文件

        FileWriter fw = new FileWriter("myIO\\src\\top\\brightzm\\charStreamDemo\\test\\b.txt");

        String replaced = Arrays.toString(array).replace(", ", "-");

        fw.write(replaced.substring(1, replaced.length() - 1));

        fw.close();


    }

}
