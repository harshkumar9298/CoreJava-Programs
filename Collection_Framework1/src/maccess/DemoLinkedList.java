package maccess;
import java.util.*;
public class DemoLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>(); 
		ll.add(new Integer(12));
		ll.add(new Integer(13));
		ll.add(new Integer(11));
		ll.add(new Integer(10));
		System.out.println(ll.toString());
		Integer ele = ll.get(2);
		System.out.println("Element at index 2 : "+ele);

	}
}