package org.lin.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

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
@ImportResource(locations = {
        "classpath*:spring/spring-mybatis.xml"
//        "classpath:application-bean.xml"}
})
public class ConfigClass {

}