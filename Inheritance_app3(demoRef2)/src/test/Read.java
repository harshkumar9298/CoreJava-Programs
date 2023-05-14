package test;
import java.util.*;
public class Read extends Product{
	public void read(Scanner s)
	{
		System.out.println("Enter the PCode:");
		super.pCode = s.nextLine();
		System.out.println("Enter the PName:");
		super.pName = s.nextLine();
		System.out.println("Enter the PPrice:");
		super.pPrice = s.nextFloat();
		System.out.println("Enter the PQty:");
		super.pQty = s.nextInt();

	}
}