package test;
@SuppressWarnings("serial")
public class CheckDesignation extends Exception
	{
	public CheckDesignation() {}
	public CheckDesignation(String msg)
	{
		super(msg);
	}
	public void verify(String desg)throws CheckDesignation  {
		try
		{
			switch(desg)
			{
			case "SE":
				break;
			case "ME":
				break;
			case "TE":
				break;
			default: //Exception
				CheckDesignation cd =
				new CheckDesignation("Invalid desg...");throw cd;
			}//end of switch
		}//end of try

		catch(CheckDesignation cd)
		{
			throw cd;//re-throwing process
		}
	}
}