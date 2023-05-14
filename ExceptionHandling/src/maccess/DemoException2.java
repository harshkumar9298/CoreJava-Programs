package maccess;
import java.util.*;
public class DemoException2
	{
	public static void main(String[] args)
	{
		try(Scanner s = new Scanner(System.in);)//Java7
		{
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
			catch(NumberFormatException |
					ArrayIndexOutOfBoundsException ob)//Java7 
			{
				System.out.println("Check Input process and Array Index...");
				System.out.println("details : "+ob.getMessage());
				System.out.println("class : "+ob.getClass());
			}
		}//end of try-with-resource

}
}