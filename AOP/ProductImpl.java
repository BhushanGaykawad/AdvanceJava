package mypack;

public class ProductImpl implements Product
{

	@Override
	public int multiply(int a, int b)
	{
		System.out.println("Inside the multiply method");
		return a*b;
	}

	@Override
	public void display() 
	{
		System.out.println("Inside Display method of ProductImpl");
		
		
	}
	

}
