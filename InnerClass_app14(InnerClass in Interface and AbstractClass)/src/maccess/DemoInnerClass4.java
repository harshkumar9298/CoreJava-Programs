package maccess;
import test.*;
public class DemoInnerClass4 {
	public static void main(String[] args) {
		ITest.SubClass2 ob1 = new ITest.SubClass2();
		ob1.m2(12);
		AClass ob = new AClass() {};
		AClass.SubClass22 ob2 = ob.new SubClass22();
		ob2.m22(13);
		AClass.SubClass33 ob3 = new AClass.SubClass33();
		ob3.m33(14);
	}
}