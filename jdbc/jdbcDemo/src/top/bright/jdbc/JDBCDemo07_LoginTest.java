package top.bright.jdbc;


import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// 登录测试
public class JDBCDemo07_LoginTest {
    public static void main(String[] args) throws Exception {
        // 1.注册驱动
        Class.forName("org.mariadb.jdbc.Driver");

        // 2.创建连接
        String url = "jdbc:mariadb://127.0.0.1:3306/JavaWebDB2";
        String username = "root";
        String password = "ROOT";

        Connection conn = DriverManager.getConnection(url, username, password);

        // 3.登陆使用的sql语句
        String loginName = "zs";
        String LoginPassword = "456";

        String sql = "SELECT id, username, password FROM users WHERE username = '" + loginName + "' AND password = '" + LoginPassword + "'";

        // 4.获取执行SQL语句对象
        Statement stat = conn.createStatement();

        // 5.执行sql语句
        ResultSet rs = stat.executeQuery(sql);

        // 6.对结果进行操作
        if (rs.next()) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }

        // 7.释放资源
        rs.close();
        stat.close();
        conn.close();

    }

    // sql注入演示
    @Test
    public void loginTest_injection() throws Exception {
        // 1.注册驱动
        Class.forName("org.mariadb.jdbc.Driver");

        // 2.创建连接
        String url = "jdbc:mariadb://127.0.0.1:3306/JavaWebDB2";
        String username = "root";
        String password = "ROOT";

        Connection conn = DriverManager.getConnection(url, username, password);

        // 3.登陆使用的sql语句
        String loginName = "fkwlkejf";
        String LoginPassword = "' OR '1' = '1";

        String sql = "SELECT id, username, password FROM users WHERE username = '" + loginName + "' AND password = '" + LoginPassword + "'";

        // 4.获取执行SQL语句对象
        Statement stat = conn.createStatement();

        // 5.执行sql语句
        ResultSet rs = stat.executeQuery(sql);

        // 6.对结果进行操作
        if (rs.next()) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }

        // 7.释放资源
        rs.close();
        stat.close();
        conn.close();

    }

}
