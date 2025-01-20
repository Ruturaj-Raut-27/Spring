package com.tka.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspect {

//	@Before("execution (public void recharge())")
//	public void beforeMSG() {
//		System.out.println("Plz recharge");
//	}
//	
//	@After("execution (public void recharge())")
//	public void afterMSG() {
//		System.out.println("recharge done");
//	}
	
	@Around("execution(* com.tka.entity.MobileRecharge.*(..))")
	public void aroundMSG(ProceedingJoinPoint jp) throws Throwable {
		
		System.out.println("plz recharge");
		
		jp.proceed();
		
		System.out.println("recharge done");
	}
}
