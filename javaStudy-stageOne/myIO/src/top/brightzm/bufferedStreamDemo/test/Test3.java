package top.brightzm.bufferedStreamDemo.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test3 {

    public static void main(String[] args) throws IOException {
        // 恢复出师表顺序
        BufferedReader br = new BufferedReader(new FileReader("E:\\HUAWEI\\csb.txt"));

        List<String> lines = new ArrayList<>();

        String line;

        while ((line = br.readLine()) != null){
            lines.add(line);
        }

        br.close();

        List<String> collect = lines.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.split("\\.")[0]) - Integer.parseInt(o2.split("\\.")[0]);
            }
        }).toList();

        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\HUAWEI\\csb_out.txt"));

        for (String s : collect) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
    }

}
