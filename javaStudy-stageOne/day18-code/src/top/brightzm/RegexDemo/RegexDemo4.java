package top.brightzm.RegexDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) throws IOException {
        // 从网络中爬取身份证号

        // 创建url对象
        URL url = new URL("https://m.sengzan.com/jiaoyu/29104.html");

        // 连接
        URLConnection con = url.openConnection();

        // 创建对象去读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line;
        // 创建正则表达式对象
        String regex = "[1-9]\\d{5}(18|19|20)\\d{2}(0\\d|10|11|12)(0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        Pattern p = Pattern.compile(regex);

        while ((line = br.readLine())!= null){
            // System.out.println(line);

            // 创建文本识别器对象
            Matcher m = p.matcher(line);
            while (m.find()){
                System.out.println(m.group());
            }

        }
        br.close();



    }

}
