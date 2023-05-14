package maccess;
import java.util.*;
@SuppressWarnings("serial")
public class DemoException4 extends Exception
	{
	public DemoException4(String msg)
	{
		super(msg);//Passing the message to parent
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;){
			try
			{
				System.out.println("Enter the emp bSal:"); int bSal = s.nextInt();
				if(bSal<12000)//Condition for Exception 
					{
					DemoException4 ob = new DemoException4("Invalid bSal...");
					throw ob;//throwing object reference 
					}

				float totSal =bSal+(0.93F*bSal)+(0.63F*bSal);
				System.out.println("BSal:"+bSal);
				System.out.println("TotSal:"+totSal); }//end of try
			catch(DemoException4 ob)
			{
				System.out.println(ob.getMessage());
			}
			catch(InputMismatchException ime)
			{

				System.out.println("Enter only Integer value..");
			}
		}//end of try with resource
	}
}