package top.brightzm.BytesStreamDemo.outputDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("myIO\\a.txt");

        /*fos.write(65);
        fos.write(66);*/

        byte[] bytes = {65,66,67,68,69,70};

        fos.write(bytes);

        fos.close();

    }

}
