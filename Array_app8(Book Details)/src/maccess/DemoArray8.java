package maccess;
import java.util.*;
import test.BookData;
public class DemoArray8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Books:");

		int n = Integer.parseInt(s.nextLine());
		BookData bd[] = new BookData[n];//Array
		System.out.println("Enter "+n+" Books...");
		for(int i=0;i<bd.length;i++)
		{
			System.out.println("Enter the bCode:");
			String bC = s.nextLine();
			System.out.println("Enter the bName:");
			String bN = s.nextLine();
			System.out.println("Enter the Author:");
			String bA = s.nextLine();
			System.out.println("Enter the bPrice:");
			float bP = Float.parseFloat(s.nextLine());
			System.out.println("Enter the bQty:");
			int bQ = Integer.parseInt(s.nextLine());
			bd[i] = new BookData(bC,bN,bA,bP,bQ);
		}//end of loop
		System.out.println("===Display using Old loop===");
		for(int i=0;i<bd.length;i++)
		{
			System.out.println(bd[i].toString()+" ");
		}//end of loop
		System.out.println("\n===Display using Extended for Java5===");

				for(BookData k : bd)
				{
					System.out.println(k.toString()+" ");
				}//end of loop
				System.out.println("\n===Display using Spliterator<T> Java8===");
				Spliterator<BookData> sp = Arrays.spliterator(bd);
				sp.forEachRemaining((z)->
				{
					System.out.println(z.toString()+" ");
				});
				s.close();
		}
	}