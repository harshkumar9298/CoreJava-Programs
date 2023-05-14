package test;
public interface ITest {
	public abstract void m1(int x);
		private void m2(int y)
		{
			System.out.println("===NonStatic private m2(y)===");
			System.out.println("The value y:"+y);
		}
		private static void m3(int z)
		{
			System.out.println("===Satic private m3(z)===");
			System.out.println("The value z:"+z);
		}
		public default void access(int y,int z)
		{
			this.m2(y);
			ITest.m3(z);
		}
}