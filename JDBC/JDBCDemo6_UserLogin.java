package JDBC;

import org.junit.Test;

import java.sql.*;

public class JDBCDemo6_UserLogin {
    @Test
    public void Test() throws Exception {
        //用户登陆案例

        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.建立连接
        String url="jdbc:mysql://localhost:3306/mydb1?useSSL=false";
        String username="root";
        String password="0114";
        Connection conn= DriverManager.getConnection(url,username,password);

        //3.接收用户收入的用户名和密码
        String name="zhangsan";
        String pwd="123";

        String sql="select * from tb_user where username='"+name+"' and password='"+pwd+"'";

        //4.获取stmt对象
        Statement stmt=conn.createStatement();

        //5.执行sql
        ResultSet rs = stmt.executeQuery(sql);

        //6.判断登陆是否成功
        if(rs.next()){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }

        //7.释放资源
        rs.close();
        stmt.close();
        conn.close();

    }

    @Test
    //演示sql注入
    public void sql_inject() throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.建立连接
        String url="jdbc:mysql://localhost:3306/mydb1?useSSL=false";
        String username="root";
        String password="0114";
        Connection conn= DriverManager.getConnection(url,username,password);

        //3.接收用户收入的用户名和密码
        String name="wangwu";
        String pwd="' or '1'='1";

        String sql="select * from tb_user where username='"+name+"' and password='"+pwd+"'";

        //4.获取stmt对象
        Statement stmt=conn.createStatement();

        //5.执行sql
        ResultSet rs = stmt.executeQuery(sql);

        //6.判断登陆是否成功
        if(rs.next()){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }

        //7.释放资源
        rs.close();
        stmt.close();
        conn.close();
    }





}
