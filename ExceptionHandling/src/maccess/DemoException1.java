package maccess;
import java.util.*;
public class DemoException1
	{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("Enter the size of Array:"); 
			int n = Integer.parseInt(s.nextLine());
			Integer a[] = new Integer[n];//Array
			System.out.println("Enter "+n+" Elements:"); 
			for(int i=0;i<=a.length;i++)
			{
				a[i] = Integer.parseInt(s.nextLine());
			}//end of loop
			System.out.println("====Display from Array===="); 
			for(Integer k : a)
			{
				System.out.print(k.toString()+" ");
			}//end of loop
		}//end of try
		catch(NumberFormatException ob)
		{
			System.out.println("Check the input process..."); 
			System.out.println(ob.getMessage());
			//ob.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{
			System.out.println("Check the Array Index..."); 
			System.out.println(ob.getMessage());
		}
		finally
		{
			System.out.println("****finally block*****");
			s.close();
		}
	}	
}