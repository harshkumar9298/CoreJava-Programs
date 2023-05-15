package maccess;
import test.*;
public class DemoDesign {
	public static void main(String[] args) {
		ITest ob = Access.getRef();
		//Accessing the InnerClass Object reference
		//Accessing the Implementation Class Object reference
		ob.m(123);
	}
}