package top.bright.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.*;


public class JDBCDemo04_Statement {
    // Statement 详解

    @Test
    public void testDML() throws Exception{
        // 1.注册驱动
        // Class.forName("org.mariadb.jdbc.Driver");

        // 2.获取连接
        String url = "jdbc:mariadb://127.0.0.1:3306/JavaWebDB2";
        String username = "root";
        String password = "ROOT";

        Connection conn = DriverManager.getConnection(url, username, password);

        // 3.定义sql语句
        // String sql = "INSERT INTO account(name, money) VALUES ('王五',200)";
        String sql = "DELETE FROM account WHERE id =1";
        // String sql = "UPDATE account SET money = 1000 WHERE id = 2";

        // 4.获取执行sql语句的对象 Statement
        Statement statement = conn.createStatement();

        // 5.执行sql
        int count = statement.executeUpdate(sql); // 受影响的行数,

        // 6.处理结果
        if (count >0) {
            System.out.println("执行成功");
        }else {
            System.out.println("执行失败");
        }

        // 7.释放资源
        statement.close();
        conn.close();

    }

    @Test
    public void testDDL() throws Exception {
        // 1.注册驱动
        // Class.forName("org.mariadb.jdbc.Driver");

        // 2.获取连接
        String url = "jdbc:mariadb://127.0.0.1:3306/JavaWebDB2";
        String username = "root";
        String password = "ROOT";

        Connection conn = DriverManager.getConnection(url, username, password);

        // 3.定义sql语句
        String sql = "DROP DATABASE DB1";

        // 4.获取执行sql语句的对象 Statement
        Statement statement = conn.createStatement();

        // 5.执行sql
        int count = statement.executeUpdate(sql); // 受影响的行数,DDL可能返回0

        // 6.处理结果
        /*if (count >0) {
            System.out.println("执行成功");
        }else {
            System.out.println("执行失败");
        }*/
        System.out.println(count);

        // 7.释放资源
        statement.close();
        conn.close();

    }


}
