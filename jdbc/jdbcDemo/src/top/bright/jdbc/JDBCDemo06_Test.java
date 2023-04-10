package top.bright.jdbc;

import top.bright.pojo.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBCDemo06_Test {
    public static void main(String[] args) throws Exception {
        // 查询account账户表数据，封装为Account对象，并存储到ArrayList集合中

        // 2.注册驱动
        Class.forName("org.mariadb.jdbc.Driver");

        // 3.获取连接
        String url = "jdbc:mariadb://127.0.0.1:3306/JavaWebDB2";
        String username = "root";
        String password = "ROOT";
        Connection conn = DriverManager.getConnection(url, username, password);

        // 4.sql语句
        String sql = "SELECT id,name,money FROM account";

        // 5.获取sql执行对象
        Statement stat = conn.createStatement();

        // 6.执行sql语句
        ResultSet rs = stat.executeQuery(sql);

        // 7.将查询结果储存到集合中
        ArrayList<Account> accounts = new ArrayList<>();

        // 遍历查询结果的每一行数据存储到集合中
        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double money = rs.getDouble("money");
            accounts.add(new Account(id,name,money));
        }

        // 获取数组中数据
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

}
