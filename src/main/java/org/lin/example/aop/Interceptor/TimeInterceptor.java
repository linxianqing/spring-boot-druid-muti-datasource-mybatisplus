package org.lin.example.aop.Interceptor;

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

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 检测方法执行耗时的spring切面类
 * 使用@Aspect注解的类，Spring将会把它当作一个特殊的Bean（一个切面），也就是不对这个类本身进行动态代理
 *
 * @author blinkfox
 * @date 2016-07-04
 */
@Aspect
@Component
public class TimeInterceptor {
    private static final Log log = LogFactory.getLog(TimeInterceptor.class);
    String methodName;      // 方法名
    long startTime;         // 开始时间

    @Pointcut("execution( * org.lin.example.service.*.*.*(..))")
    public void logPointcut() {
    }

    @Around("logPointcut()")

    @Before("logPointcut()")
    public void doBefore(JoinPoint joinPoint) {
        methodName = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        startTime = System.currentTimeMillis();
    }

    @After("logPointcut()")
    public void doAfter() {
        long E_time = System.currentTimeMillis() - startTime;
        log.info("执行 " + methodName + " 耗时为：" + E_time + "ms");
    }

    @AfterReturning(returning = "object", pointcut = "logPointcut()")
    public void doAfterReturning(Object object) {
        System.out.println("执行结果: "+ object.toString());
//        log.info("response={}", object.toString());
    }


}
