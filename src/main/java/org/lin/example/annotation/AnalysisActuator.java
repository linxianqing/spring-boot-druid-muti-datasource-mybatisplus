package org.lin.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by IntelliJ IDEA         <br/>
 * author:  linxianqin              <br/>
 * Date:    2018/3/5                 <br/>
 * Email:   linxianqinwork@qq.com   <br/>
 * Desc:    automaticGeneration     <br/>
 * 描述:     自动生成                 <br/>
 *
 * @author linxianqin               <br/>
 * @date 2018/3/5
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnalysisActuator {
    String note() default "";
}