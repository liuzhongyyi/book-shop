import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.lzy.dao.BookDao;
import com.lzy.dao.Userdao;
import com.lzy.domain.Book;
import com.lzy.domain.Users;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring/applicationContext.xml")
public class testdb {
    @Autowired
    private BookDao bookDao;

    @Autowired
    private Userdao userdao;

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

    @Test
    public void test1(){
        Users users = new Users();
        users.setUsername("lzy");
        Users users1 = new Users();
        users1.setUsername("lzy1");
        Book book = new Book();
        book.setBookName("hello");
        Book book1 = new Book();
        book1.setBookName("hello1");
        users.getBooks().add(book);
        users1.getBooks().add(book1);
        book.getUsers().add(users);
        book1.getUsers().add(users1);
        bookDao.save(book);
        bookDao.save(book1);
        userdao.save(users);
        userdao.save(users1);



    }

}



