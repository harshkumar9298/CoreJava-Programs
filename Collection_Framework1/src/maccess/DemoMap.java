package maccess;
import java.util.*;
import test.BookValues;
public class DemoMap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<String,BookValues> m = null;
		System. out.println("====Choice====");
		System.out.println("1.HashMap\n2.LinkedHashMap\n3.TreeMap\n4.Hashtable");
		System.out.println("Enter the Choice:");
		int choice = Integer.parseInt(s.nextLine());
		switch(choice)
		{
		case 1:
			m = new HashMap<String,BookValues>();
			break;
		case 2:
			m = new LinkedHashMap<String,BookValues>();
			break;
		case 3:
			m = new TreeMap<String,BookValues>();
			break;
		case 4:
			m = new Hashtable<String,BookValues>();
			break;
		default:
			System.out.println("Invalid Choice...");
			System.exit(0);
		}//end of switch
		System.out.println("Enter the number of Books:");
		int n = Integer.parseInt(s.nextLine());
		System.out.println("Enter "+n+" Book Details");
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the bookCode:");
			String bC = s.nextLine();
			System.out.println("Enter the bookName:");
			String bN = s.nextLine();
			System.out.println("Enter the bookAuthor:");
			String bA = s.nextLine();
			System.out.println("Enter the bookPrice:");
			float bP = Float.parseFloat(s.nextLine());
			System.out.println("Enter the bookQty:");
			int bQ = Integer.parseInt(s.nextLine());
			m.put(new String(bC),new BookValues(bN,bA,bP,bQ)); 
			//Adding String-BookValues Object pair to Map Object 
		}//end of loop
			System.out.println("====BookDetails====");
			m.forEach((p,q)->
			{
				System.out.println(p.toString()+"\t"+q.toString()); 
			});
			System.out.println("====Primary Keys====");
			Set<String> st = m.keySet();//Primary Keys are retrieved 
			st.forEach((x)->
			{
				System.out.println(x.toString());
			});
			System.out.println("====NonPrimary KeyValues===="); 
			Collection<BookValues> c = m.values();
			//retrieving Values
			c.forEach((y)->
			{
				System.out.println(y.toString());
			});
			s.close();
		}
}