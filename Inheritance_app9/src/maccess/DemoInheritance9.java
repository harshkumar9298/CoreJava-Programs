package maccess;
import java.util.*;
import test.*;
public class DemoInheritance9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Addition ad = new Addition();
		System.out.println("===Choice====");
		System.out.println("1.add(int,int)\n2.add(int,int,int)\n3.add(int,float)");
		System.out.println("Enter the Choice:");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the int value1:");
			int v1 = s.nextInt();
			System.out.println("Enter the int value2:");
			int v2 = s.nextInt();
			ad.add(v1, v2);
			break;
		case 2:
			System.out.println("Enter the int value1:");
			int v11 = s.nextInt();

			System.out.println("Enter the int value2:");
			int v22 = s.nextInt();
			System.out.println("Enter the int value3:");
			int v33 = s.nextInt();
			ad.add(v11, v22, v33);
			break;
		case 3:
			System.out.println("Enter the int value1:");
			int v111 = s.nextInt();
			System.out.println("Enter the float value2:");
			float v222 = s.nextFloat();
			ad.add(v111, v222);
			break;
		default:
			System.out.println("1Invalid Choice...");
		}//end of switch
		s.close();
	}
}