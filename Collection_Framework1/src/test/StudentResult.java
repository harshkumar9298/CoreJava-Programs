package test;

public class StudentResult
{
	public String grade;
	public String calculate(float per, boolean B)
	{
	  if(B)
		{
		  grade="fail";
		}
         else if (per>=70 && per<=100)
         {
		    grade="Distinction";
		 
          }
	     else if (per>=60 && per<70)
    	  {
     	    grade="First Division";
	      }

	     else if (per>=50 && per<60)
	      {
		    grade="Second Division";
	      }

	     else if (per>=35 && per<50)
	      {
		    grade="third Division";
	      }

	     else 
	      {
		    grade="fail";
	      }
	     return grade;

	 }
}
