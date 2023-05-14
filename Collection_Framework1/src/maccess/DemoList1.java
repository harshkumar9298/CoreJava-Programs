package maccess;
import java.util.*;
public class DemoList1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		al.add(new Integer(12));
		al.add(new Integer(13));
		al.add(new Integer(11));
		al.add(new Integer(10));
		System.out.println(al.toString());
		al.add(2,new Integer(500));//Add by index value 
		System.out.println(al.toString());
		al.remove(2);//remove by index value
		System.out.println(al.toString());
		al.remove(new Integer(11));//remove by Object
		System.out.println(al.toString());
		al.set(2,new Integer(600));//SET EXISTING VALUE IN INDEX 2
		System.out.println(al.toString());
		Integer ele = al.get(2);//RETRIVING ELEMENT BY INDEX
		System.out.println("Element at index 2 : "+ele);
		//System.out.println("Element at index 2 : "+al.get(3));//error
		
		}
}