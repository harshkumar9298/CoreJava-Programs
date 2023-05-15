package maccess;
import test.*;
import java.util.*;
public class DemoAnonymous3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x = s.nextInt();
		System.out.println("Enter the value of y:");
		int y = s.nextInt();
		if(x>0 && y>0)
		{
			System.out.println("====Choice====");
			System.out.println("1.Greater\n2.Smaller");
			System.out.println("Enter the Choice:");
			int choice = s.nextInt();
			switch(choice)
			{
			case 1:
				IComparable gt = new IComparable()
				{
				public int compareTo(int x,int y)
				{
				 if(x>y) 
					 return x;
				 else 
					 return y;
				}
				
				};
				
				int r1 = gt.compareTo(x, y);
				System.out.println("GreaterValue:"+r1);
				break;
			case 2:
				IComparable sm = new IComparable()
				{
					public int compareTo(int x,int y)
				{
					if(x<y) return x;
					else return y;
				}
						
				};
				int r2 = sm.compareTo(x, y);
				System.out.println("SmallerValue:"+r2);
				break;
			default:
				System.out.println("Invalid Choice....");
			}//end of switch
		}//end of if
		else
		{
			System.out.println("Invalid Input...");
		}
		s.close();
	}
}