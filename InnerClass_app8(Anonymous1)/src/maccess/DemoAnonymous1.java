package maccess;
import test.*;
public class DemoAnonymous1 {

	public static void main(String[] args) {
		System.out.println("====Anonymous InnerClass as Class extention===="); 
		PClass ob2 = new PClass()
		{
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
		};
		ob2.m1(234);
		ob2.m2(345);
		//ob2.m3(456);//Error
	}
}