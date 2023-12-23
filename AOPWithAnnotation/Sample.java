package mypack;

import org.springframework.stereotype.Component;

@Component(value="sample")
public class Sample 
{
	void disp1()
	{
		System.out.println("In disp1");
	}
	void disp2()
	{
		System.out.println("in disp2");
		
	}
	void disp3()
	{
		System.out.println("in disp3");
		
	}

}
