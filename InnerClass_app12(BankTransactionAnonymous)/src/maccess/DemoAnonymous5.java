package maccess;
import test.*;
import java.util.*;
public class DemoAnonymous5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		abc:
			while(true)
			{
				System.out.println("Enter the pinNo:");
				int pNo = s.nextInt();

				CheckPin cpn = new CheckPin();
				boolean k = cpn.verify(pNo);
				if(k)
				{
					System.out.println("====Choice====");
					System.out.println("1.WithDraw\n2.Deposit");
					System.out.println("Enter the Choice:");
					int choice = s.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("Enter the amt:");
						int a1 = s.nextInt();
						if(a1>0 && a1%100==0)
						{
							Transaction wd = new Transaction()
							{
								public void process(int amt)
								{
									if(amt<b.bal)
									{
										System.out.println("Amt withdrawn:"+amt);
										b.bal=b.bal-amt;

										b.getBalance();
										System.out.println("Transaction Completed..."); }//end of if
									else
									{
										System.out.println("Insufficient Fund...");
									}
								}
							};
							wd.process(a1);
						}//end of if
						else
						{
							System.out.println("Invalid amt...");
						}
						break abc;//stop the while
					case 2:

						System.out.println("Enter the amt:");
						int a2 = s.nextInt();
						if(a2>0 && a2%100==0)
						{
							Transaction dp = new Transaction()
						    {
								public void process(int amt)
								{
									System.out.println("Amt Deposited:"+amt);
									b.bal=b.bal+amt;
									b.getBalance();
							 	System.out.println("Transaction Completed..");
								}
						    }
							;
							dp.process(a2);
						}//end of if
						else
						{
							System.out.println("Invalid amt..");
						}
						break abc;//stop the while
					default:
						System.out.println("InValid choice...");
						break abc;//stop the while
					}//end of switch
				}//end of if
				else
				{
					System.out.println("Invalid PinNo...");
					count++;
				}
				if(count==3)
				{

					System.out.println("Sorry ! Transaction blocked...");
					break;//stop the loop
				}
			}//end of loop4 
		s.close();
	}
}