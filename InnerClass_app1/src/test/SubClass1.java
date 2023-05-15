package test;
public class SubClass1 {
	public int a=10;
	public static int b=20;
	public void m1() {
		System.out.println("===OuterClass m1()====");

		System.out.println("The value a:"+a);
		System.out.println("The value b:"+b);
	}//OuterClass method
	public static class SubClass2{
		public void m2() {
			System.out.println("===InnerClass Instance method m2()====");
			//System.out.println("The value a:"+a);//Error 
			System.out.println("The value b:"+b);
		}
		public static void m22() {
			System.out.println("===InnerClass static method m22()====");
			//System.out.println("The value a:"+a);//Error 
			System.out.println("The value b:"+b);
		}
	}//Static member InnerClass
}//OuterClass