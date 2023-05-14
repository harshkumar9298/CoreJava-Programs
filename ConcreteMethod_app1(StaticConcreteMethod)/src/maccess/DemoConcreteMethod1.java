package maccess;
import test.*;
public class DemoConcreteMethod1 {
	public static void main(String[] args) {
		IClass ob = new IClass();
		ob.m1(123);
		ITest.m2(234);
		//IClass.m2(34);//Error
	}
}