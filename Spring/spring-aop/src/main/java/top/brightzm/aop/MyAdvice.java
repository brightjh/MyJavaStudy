package top.brightzm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/1 下午11:07
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void top.brightzm.Dao.*Dao.update())")
    private void pt(){}

    @Pointcut("execution(int top.brightzm.Dao.*Dao.selectAll())")
    private void pt2(){}

    //@Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }

    @Around("pt2()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before running");
        Object ret = pjp.proceed();
        System.out.println("after running");
        return ret;
    }
}
