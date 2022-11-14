package top.bright.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;
import top.bright.pojo.Brand;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Properties;

// 品牌表的增删改查
public class BrandTest {
    /*
     * 1. sql语句怎么写
     * 2. 是否需要参数
     * 3. 结果怎么处理
     * */


    // 查询所有数据
    @Test
    public void SelectAllTest() throws Exception {
        // 注册驱动
        Class.forName("org.mariadb.jdbc.Driver");

        // 获取连接
        /*String url = "jdbc:mariadb://127.0.0.1:3306/JavaWebDB2";
        String username = "root";
        String password = "ROOT";
        Connection conn = DriverManager.getConnection(url, username, password);*/


        // 获取连接池对象
        Properties prop = new Properties();
        prop.load(new FileInputStream("/home/bright/IdeaProjects/jdbc/jdbcDemo/src/druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        // 获取数据库连接 Connection
        Connection conn = dataSource.getConnection();

        // 获取 prepareStatement对象
        String sql = "SELECT id, brand_name, company_name, ordered, description, status FROM tb_brand;";

        PreparedStatement pstat = conn.prepareStatement(sql);

        // 执行sql语句
        ResultSet rs = pstat.executeQuery();

        // 对结果进行操作
        ArrayList<Brand> brands = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            Integer ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");
            brands.add(new Brand(id, brandName, companyName, ordered, description, status));
        }
        System.out.println(brands);

        // 释放资源
        rs.close();
        pstat.close();
        conn.close();

    }

    // 创建品牌存入数据表中
    @Test
    public void InsertTest() throws Exception {

        // 获取用户提交的数据（模拟）
        String brandName = "APPLE";
        String companyName = "苹果技术有限公司";
        int ordered = 2;
        String description = "苹果强的很";
        int status = 1;


        // 创建连接
        // 创建连接池对象
        Properties prop = new Properties();
        prop.load(new FileInputStream("/home/bright/IdeaProjects/jdbc/jdbcDemo/src/druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        // 获取连接
        Connection conn = dataSource.getConnection();

        // 创建sql
        String sql = "INSERT INTO tb_brand(brand_name, company_name, ordered, description, status) VALUES (?,?,?,?,?)";

        // 获取执行对象prepareStatement
        PreparedStatement pstat = conn.prepareStatement(sql);

        // 填写参数



        pstat.setString(1, brandName);
        pstat.setString(2, companyName);
        pstat.setInt(3, ordered);
        pstat.setString(4, description);
        pstat.setInt(5, status);

        // 执行sql语句，对结果进行处理
        int i = pstat.executeUpdate();
        System.out.println(i >= 1);

        // 释放资源
        pstat.close();
        conn.close();
    }

    // 根据id修改数据
    @Test
    public void updateTest() throws Exception {
        // 获取用户提交的数据
        String newBrandName = "apple";
        String newCompanyName = "苹果科技有限公司";
        int newOrdered = 50;
        String newDescription = "苹果信号助力每一对异地恋";
        int newStatus = 0;
        int updateID = 4;

        // 创建连接
        Properties prop = new Properties();
        prop.load(new FileInputStream("/home/bright/IdeaProjects/jdbc/jdbcDemo/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        Connection conn = dataSource.getConnection();

        // 定义sql
        String sql = "UPDATE tb_brand SET brand_name = ?,company_name = ?, ordered = ? ,description = ?,status = ? WHERE id = ?";



        // 获取执行sql对象
        PreparedStatement pstat = conn.prepareStatement(sql);

        pstat.setString(1,newBrandName);
        pstat.setString(2,newCompanyName);
        pstat.setInt(3,newOrdered);
        pstat.setString(4,newDescription);
        pstat.setInt(5,newStatus);
        pstat.setInt(6,updateID);

        // 执行sql语句,处理结果
        int i = pstat.executeUpdate();

        System.out.println(i >0);

        // 释放资源
        pstat.close();
        conn.close();

    }


    // 根据id删除数据
    @Test
    public void delTest() throws Exception{
        // 获取用户数据
        int delID = 1;

        // 获取连接
        Properties prop = new Properties();
        prop.load(new FileInputStream("/home/bright/IdeaProjects/jdbc/jdbcDemo/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        Connection conn = dataSource.getConnection();

        // 获取执行对象
        String sql = "DELETE FROM tb_brand WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,delID);

        // 执行sql语句并对结果进行处理
        int i = pstmt.executeUpdate();

        System.out.println(i > 0 );

        // 释放资源
        pstmt.close();
        conn.close();

    }

}
