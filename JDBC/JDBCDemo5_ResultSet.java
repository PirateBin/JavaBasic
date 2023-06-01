package JDBC;

import JDBC.Objects.Account;

import java.sql.*;
import java.util.ArrayList;

public class JDBCDemo5_ResultSet {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //查询account账户表数据，封装为Account对象，并存储在集合中
        ArrayList<Account> list=new ArrayList<>();

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
            Account a=new Account(id,name,money);
            list.add(a);
        }

        System.out.println(list);

        //7.释放资源
        rs.close();
        stmt.close();
        conn.close();

    }
}
