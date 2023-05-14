package p1;

public class EmpAddress 
{
	public String hNo,sName,city;
	public int pinCode;
	public EmpAddress(String a,String b,String c,int d)
	{
	 hNo=a;
	 sName=b;
	 city=c;
	 pinCode=d;
	 
	}
	public void getAddress()
	{
	 System.out.println("======EmpAddress======");
	 System.out.println("HNo:"+hNo); 
	 System.out.println("sName:"+sName);
	 System.out.println("EmpDesg:"+city);
	 System.out.println("pinCode:"+pinCode);
	}
}
