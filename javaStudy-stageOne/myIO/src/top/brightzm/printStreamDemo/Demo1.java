package top.brightzm.printStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class Demo1 {

    public static void main(String[] args) throws FileNotFoundException {
        // 字节打印流
        PrintStream ps = new PrintStream(new FileOutputStream("myIO\\src\\print.txt"),
                true, Charset.forName("UTF-8"));

        ps.println(97);
        ps.println(true);


        ps.close();


    }

}
