package maccess;
import test.*;
public class DemoGeneralization2 {
	public static void main(String[] args) {
		System.out.println("====Normal Inheritance====");
		IClass ob1 = new IClass();
		ob1.m1(12);
		ob1.m2(23);
		System.out.println("====Generalization Process===");
		ITest ob2 = new IClass();
		ob2.m1(23);
		//ob2.m2(34);//Error
	}
}