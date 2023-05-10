package udpdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo {

    public static void main(String[] args) throws IOException {
        // 接收数据

        DatagramSocket ds = new DatagramSocket(1000);

        byte[] bytes = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        ds.receive(dp);

        // 解析数据
        byte[] data = dp.getData();

        int length = dp.getLength();

        InetAddress address = dp.getAddress();

        int port = dp.getPort();

        System.out.println("接收数据: " + new String(bytes, 0, length));

        System.out.println("数据来源于: " + address.getHostAddress() + ":" + port);


    }

}
