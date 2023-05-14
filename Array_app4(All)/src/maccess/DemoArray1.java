package maccess;
import java.util.*;
public class DemoArray1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Integer eles:"); 
		int n = s.nextInt();
		Integer a[] = new Integer[n];//Array
		System.out.println("Enter "+n+" Integer eles");
		for(int i=0;i<a.length;i++)
		{
			a[i] = new Integer(s.nextInt());
		}//end of loop
		System.out.println("===Display using Old loop==="); 
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i].toString()+" ");
		}//end of loop
		System.out.println("\n===Display using Extended for Java5===");
		for(Integer k : a)

		{
			System.out.print(k.toString()+" ");
		}//end of loop
		System.out.println("\n===Display using Spliterator<T> Java8==="); 
		Spliterator<Integer> sp = Arrays.spliterator(a); 
		sp.forEachRemaining((z)->
		{
			System.out.print(z.toString()+" ");
		});
		s.close();
	}
}