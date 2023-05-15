package maccess;
import test.*;
import java.util.*;
public class DemoInterface2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x = s.nextInt();
		System.out.println("Enter the value of y:");
		int y = s.nextInt();
		System.out.println("Enter the value of z:");
		int z = s.nextInt();
		IClass ob = new IClass();
		ob.m1(x);
		ob.m2(y);
		ob.dis(z);
		s.close();
	}
}