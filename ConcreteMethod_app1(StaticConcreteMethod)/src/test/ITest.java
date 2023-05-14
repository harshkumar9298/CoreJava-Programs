package test;
public interface ITest {

	public abstract void m1(int x);
	public static void m2(int y)
	{
		System.out.println("===Static method m2(y)===");
		System.out.println("The value y:"+y);
	}
}