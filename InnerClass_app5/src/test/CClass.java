package test;
public class CClass extends PClass{
	public void m1(int x)//Overriding method 
	{
		System.out.println("====CClass m1(x)===");
		System.out.println("The value x:"+x);
	}
	public void m3(int z)//Non-Overriding method

	{
		System.out.println("====CClass m3(z)===");
		System.out.println("The value z:"+z);
	}
}