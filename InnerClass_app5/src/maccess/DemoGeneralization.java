package maccess;
import test.*;
public class DemoGeneralization {
	public static void main(String[] args) {
		System.out.println("====Normal Inheritance===");
		CClass ob1 = new CClass();
		ob1.m1(12);
		ob1.m2(13);
		ob1.m3(14);
		System.out.println("====Generalization process====");
		PClass ob2 = new CClass();
		ob2.m1(234);
		ob2.m2(345);
		//ob2.m3(456);//Error
	}
}
