package p1;

public class WithDraw
{
	public void wDraw(int amt, Balance b)
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