package maccess;
import java.util.*;
public class DemoQueue {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
		while(true) {
			System.out.println("====Choice====");
			System.out.println("1.add()\n2.remove()\n3.element()\n4.peek()\n5.exit"); 
			System.out.println("Enter the Choice:");
			int choice = s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the element:");
				pq.add(new Integer(s.nextInt()));
				System.out.println(pq.toString());
				break;
			case 2:
				pq.remove();
	
				System.out.println(pq.toString());
				break;
			case 3:

				System.out.println("element : "+pq.element()); 
				System.out.println(pq.toString());
				break;
			case 4:
				System.out.println("Peek ele:"+pq.peek());
				System.out.println(pq.toString());
				break;
			case 5:
				System.out.println("Queue Operation Stopped..."); 
				System.exit(0);
			default:
				System.out.println("Invalid Choice...");
			}//end of switch
		}//end of loop
	}
}