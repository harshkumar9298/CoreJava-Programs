package maccess;
import java.lang.Thread;
public class DemoException6
	{
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Value : "+i);
			try
			{
				Thread.sleep(5000);//stop execution for 5000 ms 
				}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}//end of loop
	}
}