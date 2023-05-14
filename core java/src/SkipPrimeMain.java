import java.util.Scanner;

class primeNo
{
	void checkPrime(int r)
	 { 
		for(int i=1;i<=r;i++)
		 {
         int count=0;
         for(int j=1;j<=i;j++)
		  {
             if(i%j==0)
              {
                count++;
               }
		  }
          if(count!=2)
            {

              System.out.println(i+" ");
            }
         
           }
          }
}



class  SkipPrimeMain
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Range of Number:");
		int r=s.nextInt();
        primeNo pn=new primeNo();
		pn.checkPrime(r);
		s.close();
	}
}
