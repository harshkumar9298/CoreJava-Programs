
import java.util.Scanner;
class CTest4 //SubClass
   {
    CTest4(int x)//Parameterized Constructor
     {
       System.out.println("====CTest4(x)====");
       System.out.println("The value x:"+x);
     }
   }
class constructor3 //MainClass
  {
     public static void main(String[] args)
     	{
    	 	Scanner s = new Scanner(System.in);
    	 	System.out.println("Enter the value of x:");
    	 	int x = s.nextInt();
    	 	CTest4 ob = new CTest4(x);//Con_Call_with_para
    	 	s.close();
     	}

  }