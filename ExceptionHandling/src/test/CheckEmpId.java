package test;
@SuppressWarnings("serial")
public class CheckEmpId extends Exception
	{
	public CheckEmpId() {}
	public CheckEmpId(String msg)
	{
	 super(msg);
	 }
	public void verify(String empId)throws CheckEmpId
	{
		try
		{
			switch(empId)
			{
			case "A111":
				break;
			case "B222":
				break;
			case "C333":
				break;
 	default://Exception
 		CheckEmpId cei = new CheckEmpId("Invalid empId");
 		throw cei;
			}//end of switch
		}//end of try
		catch(CheckEmpId cei)
		{
			throw cei;//re-throwing
		}
	}
}