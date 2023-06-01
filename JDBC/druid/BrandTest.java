package JDBC.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BrandTest {

        //增删改查

    //查询所有
    /*
    1.SQL
    2.参数
    3.结果
     */
    @Test
    public void testSelectAll() throws Exception {
        //1.获取连接
        Properties prop=new Properties();
        prop.load(new FileInputStream("src\\JDBC\\druid\\druid.properties"));
        //获取数据连接池对象
        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
        Connection conn=dataSource.getConnection();

        //2.定义SQL语句
        String sql="select * from tb_brand";

        //3.获取pstmt对象
        PreparedStatement pstmt=conn.prepareStatement(sql);

        //4.设置参数

        //5.执行sql
        ResultSet rs=pstmt.executeQuery();

        //6.处理结果
        List<Brand> list=new ArrayList<>();
        Brand brand=null;
        while(rs.next()){
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");
            brand=new Brand(id,brandName,companyName,ordered,description,status);
            list.add(brand);
        }

        System.out.println(list);

        //7.释放资源
        rs.close();
        pstmt.close();
        conn.close();


    }


    /*
    1.SQL
    2.参数
    3.结果
     */
    @Test
    public void testInsert() throws Exception {
        //接收页面提交的参数
        String brandName="Apple";
        String companyName="苹果公司";
        int order=1;
        String description="苹果生态";
        int status=0;



        //1.获取连接
        Properties prop=new Properties();
        prop.load(new FileInputStream("src\\JDBC\\druid\\druid.properties"));
        //获取数据连接池对象
        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
        Connection conn=dataSource.getConnection();

        //2.定义SQL语句
        String sql="insert into tb_brand(brand_name, company_name, ordered, description, status) values" +
                "(?,?,?,?,?)";

        //3.获取pstmt对象
        PreparedStatement pstmt=conn.prepareStatement(sql);

        //4.设置参数
        pstmt.setString(1,brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,order);
        pstmt.setString(4,description);
        pstmt.setInt(5,status);


        //5.执行sql
        int count=pstmt.executeUpdate();    //影响的行数

        //6.处理结果
        System.out.println(count>0);


        //7.释放资源

        pstmt.close();
        conn.close();


    }


    /*
1.SQL
2.参数
3.结果
 */
    //修改数据
    @Test
    public void testUpdate() throws Exception {
        //接收页面提交的参数
        String brandName="Apple";
        String companyName="苹果公司";
        int order=2;
        String description="苹果生态yyds";
        int status=0;
        int id=4;



        //1.获取连接
        Properties prop=new Properties();
        prop.load(new FileInputStream("src\\JDBC\\druid\\druid.properties"));
        //获取数据连接池对象
        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
        Connection conn=dataSource.getConnection();

        //2.定义SQL语句
        String sql="update tb_brand set brand_name=?," +
                " company_name=?," +
                " ordered=?," +
                " description=?," +
                " status=?" +
                " where id=?";

        //3.获取pstmt对象
        PreparedStatement pstmt=conn.prepareStatement(sql);

        //4.设置参数
        pstmt.setString(1,brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,order);
        pstmt.setString(4,description);
        pstmt.setInt(5,status);
        pstmt.setInt(6,id);


        //5.执行sql
        int count=pstmt.executeUpdate();    //影响的行数

        //6.处理结果
        System.out.println(count>0);


        //7.释放资源

        pstmt.close();
        conn.close();


    }


    /*
1.SQL
2.参数
3.结果
*/
    //删除数据
    @Test
    public void testDelete() throws Exception {
        //接收页面提交的参数
        int id=4;



        //1.获取连接
        Properties prop=new Properties();
        prop.load(new FileInputStream("src\\JDBC\\druid\\druid.properties"));
        //获取数据连接池对象
        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
        Connection conn=dataSource.getConnection();

        //2.定义SQL语句
        String sql="delete from tb_brand where id=?";

        //3.获取pstmt对象
        PreparedStatement pstmt=conn.prepareStatement(sql);

        //4.设置参数
        pstmt.setInt(1,id);


        //5.执行sql
        int count=pstmt.executeUpdate();    //影响的行数

        //6.处理结果
        System.out.println(count>0);


        //7.释放资源

        pstmt.close();
        conn.close();


    }

}
