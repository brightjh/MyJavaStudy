package top.brightzm.bufferedStreamDemo.test;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test4 {

    public static void main(String[] args) throws IOException {
        // 第二种排序方式
        BufferedReader br = new BufferedReader(new FileReader("E:\\HUAWEI\\csb.txt"));

        TreeMap<Integer,String> treeMap = new TreeMap<>();

        String line;

        while ((line = br.readLine()) != null){
            String[] split = line.split("\\.");
            treeMap.put(Integer.parseInt(split[0]),line);
        }

        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\HUAWEI\\csb_dest.txt"));

        Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }

        bw.close();
    }

}
