package test;
public class CClass extends PClass{
public int a=200;
	public void m(int x,int y)
	{

		super.m(x);//PClass_method_Call_with_1_para

		System.out.println("The value y:"+y);
	}
	public void m(int x,int y,int z)
	{

		this.m(x,y);//method_call_with_2_para
		System.out.println("The value z:"+z);
	}
	public void dis()
	{
		System.out.println("====Display Variable data===");
		System.out.println("PClass a:"+super.a);
		System.out.println("CClass a:"+this.a);
	}
}