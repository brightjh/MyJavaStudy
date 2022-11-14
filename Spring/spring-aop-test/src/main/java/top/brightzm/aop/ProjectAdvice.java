package top.brightzm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description: AOP通知类
 * @author: bright
 * @time: 2022/11/2 下午9:31
 */
@Component
@Aspect
public class ProjectAdvice {

    @Pointcut("execution(* top.brightzm.service.*Service.*(..))")
    private void servicePt() {
    }

    //@Around("servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        long beginTime = System.currentTimeMillis();
        // 万次运行效率测试
        for (int i = 0; i < 1000; i++) {
            pjp.proceed();
        }
        long stopTime = System.currentTimeMillis();

        Signature signature = pjp.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();

        System.out.println("万次执行: " + className + "." + methodName + "------> " + (stopTime - beginTime) + " ms");
    }

}
