package p1;

public class EmpSalary 
{
 public void calculationDisplay(int bSal)
 {
	 System.out.println("====EmpSalary====");
	 System.out.println("Bsal:"+bSal);
	 float totSal=bSal+(bSal*0.93F)+(0.63F*bSal);
	 System.out.println("TotSal:"+totSal);
 }
}
