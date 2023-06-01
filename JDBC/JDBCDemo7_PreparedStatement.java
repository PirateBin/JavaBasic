package JDBC;

import org.junit.Test;

import java.sql.*;

/*
    preparedStatement的作用：
    预编译SQL，性能更高
    防止SQL注入：将敏感字符进行转义
 */

public class JDBCDemo7_PreparedStatement {

    @Test
    public void testPreparedStatement() throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.建立连接
        String url="jdbc:mysql://localhost:3306/mydb1?useSSL=false";
        String username="root";
        String password="0114";
        Connection conn= DriverManager.getConnection(url,username,password);

        //3.定义sql
        String name="zhangsan";
        String pwd="' or '1'='1";

        String sql="select * from tb_user where username=? and password=?";


        //4.获取stmt对象
        PreparedStatement pstmt=conn.prepareStatement(sql);

        //5.设置pstmt的值
        pstmt.setString(1,name);
        pstmt.setString(2,pwd);

        //5.执行sql
        ResultSet rs = pstmt.executeQuery();

        //6.判断登陆是否成功
        if(rs.next()){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }

        //7.释放资源
        rs.close();
        pstmt.close();
        conn.close();
    }


    //preparedStatement 的预编译
    @Test
    @SuppressWarnings("all")
    public void testPreparedStatement2() throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.建立连接
        //通过参数开启预编译 useServerPrepStmts=true
        String url="jdbc:mysql://localhost:3306/mydb1?useSSL=false&useServerPrepStmts=true";
        String username="root";
        String password="0114";
        Connection conn= DriverManager.getConnection(url,username,password);

        //3.定义sql
        String name="zhangsan";
        String pwd="123";

        String sql="select * from tb_user where username=? and password=?";


        //4.获取stmt对象
        PreparedStatement pstmt=conn.prepareStatement(sql);

        //5.设置pstmt的值
        pstmt.setString(1,name);
        pstmt.setString(2,pwd);

        //5.执行sql
        ResultSet rs = pstmt.executeQuery();

        //6.判断登陆是否成功
        if(rs.next()){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }

        //7.释放资源
        rs.close();
        pstmt.close();
        conn.close();
    }

}
