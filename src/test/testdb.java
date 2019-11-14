import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;
import org.springframework.test.context.TestExecutionListeners;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class testdb {

    @Test
    public void test(){

        Properties properties = new Properties();


        try {
//			加载properties文件
//            properties.load(new FileInputStream("classpath:db.properties"));
//            driver=com.mysql.jdbc.Driver
//            url=jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8
//            username=root
//            password=1234
            properties.setProperty(" driver","com.mysql.jdbc.Driver");
            properties.setProperty("url","jdbc:mysql://47.101.143.152:3306/bookShop");
            properties.setProperty("username","root");
            properties.setProperty("password","123456");

//			创建连接池对象
            DataSource createDataSource = DruidDataSourceFactory.createDataSource(properties);

//			获取连接池
            Connection connection = createDataSource.getConnection();
            System.out.println(connection);
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users");
            ResultSet rs = preparedStatement.executeQuery();
//			遍历输出数据库中的内容
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "---" + rs.getString("username") + "---" + rs.getString("pw"));
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    }



