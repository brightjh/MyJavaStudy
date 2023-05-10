package tcpdemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SendDemo {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 10000);

        OutputStream os = socket.getOutputStream();

        os.write("你好，世界".getBytes());

        os.close();

        socket.close();
    }

}
