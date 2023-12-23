package mypack;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeCall implements MethodBeforeAdvice
{
	public void before(Method method,Object[]os,Object o)
	{
		System.out.println("In Before calling method");
	}

	 

}
