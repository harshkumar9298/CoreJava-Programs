package maccess;
import test.*;
public class DemoConcreteMethod3 {
	public static void main(String[] args) {
		IClass ob = new IClass();
		ob.m1(12);
		ob.access(13,14);
	}
}