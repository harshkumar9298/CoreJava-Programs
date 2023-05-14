package maccess;
import java.util.*;;
@SuppressWarnings("serial")
public class DemoException5 extends Exception
	{
	public DemoException5(String msg)
	{
		super(msg);
	}
	public static void main(String[] args)

	{
		Scanner s = new Scanner(System.in);
		try(s;){
			try
			{
				System.out.println("Enter the rollNo:");
				String rollNo = s.nextLine();
				if(rollNo.length()!=10)//Exception
				{
					DemoException5 ob=new DemoException5("Invalid rollNo.."); throw ob;
				}
				System.out.println("****Enter 6 Sub Marks***"); int i=1,totM=0;
				while(i<=6)
				{
					try
					{
						System.out.println("Enter Marks of Sub"+i);
						int sub = s.nextInt();
						if(sub<0 || sub>100)//Exception 
							{
							DemoException5 de=new DemoException5("Invalid Marks"); throw de;
							}
						totM = totM+sub;
						i++;
					}//end of try
					catch(DemoException5 de)
					{
						System.out.println(de.getMessage()); }
				}//end of loop
				System.out.println("RollNo:"+rollNo);
				System.out.println("totMarks:"+totM);
			}//end of try
			catch(DemoException5 ob)
			{
				System.out.println(ob.getMessage());
			}
		}//end of try-with-resource
	}
}