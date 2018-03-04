package org.lin.example.config.datasource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

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
@Configuration
@PropertySource("classpath:properties/jdbc.properties")//注意路径
public class DruidConfig {

    @Value("${spring.datasource.type}")
    private Class<? extends DataSource> dataSourceType;

    @Bean(name = "dataSourceOne")
    @Primary
    @ConfigurationProperties(prefix = "one.datasource")
    public DataSource masterDataSource() {
        System.out.println("-------------------- dataSourceOne init ---------------------");
        DataSource dataSource = DataSourceBuilder.create().type(dataSourceType).build();
        return dataSource;
    }

    /**
     * 有多少个从库就要配置多少个
     *
     * @return
     */
    @Bean(name = "dataSourceTwo")
    @ConfigurationProperties(prefix = "two.datasource")
    public DataSource readDataSourceOne() {
        System.out.println("-------------------- dataSourceTwo init ---------------------");
        DataSource dataSource = DataSourceBuilder.create().type(dataSourceType).build();
        return dataSource;
    }



}
