package p1;

public class Deposite
{
	public void deposite(int Amt, Balance b)
	{
		System.out.println("Balance Deposited:"+Amt);
		b.bal=(Amt+(b.bal));
		System.out.println("Balance Available:"+b.bal);
		System.out.println("Transaction Completed....");
	}
}