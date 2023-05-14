package maccess;
import java.util.*;
import test.*;
public class DemoArray7_Student {
	public static void main(String[] args)

	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Students:");
		int n = Integer.parseInt(s.nextLine());
		StudentData sd[] = new StudentData[n];//Array
		System.out.println("****Enter "+n+" Student Details****");
		for(int i=0;i<sd.length;i++)
		{
			sd[i] = new StudentData();
			System.out.println("Enter the Name:");
			sd[i].name=s.nextLine();
			System.out.println("Enter the branch:");
			sd[i].branch = s.nextLine().toUpperCase();
			CheckBranch cb = new CheckBranch();
			boolean k = cb.verify(sd[i].branch);
			if(k)
			{
				System.out.println("Enter the rollNO:");
				sd[i].rollNo = s.nextLine();
				if(sd[i].rollNo.length()==10)
				{
					ValidateBranch vb = new ValidateBranch();
					boolean z = vb.verify(sd[i].branch, sd[i].rollNo.substring(6,8));

					if(z)
					{
						System.out.println("===Enter 6 Sub Marks===");
						int j=1,totM=0;
						boolean p=false;
						while(j<=6)
						{
							System.out.println("Enter the Sub"+j);
							int sub = Integer.parseInt(s.nextLine());
							if(sub<0 || sub>100)
								{
								 System.out.println("Invalid Marks..");
								 continue;//Skipping below lines from loop
								  }
								
								
									if(sub>=0 && sub<=34)
									{
										p=true;
									}
								
								
									totM=totM+sub;
									j++;
								
								
							}//end of loop
							sd[i].totMarks=totM;
							sd[i].per=(float)sd[i].totMarks/6;
							StudentResult sr = new StudentResult();

							sd[i].result=sr.generate(sd[i].per,p);
						
					 }//end of if
						else
						{
							System.out.println("RollNo not Matched with Branch..");
							System.exit(0);//stop the program
						}
					}//end of if
					else
					{
						System.out.println("Invalid rollNo...");
						System.exit(0);//stop the program
					}
				}//end of if
				else
				{
					System.out.println("Invalid Branch");
					System.exit(0);//Stop the program
				}
			}//end of loop
			System.out.println("====Display Student Details====");
			Spliterator<StudentData> sp = Arrays.spliterator(sd);

			sp.forEachRemaining((k)->
			{
				System.out.println(k.toString());
			});
			s.close();
		}
	}