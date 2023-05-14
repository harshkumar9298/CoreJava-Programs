package test;
import java.util.*;

public class Read extends Product {

	public void read()
	 {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the PCode:");
		pCode = s.nextLine();
		System.out.println("Enter the PName:");
		pName = s.nextLine();
		System.out.println("Enter the PPrice:");
		pPrice = s.nextFloat();
		System.out.println("Enter the PQty:");
	    pQty = s.nextInt();
	    getProduct();
		
		s.close();
	 }
}
