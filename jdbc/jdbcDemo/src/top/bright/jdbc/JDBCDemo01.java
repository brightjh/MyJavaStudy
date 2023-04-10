package top.bright.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// JDBC 快速入门
public class JDBCDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.注册驱动
        Class.forName("org.mariadb.jdbc.Driver");

        // 2.获取连接
        String url = "jdbc:mariadb://127.0.0.1:3306/JavaWebDB2";
        String username = "root";
        String password = "ROOT";

        Connection conn = DriverManager.getConnection(url, username, password);

        // 3.定义sql语句
        String sql = "UPDATE account SET money = 2000 WHERE id = 1";

        // 4.获取执行sql语句的对象 Statement
        Statement statement = conn.createStatement();

        // 5.执行sql
        int count = statement.executeUpdate(sql); // 受影响的行数

        // 6.处理结果
        System.out.println(count);

        // 7.释放资源
        statement.close();
        conn.close();

    }
}
