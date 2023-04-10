package top.bright.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo05_ResultSet {

    // DQL查询
    @Test
    public void testDQL() throws Exception{
        // 1.注册驱动
        // Class.forName("org.mariadb.jdbc.Driver");

        // 2.获取连接
        String url = "jdbc:mariadb://127.0.0.1:3306/JavaWebDB2";
        String username = "root";
        String password = "ROOT";

        Connection conn = DriverManager.getConnection(url, username, password);

        // 3.定义sql语句
        String sql = "SELECT * FROM account";

        // 4.获取执行sql语句的对象 Statement
        Statement statement = conn.createStatement();

        // 5.执行sql
        ResultSet rs = statement.executeQuery(sql);

        // 6.处理结果
        // 指针向下移动，并判断数据是否有效
       /* while (rs.next()){
            // 获取数据
            int id = rs.getInt(1);
            String name = rs.getString(2);
            int money = rs.getInt(3);
            System.out.println(id);
            System.out.println(name);
            System.out.println(money);
            System.out.println("------------------");
        }*/
        // 重载方法
        while (rs.next()){
            // 获取数据
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int money = rs.getInt("money");
            System.out.println(id);
            System.out.println(name);
            System.out.println(money);
            System.out.println("------------------");
        }


        // 7.释放资源
        rs.close();
        statement.close();
        conn.close();


    }
}
