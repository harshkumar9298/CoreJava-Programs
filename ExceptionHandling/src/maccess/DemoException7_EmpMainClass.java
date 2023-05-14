package maccess;
import java.util.*;
import test.*;
public class DemoException7_EmpMainClass
	{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;){
			try
			{
				System.out.println("Enter the desg:");
				String desg = s.nextLine().toUpperCase();
				CheckDesignation ob = new CheckDesignation();//Con_call
				ob.verify(desg);//method_call
				System.out.println("Enter empId:");
				String eId = s.nextLine().toUpperCase();
				CheckEmpId ob2 = new CheckEmpId();
				ob2.verify(eId);//method_call
				System.out.println("Desg:"+desg);
				System.out.println("EmpId:"+eId);
			}//end of try
			catch(CheckDesignation ob)
			{

				System.out.println(ob.getMessage());
			}
			catch(CheckEmpId ob2)
			{
				System.out.println(ob2.getMessage());
			}
		}//end of try with resource
	}
}