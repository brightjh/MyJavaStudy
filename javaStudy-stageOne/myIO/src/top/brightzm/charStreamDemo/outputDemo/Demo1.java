package top.brightzm.charStreamDemo.outputDemo;

import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {

    public static void main(String[] args) throws IOException {
        // 输出
        FileWriter fw = new FileWriter("myIO\\b.txt",true);

        char[] chars = {'你','好','再','见'};

        fw.write(chars);

        fw.close();



    }

}
