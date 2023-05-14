package test;
public class PClass {
	public int a=10;
		public void m1() {

			System.out.println("====PClass m1()====");
			System.out.println("The value a:"+a);
		}

		{
			System.out.println("====PClass Instance block====");
			System.out.println("The value a:"+a);
		}
  }