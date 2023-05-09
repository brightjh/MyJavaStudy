package top.brightzm.charStreamDemo.inputDemo;

import java.io.FileReader;
import java.io.IOException;

public class Demo1 {

    public static void main(String[] args) throws IOException {
        // 空参read方法

        FileReader fr = new FileReader("myIO\\a.txt");

        int ch;

        while ((ch = fr.read())!= -1){
            System.out.print((char) ch);
        }

        fr.close();


    }


}
