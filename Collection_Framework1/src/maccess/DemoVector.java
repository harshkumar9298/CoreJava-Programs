package maccess;
import java.util.*;
public class DemoVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("capacity:"+v.capacity()); 
		System.out.println("size:"+v.size());
		v.add(new Integer(12));
		v.add(new Integer(13));
		v.add(new Integer(14));
		v.add(new Integer(15));
		v.add(new Integer(16));
		v.add(new Integer(12));
		v.add(new Integer(13));
		v.add(new Integer(14));
		v.add(new Integer(15));
		v.add(new Integer(16));
		System.out.println(v.toString());
		System.out.println("capacity:"+v.capacity()); 
		System.out.println("size:"+v.size());
		v.add(new Integer(161));
		System.out.println(v.toString());
		System.out.println("capacity:"+v.capacity()); 
		System.out.println("size:"+v.size());
		System.out.println("ele at index 10:"+v.elementAt(10));
		System.out.println("FirstElement:"+v.firstElement()); 
		System.out.println("LastElement:"+v.lastElement()); 
		v.set(9,new Integer(500));//replace value in index 9
		System.out.println(v.toString());
		v.removeElementAt(8);
		System.out.println(v.toString());
		v.removeElement(new Integer(12));//remove element by object 
		System.out.println(v.toString());
		v.insertElementAt(new Integer(400), 8); //insert element in index 8
		System.out.println(v.toString());
		System.out.println("===Enumeration<E>====");
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}//end of loop
		System.out.println("\n****ListIterator<E>****"); 
		ListIterator<Integer> li = v.listIterator();
		System.out.print("Forward : ");
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}//end of loop
		System.out.print("\nBackWard : ");
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}//end of loop
		System.out.println("\n====asIterator()===="); 
		Enumeration<Integer> e2 = v.elements();
		      //again create object for Enumeration<E> because previous was pointed at last index
		Iterator<Integer> it = e2.asIterator();
		it.forEachRemaining((k)->
		{
			System.out.print(k.toString()+" ");
		});
	}
}