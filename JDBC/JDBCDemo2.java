package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接
        String url="jdbc:mysql://localhost:3306/mydb1?useSSL=false";
        String username="root";
        String password="0114";
        Connection conn= DriverManager.getConnection(url,username,password);

        //3.定义sql
        String sql1="update account set money=3000 where id=1";
        String sql2="update account set money=3000 where id=2";

        //4.获取执行sql的对象
        Statement stmt=conn.createStatement();

        //5.执行sql

        try {

            //开启事务
            conn.setAutoCommit(false);

            int count1 = stmt.executeUpdate(sql1);
            int count2 = stmt.executeUpdate(sql2);

            //int i=1/0;

            //6.处理结果
            System.out.println(count1);
            System.out.println(count2);
            //提交事务
            conn.commit();
        } catch (SQLException e) {
            //回滚事务
            conn.rollback();
            throw new RuntimeException(e);
        }

        //提交事务

        //7.释放资源
        stmt.close();
        conn.close();

    }
}
