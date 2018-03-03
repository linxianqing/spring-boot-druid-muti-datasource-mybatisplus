package org.lin.example.springbootdruidmutidatasourcemybatisplus.config.db;//package com.example.springbootmutidatasourcemybatisplus.config.db;
//
//import javax.sql.DataSource;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
///**
// * Created by IntelliJ IDEA         <br/>
// * author:  linxianqin              <br/>
// * Date:    2018/3/3                 <br/>
// * Email:   linxianqinwork@qq.com   <br/>
// * Desc:    automaticGeneration     <br/>
// * 描述:     自动生成                 <br/>
// *
// * @author linxianqin               <br/>
// * @date 2018/3/3
// */
//@Configuration
////@MapperScan(basePackages = MasterDataSourceConfig.PACKAGE,sqlSessionFactoryRef = "masterSqlSessionFactory")
//public class MasterDataSourceConfig {
//
//
//    @Value("${master.datasource.url}")
//    private String url;
//
//    @Value("${master.datasource.username}")
//    private String user;
//
//    @Value("${master.datasource.password}")
//    private String password;
//
//    @Value("${master.datasource.driverClassName}")
//    private String driverClass;
//
//    @Bean(name = "masterDataSource")
//    @Primary
//    public DataSource masterDataSource(){
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setUrl(url);
//        druidDataSource.setUsername(user);
//        druidDataSource.setPassword(password);
//        druidDataSource.setDriverClassName(driverClass);
//        return druidDataSource;
//    }
//
//}