package maccess;
import java.util.*;
public class DemoArray2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of String eles:"); 
		int n = Integer.parseInt(s.nextLine());
		String a[] = new String[n];//Array

		System.out.println("Enter "+n+" String eles");
		for(int i=0;i<a.length;i++)
		{
			a[i] = new String(s.nextLine());
		}//end of loop
		System.out.println("===Display using Old loop==="); 
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i].toString()+" ");
		}//end of loop
		System.out.println("\n===Display using Extended for Java5===");
		for(String k : a)
		{
			System.out.print(k.toString()+" ");
		}//end of loop
		System.out.println("\n===Display using Spliterator<T> Java8==="); 
		Spliterator<String> sp = Arrays.spliterator(a);
		sp.forEachRemaining((z)->
		{
			System.out.print(z.toString()+" ");
		});
		s.close();
	}
}