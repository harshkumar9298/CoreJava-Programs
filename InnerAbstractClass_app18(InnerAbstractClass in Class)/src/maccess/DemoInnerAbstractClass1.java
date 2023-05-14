package maccess;
import test.*;
public class DemoInnerAbstractClass1 {
	public static void main(String[] args) {
		SubClass ob = new SubClass();
		SubClass.AClass1 ob1 = ob.new AClass1()
		{
			public void m1(int x)
			{
				System.out.println("===m1(x)====");
				System.out.println("The value x:"+x);
			}
		};
		ob1.m1(12);
		SubClass.AClass2 ob2 = new SubClass.AClass2()
		{
			public void m2(int y)
			{
				System.out.println("===m2(y)===");
				System.out.println("The value y:"+y);
			}
		};
		ob2.m2(23);
	}
}