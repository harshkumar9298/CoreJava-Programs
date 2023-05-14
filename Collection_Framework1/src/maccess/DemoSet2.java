package maccess;
import java.util.*;

public class DemoSet2 {
	public static void main(String[] args) {
		Set<Integer> st = Set.of(12,13,14, 15, 16);
		//Immutable Object
		//st.add(new Integer(500));//Error
		System.out.println("===toString()====");
		System.out.println(st.toString());
		System.out.println("====Iterator<E>====");
		Iterator<Integer> it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}//end of loop
         
		System.out.println(st.toString());
		System.out.println("====TreeSet<E>=====");
		TreeSet<Integer> ts = new TreeSet<Integer>();
		//Mutable Object
		ts.add(new Integer(16));
		ts.add(new Integer(14));
		ts.add(new Integer(13));
		ts.add(new Integer(15));
		ts.add(new Integer(12));
		System.out.println("----toString()----");
		System.out.println(ts.toString());
		System.out.println("----Iterator<E>----");
		Iterator<Integer> it2 = ts.iterator();
		while(it2.hasNext()) {
			if(it2.next()==14)
			{
				it2.remove();
			}
		}//end of loop
		System.out.println(ts.toString());
		System.out.println("===Descending order====");
		Object o[] = ts.toArray();//Covert Set into Array 
		for(int i=o.length-1;i>=0;i--)
		{	
			System.out.println(o[i].toString());//REVERSE ARRAY
		}//end of loop
	}
}