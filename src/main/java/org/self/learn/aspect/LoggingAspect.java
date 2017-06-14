package org.self.learn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* org.self.learn..*.*(..))")
	public void logBefore(JoinPoint jp) {
		
		System.out.println(String.format("Entering method : %s.%s", 
				jp.getSignature().getDeclaringTypeName(), jp.getSignature().getName()));
	}
	
	@After("execution(* org.self.learn..*.*(..))")
	public void logAfter(JoinPoint jp) {
		
		System.out.println(String.format("Exiting method : %s.%s", 
				jp.getSignature().getDeclaringTypeName(), jp.getSignature().getName()));
	}
	
	@AfterReturning(pointcut = "execution(* org.self.learn..*.*(..))", returning = "result")
	public void logAfterReturning(JoinPoint jp, Object result) {
		
		System.out.println(String.format("Return value : %s", result));
	}
	
}
