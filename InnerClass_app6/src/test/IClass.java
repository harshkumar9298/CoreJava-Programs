package test;
public class IClass implements ITest{
	public void m1(int x)
	{
		System.out.println("===m1(x)===");
		System.out.println("The value x:"+x);
	}
	public void m2(int y)
	{
		System.out.println("===m2(y)====");
		System.out.println("The value y:"+y);
	}
}