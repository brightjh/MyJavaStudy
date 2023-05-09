package top.brightzm.BytesStreamDemo.outputDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

    // 写出一段文字到本地文件中

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("myIO\\a.txt");
        // 1. 参数可以是字符串表示的路径或者file对象
        // 2. 文件不存在会创建一个新的文件 但需要保证父级路径是存在的
        // 3. 文件已存在 则会清空文件

        fos.write(65);
        // 1. ASCII字符对应的字符

        fos.close();
        // 每次必须要释放资源

    }


}
