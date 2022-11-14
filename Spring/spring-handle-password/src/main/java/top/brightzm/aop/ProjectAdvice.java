package top.brightzm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/4 上午11:25
 */
@Component
@Aspect
public class ProjectAdvice {

    @Pointcut("execution(* top.brightzm.service.*Service.openURL(..))")
    private void servicePt(){}


    @Around("servicePt()")
    private Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            if (args[i].getClass().equals(String.class)){
                args[i] = args[i].toString().trim();
            }
        }
        Object ret = pjp.proceed(args);
        return ret;
    }



}
