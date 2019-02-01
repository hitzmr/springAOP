package com.itheima.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 使用注解的方式
 */
@Component("loggerAnnotation")
@Aspect//配置了切面
public class LoggerAnnotation {

    @Pointcut("execution( * com.itheima.*.impl.*.*(..))")
    private void prt(){

    }

    @Before("prt()")
    public void beforePringLog() {
        System.out.println("****************beforePringLog**************");
    }

    @AfterReturning("prt()")
    public void afterReturnningPrintLog() {
        System.out.println("****************afterReturnningPrintLog **************");
    }

    @AfterThrowing("prt()")
    public void afterThrowingPringLog() {
        System.out.println("****************afterThrowingPringLog**************");
    }

    @After("prt()")
    public void afterPringLog() {
        System.out.println("****************afterPringLog**************");
    }

    /**
     *  环绕通知：
     * 	它是spring为我们提供的一种可以在代码中手动控制通知类型的方式
     */
    @Around("prt()")
    public Object arroundPringLog(ProceedingJoinPoint methodInvocationProceedingJoinPoint) {
        Object o = null;
        try {
            System.out.println("****************arroundPringLog   before**************");
            o = methodInvocationProceedingJoinPoint.proceed();
            System.out.println("****************arroundPringLog   afterReturnning**************");
        } catch (Throwable throwable) {
            System.out.println("****************arroundPringLog   afterThrowing**************");
            throwable.printStackTrace();
        } finally {
            System.out.println("****************arroundPringLog   after**************");
        }
        return o;
    }

}
