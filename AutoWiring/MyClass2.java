package mypack1;

public class MyClass2 
{
	MyClass1 ob2;
	public MyClass1 getOb1() {
		return ob2;
	}
	public void setOb1(MyClass1 ob1) {
		System.out.println("in setOb of MyClass2");
		this.ob2 = ob1;
	}
	public MyClass2() {
		System.out.println("in MyClass2 no-arg");
	}
	void disp()
	{
		System.out.println("in MyClass2 disp");
		ob2.print();
	}
}
