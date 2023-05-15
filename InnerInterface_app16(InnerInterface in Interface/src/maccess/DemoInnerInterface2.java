package maccess;
import test.*;
public class DemoInnerInterface2 {
	public static void main(String[] args) {
		ITest.ITest1 ob1 = (int x)->
		{
			System.out.println("===m1(x)====");
			System.out.println("The value x:"+x);
		};
		ob1.m1(123);
	}
}