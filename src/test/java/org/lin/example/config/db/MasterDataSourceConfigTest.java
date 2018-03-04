package org.lin.example.config.db;

import javax.sql.DataSource;
import java.sql.ResultSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA         <br/>
 * author:  linxianqin              <br/>
 * Date:    2018/3/4                 <br/>
 * Email:   linxianqinwork@qq.com   <br/>
 * Desc:    automaticGeneration     <br/>
 * 描述:     自动生成                 <br/>
 *
 * @author linxianqin               <br/>
 * @date 2018/3/4
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class MasterDataSourceConfigTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void masterDataSource() throws Exception {
        ResultSet resultSet = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM user");
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            System.out.println(name);
        }
    }

}