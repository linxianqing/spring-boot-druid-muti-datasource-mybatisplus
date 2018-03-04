package org.lin.example.aop.Interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.lin.example.annotation.AnalysisActuator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

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
@Aspect
@Component
public class AnalysisActuatorAspect {
    final static Logger log = LoggerFactory.getLogger(AnalysisActuatorAspect.class);

    ThreadLocal<Long> beginTime = new ThreadLocal<>();

    @Pointcut("@annotation(analysisActuator)")
    public void serviceStatistics(AnalysisActuator analysisActuator) {
    }

    @Before("serviceStatistics(analysisActuator)")
    public void doBefore(JoinPoint joinPoint, AnalysisActuator analysisActuator) {
        // 记录请求到达时间
        beginTime.set(System.currentTimeMillis());
        log.info("cy666 note:{}", analysisActuator.note());
    }

    @After("serviceStatistics(analysisActuator)")
    public void doAfter(AnalysisActuator analysisActuator) {
        log.info("cy666 statistic time:{}, note:{}", System.currentTimeMillis() - beginTime.get(), analysisActuator.note());
    }

}