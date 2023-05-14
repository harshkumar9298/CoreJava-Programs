package test;
public class PClass {
	public PClass(int a)
	{
		System.out.println("The value a:"+a);
	}
	public PClass(int a,int b)
	{
		this(a);//Same class Con_call_with_1_para
		System.out.println("The value b:"+b);
	}
}