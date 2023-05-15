package test;
public class Access {
	public static ITest getRef() {
		class IClass implements ITest
		{
			public void m(int x)
			{
				System.out.println("===InnerClass m(x)===");
				System.out.println("The value x:"+x);

			}
		}//InnerClass
		IClass ob = new IClass();//InnerClass object
		return ob;
	}//end of method
}