package test;
public class CClass extends PClass{
	public CClass(int a,int b,int c)
	{
		super(a,b);//PClass_Con_call_with_2_para
		System.out.println("The value c:"+c);
	}
	public CClass(int a,int b,int c,int d)
	{
		this(a,b,c);//Same Class Con_Call_with_3_para
		System.out.println("The value d:"+d);
	}
}