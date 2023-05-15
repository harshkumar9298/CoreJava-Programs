package test;
public class Access {
	public static ITest getRef() {
		//Anonymous InnerClass as implementation class
		ITest ob = new ITest()
		{
			public void m(int x)
			{
				System.out.println("===InnerClass m(x)==="); System.out.println("The value x:"+x);
			}
		};
		return ob;
	}//end of method
}