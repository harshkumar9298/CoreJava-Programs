import java.util.Scanner;
class Balance
{
	double bal=2000;
	void getBalance()
	{
		System.out.println("Your Available Balance is:"+bal);
	}
}

class CheckPinNo
{   boolean k=false;
	boolean verify(int pinNo)
	{
       if(pinNo==1111 || pinNo==2222 || pinNo==3333)

         {
            k=true;
         }
		else
		 {
			System.out.println("WARNING!!!!......Enter valid Pin No");
		 }
		
		 return k;
	 }
}



class Deposite
{
	void deposite(int Amt, Balance b)
	{
		System.out.println("Balance Deposited:"+Amt);
		b.bal=(Amt+(b.bal));
		System.out.println("Balance Available:"+b.bal);
		System.out.println("Transaction Completed....");
	}
}

class WithDraw
{
	void wDraw(int amt, Balance b)
     {
	   if(amt<b.bal)
	    {
         System.out.println("Amount Withdrawn:"+amt);
	     b.bal=b.bal-amt;
	     System.out.println("Balance available:"+b.bal);
	     System.out.println("Transaction Completed....");
	    }
	   else
		 {
		   System.out.println("OPPS!!!....Insufficient Fund");
		 }
     }
}
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
