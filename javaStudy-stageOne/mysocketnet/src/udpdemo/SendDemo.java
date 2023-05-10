package udpdemo;

import java.io.IOException;
import java.net.*;

public class SendDemo {

    public static void main(String[] args) throws IOException {
        // 发送数据

        DatagramSocket ds = new DatagramSocket();

        byte[] bytes = "Hello world".getBytes();

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 1000);

        ds.send(dp);

        ds.close();

    }

}
