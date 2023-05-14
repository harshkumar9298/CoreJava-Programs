package maccess;
import java.util.*;
public class DemoStack {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		while(true) {
			System.out.println("====Choice===");
			System.out.println("1.push()\n2.pop\n3.peek()\n4.search()\n5.exit"); 
			System.out.println("Enter the Choice:");
			int choice = s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the ele:");
				st.push(new Integer(s.nextInt()));
				System.out.println(st.toString());
				break;
			case 2:
				if(st.empty()) {

					System.out.println("Stack is empty...");
				}
				else {
						st.pop();
						System.out.println(st.toString());
					}
				break;
			case 3:
				if(st.empty()) {
					System.out.println("Stack is empty..");
					}
				else {
						System.out.println("Peek ele : "+st.peek()); 
						System.out.println(st.toString());
				}
				break;
			case 4:
				if(st.empty()) {
					System.out.println("Stack is empty..."); 
					}
				else {
					System.out.println("Enter the ele to be Searched:");
					Integer ele = new Integer(s.next());
					int pos = st.search(ele);
					if(pos>0) {
						System.out.println("Ele at position:"+pos);
					}
					else {
						System.out.println("Ele not Found..."); }
				}
				break;
			case 5:
				System.out.println("Stack operation Stopped..."); 
				System.exit(0);
			default:
				System.out.println("Invalid Choice...");
			}//end of switch
		}//end of loop
	}
}