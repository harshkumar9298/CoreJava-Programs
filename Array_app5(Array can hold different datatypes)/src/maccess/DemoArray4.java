package maccess;
import test.Product;
public class DemoArray4 {
	public static void main(String[] args) {
		Object o[] = new Object[3];
		o[0] = new Integer("1234");//Integer Object
		o[1] = new String("Raj");//String Object
		o[2] = new Product("A111","Mouse",123.45F,12);
		//User defined class object
		System.out.println("====Display from Object Array====");
		for(Object k : o)
		{
			System.out.println(k.toString());
		}//end of loop
	}
}