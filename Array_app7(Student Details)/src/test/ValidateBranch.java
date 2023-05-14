package test;
public class ValidateBranch {
	public boolean z=false;
	public String br=null;
 	public boolean verify(String branch,String code)
 	{
 		switch(code)
 		{
 		case "05":br="CSE";
 		break;
 		case "04":br="ECE";
 		break;
 		case "02":br="EEE";
 		break;
 		}//end of switch
 		if(br!=null) {
 			if(br.equals(branch)) {
 				z=true;
 			}//end of if
 		}//end of if
 		return z;
 	}//end of method
}