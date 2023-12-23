package mypack;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterCall implements AfterReturningAdvice
{
	public void afterReturning(Object o,Method method,Object[] os,Object o1)
	{
		System.out.println("In After returning method");
		
	}

}
