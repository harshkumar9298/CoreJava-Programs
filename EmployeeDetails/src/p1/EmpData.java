package p1;

public class EmpData 
{
	public String empId,empName,empDesg;
	public EmpData(String a,String b,String c)
	{
	 empId=a;
	 empName=b;
	 empDesg=c;
	 
	}
	public void getEmpData()
	{
	 System.out.println("======EmpData======");
	 System.out.println("EmpId:"+empId); 
	 System.out.println("EmpName:"+empName);
	 System.out.println("EmpDesg:"+empDesg);
	}

}
    
