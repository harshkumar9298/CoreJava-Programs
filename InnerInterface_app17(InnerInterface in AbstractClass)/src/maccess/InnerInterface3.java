package maccess;
import test.*;
public class InnerInterface3 {
	public static void main(String[] args) {
		AClass.ITest1 ob1 = (int x)->
		{
			System.out.println("========m1(x)=========");
			System.out.println("The value x:"+x);
		};
		ob1.m1(122);
		
		AClass.ITest2 ob2 = (int y)->
		{
			System.out.println("========m2(y)=========");
			System.out.println("The value y:"+y);
		};
		ob2.m2(123);

	}

}
