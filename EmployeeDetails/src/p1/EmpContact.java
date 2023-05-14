package p1;

public class EmpContact 
{
  public String mailId;
  public long phNo;
  public EmpContact(String a,long b)
  {
	  mailId=a;
	  phNo=b;
  }
  public void getEmpContact()
  {
	  System.out.println("=====EmpContact=====");
	  System.out.println("MailId:"+mailId);
	  System.out.println("PhNo:"+phNo);
  }
}
