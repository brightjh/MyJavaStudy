package top.brightzm.bufferedStreamDemo.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {


    public static void main(String[] args) throws IOException {
        // 使用字符缓冲流读取文件
        BufferedReader br = new BufferedReader(new FileReader("myIO\\a.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }

}
