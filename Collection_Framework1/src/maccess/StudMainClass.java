package maccess;
import java.util.*;
import test.StudentPercentage;
import test.StudentResult;
import test.StudentDetails;
class StudMainClass 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		Map<String,StudentDetails> m = null;
		System. out.println("====Choice====");
		System.out.println("1.HashMap\n2.LinkedHashMap\n3.TreeMap\n4.Hashtable");
		System.out.println("Enter the Choice:");
		int choice = Integer.parseInt(s.nextLine());
		switch(choice)
		{
		case 1:
			m = new HashMap<String,StudentDetails>();
			break;
		case 2:
			m = new LinkedHashMap<String,StudentDetails>();
			break;
		case 3:
			m = new TreeMap<String,StudentDetails>();
			break;
		case 4:
			m = new Hashtable<String,StudentDetails>();
			break;
		default:
			System.out.println("Invalid Choice...");
			System.exit(0);
		}//end of switch
		System.out.println("Enter the number of Students:");
		int n = Integer.parseInt(s.nextLine());
		System.out.println("Enter "+n+" Student Details");
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the student RollNo:");
			String Sroll= s.nextLine();
			System.out.println("Enter the student name:");
			String Sname= s.nextLine();
			System.out.println("Enter the student branch:");
			String Sbranch= s.nextLine();
			System.out.println("========Enter six subject marks========");
			System.out.println("Enter first subject mark");
			int S1= Integer.parseInt(s.nextLine());
			System.out.println("Enter second subject mark");
			int S2= Integer.parseInt(s.nextLine());
			System.out.println("Enter third subject mark");
			int S3= Integer.parseInt(s.nextLine());
			System.out.println("Enter fourth subject mark");
			int S4= Integer.parseInt(s.nextLine());
			System.out.println("Enter fifth subject mark");
			int S5= Integer.parseInt(s.nextLine());
			System.out.println("Enter sixth subject mark");
			int S6= Integer.parseInt(s.nextLine());
		
			if((S1>0 && S1<=100)&& (S2>0 && S2<=100)&&(S3>0 && S3<=100)
				&&(S4>0 && S4<=100)&&(S5>0 && S5<=100)&&(S6>0 && S6<=100))
				{
				boolean b =false;
			    
				if(S1<35||S2<35||S3<35||S4<35||S5<35||S6<35)
				{
	              b=true;
				}
			
		        int totMarks=(S1+S2+S3+S4+S5+S6);
		        StudentPercentage sp= new StudentPercentage();
	            float per=sp.calculate(totMarks);
	            StudentResult sr= new StudentResult();
	            String Result= sr.calculate(per,b);
			
	            m.put(new String(Sroll),new StudentDetails(Sname,Sbranch,S1,S2,S3,S4,S5,S6,totMarks,per,Result)); 
	            									//Adding String-BookValues Object pair to Map Object 
				}
			else {
				System.out.println("Invalid marks.....!");
				}
		}//End of loop
		System.out.println("====StudentDetails====");
		m.forEach((p,q)->//p=key q=value
		{
			System.out.println(p.toString()+"\t"+q.toString()); 
		});
		System.out.println("====Primary Keys====");
		Set<String> st = m.keySet();//Primary Keys are retrieved 
		st.forEach((x)->
		{
			System.out.println(x.toString());
		});
		System.out.println("====NonPrimary KeyValues===="); 
		Collection<StudentDetails> c = m.values();
		//retrieving Values
		c.forEach((y)->
		{
			System.out.println(y.toString());
		});
		
		s.close();
	}
}
