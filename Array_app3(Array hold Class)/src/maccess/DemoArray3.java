package maccess;
import java.util.*;
import test.Product;
public class DemoArray3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Products:");
		int n = Integer.parseInt(s.nextLine());

		Product p[] = new Product[n];//Array
		System.out.println("Enter"+n+" Products...");
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter the PCode:");
			String pC = s.nextLine();
			System.out.println("Enter the PName:");
			String pN = s.nextLine();
			System.out.println("Enter the PPrice:");
			float pP = Float.parseFloat(s.nextLine());
			System.out.println("Enter the PQty:");
			int pQ = Integer.parseInt(s.nextLine());
			p[i] = new Product(pC,pN,pP,pQ);
		}//end of loop
		System.out.println("===Display using Old loop===");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].toString()+" ");
		}//end of loop
		System.out.println("\n===Display using Extended for Java5===");
				for(Product k : p)
				{
					System.out.println(k.toString()+" ");

				}//end of loop
				System.out.println("\n===Display using Spliterator<T> Java8===");
				Spliterator<Product> sp = Arrays.spliterator(p);
				sp.forEachRemaining((z)->
				{
					System.out.println(z.toString()+" ");
				});
				s.close();
	}
}