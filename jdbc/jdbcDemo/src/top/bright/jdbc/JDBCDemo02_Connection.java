package top.bright.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo02_Connection {
    public static void main(String[] args) throws SQLException {
        // 1.注册驱动
        // Class.forName("org.mariadb.jdbc.Driver");

        // 2.获取连接
        String url = "jdbc:mariadb://127.0.0.1:3306/JavaWebDB2";
        String username = "root";
        String password = "ROOT";

        Connection conn = DriverManager.getConnection(url, username, password);

        // 3.定义sql语句
        String sql1 = "UPDATE account SET money = 3000 WHERE id = 1";

        // 4.获取执行sql语句的对象 Statement
        Statement statement = conn.createStatement();


        // 3.定义sql语句
        String sql2 = "UPDATE account SET money = 3000 WHERE id = 2";

        // 事务管理
        try {
            // 开启事务
            conn.setAutoCommit(false);

            // 5.执行sql
            int count1 = statement.executeUpdate(sql1); // 受影响的行数

            // 6.处理结果
            System.out.println(count1);

            // int i = 3 / 0;

            // 5.执行sql
            int count2 = statement.executeUpdate(sql2); // 受影响的行数

            // 6.处理结果
            System.out.println(count2);

            // 提交事务
            conn.commit();
        } catch (SQLException e) {
            conn.rollback();
            throw new RuntimeException(e);

        }


        // 7.释放资源
        statement.close();
        conn.close();


    }
}
