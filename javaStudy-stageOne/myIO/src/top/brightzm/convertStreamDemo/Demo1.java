package top.brightzm.convertStreamDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Demo1 {

    public static void main(String[] args) throws IOException {
        // 将GBK转为utf-8格式

        FileReader fr = new FileReader("E:\\HUAWEI\\gbkfile.txt", Charset.forName("GBK"));

        FileWriter fw = new FileWriter("E:\\HUAWEI\\utf8file.txt",Charset.forName("UTF-8"));

        char[] chars = new char[1024];

        int len;

        while ((len = fr.read(chars)) != -1){

            fw.write(chars);

        }

        fw.close();

        fr.close();

    }

}
