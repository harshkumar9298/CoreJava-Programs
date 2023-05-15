package maccess;
import test.*;
public class DemoAnonymous2 {
	public static void main(String[] args) {
		System.out.println("====Anonymous InnerClass as implementation class==="); 
		ITest ob2 = new ITest()
		{
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
		};
		ob2.m1(23);
		//ob2.m2(34);//Error
	}
}