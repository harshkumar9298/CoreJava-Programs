package maccess;
public class DemoArray5 {
	public static void main(String[] args) {
		Integer a1[] = {1,2,3};
		Integer a2[] = {11,12,13,14};
		Integer a3[] = {111,121,131,141,151};
		Integer a4[] = {112,122,132,142,152,162};
		Integer a[][] = {a1,a2,a3,a4};//Jagged_Array
		System.out.println("====Display from JaggedArray====");
	for(Integer i[] : a)
	{
		System.out.print("Array : ");
		for(Integer j : i)
		{
			System.out.print(j.toString()+" ");
		}//InnerLoop
		System.out.println();
	}//OuterLoop
	}
}