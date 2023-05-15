package maccess;
import test.*;
import java.util.*;
public class DemoInterface1 {
	public static void main(String[] args) {
		//IArithmetic ob = new IArithmetic();//Error
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value1:");
		int v1 = s.nextInt();
		System.out.println("Enter the value2:");
		int v2 = s.nextInt();
		Addition ad = new Addition();
		double v3 = ad.calculate(v1, v2);//Method_Call
		System.out.println("Sum:"+v3);

		s.close();
	}
}