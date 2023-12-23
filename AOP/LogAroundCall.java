package mypack;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundCall implements MethodInterceptor
{
	public Object invoke(MethodInvocation mi)throws Throwable
	{
		System.out.println("Inside Around call");
		Object arg[]=mi.getArguments();
		int num1=(Integer)arg[0];
		int num2=(Integer)arg[1];
		if(num1==0 && num2==0)
		{
			throw new Exception("Cannot multiply o with 0");
		}
		Object result=mi.proceed();
		System.out.println("after proceed");
		return result;
	}

}
