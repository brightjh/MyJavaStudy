package top.brightzm.web.response;

import org.apache.commons.io.IOUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@WebServlet("/resp4")
public class Response4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // response 字节输出
        // 读取文件
        FileInputStream fis = new FileInputStream("src/main/java/top/brightzm/web/response/a.jpg");

        // 获取response 字节输出流
        ServletOutputStream os = response.getOutputStream();

        // 完成copy
        /*byte[] buff = new byte[1024];
        int len = 0;
        while ((len = fis.read(buff)) != -1){
            os.write(buff,0,len);
        }*/


        IOUtils.copy(fis,os);

        fis.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
