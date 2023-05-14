package p2;
import java.util.Scanner;
import p1.EmpData;
import p1.EmpAddress;
import p1.EmpContact;
import p1.EmpSalary;
public class EmpMainClass 
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee Id:");
		String eId=s.nextLine();
		System.out.println("Enter the Employee Name:");
		String eName=s.nextLine();
		System.out.println("Enter the Employee Designation:");
		String eDesg=s.nextLine();
		EmpData ed=new EmpData(eId,eName,eDesg);
		
		
		System.out.println("Enter the House No:");
		String hNo=s.nextLine();
		System.out.println("Enter the sName:");
		String sName=s.nextLine();
		System.out.println("Enter the city:");
		String city=s.nextLine();
		System.out.println("Enter the pin code:");
		int pinCode=Integer.parseInt(s.nextLine());
		EmpAddress ea=new EmpAddress(hNo,sName,city,pinCode);
		
		
		System.out.println("Enter the MailId:");
		String mId=s.nextLine();
		System.out.println("Enter the MobileNo:");
		long mNo=s.nextLong();
		EmpContact ec=new EmpContact(mId,mNo);
		
		System.out.println("Enter the BasicSalary:");
		int bsal=s.nextInt();
		EmpSalary es=new EmpSalary();
		
    		
		ed.getEmpData();
		ea.getAddress();
		ec.getEmpContact();
		es.calculationDisplay(bsal);
		
		s.close();
	
	}

}
