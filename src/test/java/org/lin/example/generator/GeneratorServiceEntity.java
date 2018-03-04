package org.lin.example.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA         <br/>
 * author:  linxianqin              <br/>
 * Date:    2018/2/27                 <br/>
 * Email:   linxianqinwork@qq.com   <br/>
 * Desc:    automaticGeneration     <br/>
 * 描述:     自动生成                 <br/>
 *
 * @author linxianqin               <br/>
 * @date 2018/2/27
 */
public class GeneratorServiceEntity {

    @Test
    public void generateCode() {
        String packageName = "org.lin.example";
        boolean serviceNameStartWithI = false;//user -> UserService, 设置成true: user -> IUserService
        generateByTables(serviceNameStartWithI, packageName, "user", "user");
    }

    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://localhost:3306/test1";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("root")
                .setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();   // 策略配置
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)                    // 全局大写命名 ORACLE 注意
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames)                        // 需要生成的表，多个表名传数组
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
                .setSuperMapperClass("org.lin.example.base.SuperMapper");// 自定义 mapper 父类

        // 自定义 xxList.jsp 生成
        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        /*focList.add(new FileOutConfig("/template/list.jsp.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return "E:/workspace/ssmp-crud2/src/main/webapp/WEB-INF/" + tableInfo.getEntityName() + ".jsp";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);*/
        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };
        // 调整 xml 生成目录演示
        focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return "src/main/resources/mybatis/mapper/"  + tableInfo.getEntityName() + "Mapper.xml";
            }
        });
        cfg.setFileOutConfigList(focList);


        // 关闭默认 xml 生成，调整生成 至 根目录
        TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);

        config.setActiveRecord(true)
                .setEnableCache(false)// XML 二级缓存
                .setBaseResultMap(true)// XML ResultMap
                .setBaseColumnList(true)// XML columList
                .setAuthor("linxianqinwork@qq.com")
                .setOutputDir("src/main/java")
                .setFileOverride(true);
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity")
                )
                .setTemplate(tc)
                .setCfg(cfg)
                .execute();

    }

    private void generateByTables(String packageName, String... tableNames) {
        generateByTables(true, packageName, tableNames);
    }
}