package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接
        String url="jdbc:mysql://localhost:3306/mydb1?useSSL=false";
        String username="root";
        String password="0114";
        Connection conn=DriverManager.getConnection(url,username,password);

        //3.定义sql
        String sql="update account set money=2000 where id=1";

        //4.获取sql对象Statement
        Statement stmt=conn.createStatement();

        //5.执行sql
        int count=stmt.executeUpdate(sql);  //受影响的行数

        //6.处理结果
        System.out.println(count);

        //7.释放资源
        stmt.close();
        conn.close();





    }
}
