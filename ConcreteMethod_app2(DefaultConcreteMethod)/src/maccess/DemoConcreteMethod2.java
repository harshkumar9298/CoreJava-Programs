package maccess;
import test.*;
public class DemoConcreteMethod2 {
	public static void main(String[] args) {
		IClass ob = new IClass();
		ob.m1(12);
		ob.m2(23);//default concrete method call
	}
}