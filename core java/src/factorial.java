import java.util.Scanner;
class factorial //MainClass
{
    public static void main(String[] args)
     {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the value of n:");
       int n = s.nextInt();
       int fact=1;
       
       if(n>0)
        {
          for(int i=n;i>=1;i--)
           {
             fact=fact*i;
           }//end of loop
          System.out.println("Factorial of "+n+" is "+fact);
         }//end of if

       else
        {
          System.out.println("Invalid input...");
        }
      }
  
}