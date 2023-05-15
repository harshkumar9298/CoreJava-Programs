package test;
public class IClass implements ITest{
	public void m1(int x)//Implemented method
	{
		System.out.println("====Implemented method m1(x)===="); 
		System.out.println("The value x:"+x);
	}
	public void m2(int y)//Implemented method
	{
		System.out.println("====Implemented method m2(y)===="); 
		System.out.println("The value y:"+y);
	}
	public void dis(int z)//Non-Implemented method
	{
		System.out.println("====Non-Implemented method dis(z)====");
		System.out.println("The value z:"+z);
	}

}