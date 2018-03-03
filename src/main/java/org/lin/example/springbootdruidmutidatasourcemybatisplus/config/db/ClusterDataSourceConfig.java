package org.lin.example.springbootdruidmutidatasourcemybatisplus.config.db;//package com.example.springbootmutidatasourcemybatisplus.config.db;
//
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.github.pagehelper.PageHelper;
//import org.apache.ibatis.plugin.Interceptor;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
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
//@MapperScan(basePackages = ClusterDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "clusterSqlSessionFactory")
//public class ClusterDataSourceConfig {
//
//    // 精确到 cluster 目录，以便跟其他数据源隔离
//    static final String PACKAGE = "com.example.springbootmutidatasourcemybatisplus.mapper";
//    static final String MAPPER_LOCATION = "classpath:**/mapper/cluster/*.xml";
//
//    @Value("${cluster.datasource.url}")
//    private String url;
//
//    @Value("${cluster.datasource.username}")
//    private String user;
//
//    @Value("${cluster.datasource.password}")
//    private String password;
//
//    @Value("${cluster.datasource.driverClassName}")
//    private String driverClass;
//
//    @Bean(name = "clusterDataSource")
//    public DataSource clusterDataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(driverClass);
//        dataSource.setUrl(url);
//        dataSource.setUsername(user);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
////
////    @Bean(name = "clusterTransactionManager")
////    public DataSourceTransactionManager clusterTransactionManager() {
////        return new DataSourceTransactionManager(clusterDataSource());
////    }
//
//
//    /**
//     * 加载mybatis xml配置文件，并初始化分页插件
//     *
//     * @param dataSource      数据源
//     * @param mapperLocations 自定义xml配置路径
//     * @return
//     * @throws Exception
//     */
//    public SqlSessionFactory sqlSessionFactory(DataSource dataSource, String mapperLocations) throws Exception {
//        return createSqlSessionFactory(dataSource, mapperLocations);
//    }
//
//    private SqlSessionFactory createSqlSessionFactory(DataSource dataSource, String mapperLocations) throws Exception {
//
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        // mybatis分页
//        PageHelper pageHelper = new PageHelper();
//        Properties props = new Properties();
//        props.setProperty("dialect", "mysql");
//        props.setProperty("reasonable", "true");
//        props.setProperty("supportMethodsArguments", "true");
//        props.setProperty("returnPageInfo", "check");
//        props.setProperty("params", "count=countSql");
//        pageHelper.setProperties(props); // 添加插件
//        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageHelper});
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(mapperLocations));
//        return sqlSessionFactoryBean.getObject();
//
//    }
//    @Primary
//    @Bean(name = "clusterSqlSessionFactory")
//    public SqlSessionFactory clusterSqlSessionFactory(@Qualifier("clusterDataSource")DataSource dataSource)
//            throws Exception {
//        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
//                .getResources(ClusterDataSourceConfig.MAPPER_LOCATION));
//        return sessionFactory.getObject();
//    }
//}