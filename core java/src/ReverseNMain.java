
import java.util.Scanner;
class reverse
{
  void checkRev(int a)
	{
	  for(int i=10;i<=a;i++)
	  {
        int rev=0;
	    for(int j=i ;j>0;j=j/10)
		{
            rev=rev*10+j%10;
		}
	        System.out.println(rev);
	  }
	}
}


class ReverseNMain 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Range:");
		int n=s.nextInt();
		reverse r=new reverse();
		System.out.println("======Reverse of Numbers are======");
		r.checkRev(n);
		s.close();
		
	}
}
