package maccess;
import java.util.*;
public class DemoSet {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<Integer> st=null;
		System. out.println("====Choice===");
		System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet"); 
		System.out.println("Enter the Choice:");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:
			st = new HashSet<Integer>();
			break;
		case 2:
			st = new LinkedHashSet<Integer>();
			break;
		case 3:
			st = new TreeSet<Integer>();
			break;
		default:
			System.out.println("Invalid choice...");
			System.exit(0);//stop the program
		}//end of switch
		System.out.println("Enter number of elements to be added:");
		int n = s.nextInt();
		System.out.println("Enter "+n+" Integer elements:"); 
		for(int i=1;i<=n;i++)
		{
			st.add(new Integer(s.nextInt()));//Adding Set object 
		}//end of loop
		System.out.println("====toString()====");
		System.out.println(st.toString());
		System.out.println("====Iterator<E>====");
		Iterator<Integer> it1 = st.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}//end of loop
		System.out.println("\n===Java8 Iterator<E>===");

		Iterator<Integer> it2 = st.iterator();
		it2.forEachRemaining((k)->
		{
			System.out.print(k.toString()+" ");
		});
		System.out.println("\n====Java8 Spliterator<E>==="); 
		Spliterator<Integer> sp = st.spliterator();
		sp.forEachRemaining((k)->
		{
			System.out.print(k.toString()+" ");
		});
		System.out.println("\n===Java8 forEach()====");
		st.forEach((k)->
		{
			System.out.print(k.toString()+" ");
		});
		s.close();
	}
}