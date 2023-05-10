package tcpdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveDemo {

    public static void main(String[] args) throws IOException {
        // 接收数据

        ServerSocket ss = new ServerSocket(10000);

        Socket socket = ss.accept();

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        int b;

        while ((b = reader.read()) != -1) {
            System.out.println((char) b);
        }

        socket.close();

        ss.close();
    }

}
