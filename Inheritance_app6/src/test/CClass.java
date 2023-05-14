package test;
public class CClass extends PClass{
	public static int b=10;
	public static void m2() {
		System.out.println("====CClass m2()====");
		System.out.println("The value b:"+b);
	}
	static
	{
		System.out.println("====CClass static block====");
		System.out.println("The value b:"+b);
	}
}