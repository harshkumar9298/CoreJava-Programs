package p2;
import java.util.Scanner;
import p1.Balance;
import p1.Deposite;
import p1.WithDraw;
import p1.CheckPinNo;


class BankMainClass 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the pin:");
		int PinNo=s.nextInt();
        CheckPinNo cp=new CheckPinNo();
		boolean P = cp.verify(PinNo);
		if(P)
		{
			System.out.println("1 Withdraw:\n2 Deposite:\n3 Check Balance:");
			int pr = s.nextInt();
			Balance b=new Balance();
			switch(pr)
			{
                case 1:
					WithDraw w=new WithDraw();
					System.out.println("Enter the amount you want to withdraw:");
				    int amt=s.nextInt();
					if(amt>0 && amt%100==0)
			        	{
					       w.wDraw(amt,b);
						}
					else
				        {
						System.out.println("Please Enter Amount only multiple of 100 ");
						}
                    break;
                case 2:
					Deposite D=new Deposite();
				    System.out.println("Enter the amount you want to Deposite:");
				    int Amt=s.nextInt();
					if(Amt>0 && Amt%100==0)
				       {

                         D.deposite(Amt,b);
					   }
					 else
				       {
				    	System.out.println("Please Enter Amount only multiple of 100");
				   	   }
					 break;
                case 3:
					
				    b.getBalance();
				    break;
				default:
					System.out.println("Please Enter Valid Choice");
				    
			}
		}
		       s.close();
	}
}