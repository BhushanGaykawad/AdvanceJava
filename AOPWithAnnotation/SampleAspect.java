package mypack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect 
{
	
	@Pointcut("execution(* Sample.*(..))")
	public void beforepointcut(){}
	
	@After("beforepointcut()")
	public void myadvice(JoinPoint jp)
	{
		System.out.println("Additional concern");
		System.out.println("Method Signature:"+jp.getSignature());
	}
	

}
