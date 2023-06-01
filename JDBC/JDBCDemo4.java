package JDBC;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo4 {

    //执行DQL
    @Test
    public void testResultSet() throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接
        String url="jdbc:mysql://localhost:3306/mydb1?useSSL=false";
        String username="root";
        String password="0114";
        Connection conn= DriverManager.getConnection(url,username,password);

        //3.定义SQL语句
        String sql="select * from account";

        //4.获取statement对象
        Statement stmt=conn.createStatement();

        //5.执行sql
        ResultSet rs=stmt.executeQuery(sql);

        //6.处理结果
        //遍历resultSet集合
        while(rs.next()){
            //获取数据
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double money = rs.getDouble("money");
            System.out.println(id+"-"+name+"-"+money);
        }

        //7.释放资源
        rs.close();
        stmt.close();
        conn.close();



    }

}
