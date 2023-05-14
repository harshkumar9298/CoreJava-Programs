package maccess;
import test.*;
public class DemoInheritance6 {
	public static void main(String[] args) {
		System.out.println("====Display using Class_name===="); 
		CClass.m1();//PClass_method_call
		CClass.m2();//CClass_method_call
		System.out.println("====Display using Object reference===");
		CClass ob = new CClass();
		ob.m1();
		ob.m2();
	}
}