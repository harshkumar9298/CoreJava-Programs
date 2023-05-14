package test;

public class StudentDetails {

	public String Sname,Sbranch,Result;
	public int S1,S2,S3,S4,S5,S6,totMarks;
	float per;
	public StudentDetails(String Sname,String Sbranch,int S1,int S2,int S3, int S4,int S5,int S6,
			              int totMarks,float per,String Result )
	{
		this.Sname=Sname;
		this.Sbranch=Sbranch;
		this.S1=S1;
		this.S2=S2;
		this.S3=S3;
		this.S4=S4;
		this.S5=S5;
		this.S6=S6;
		this.totMarks=totMarks;
		this.per=per;
		this.Result=Result;
		
	}
	public String toString()
	{
		return Sname+"\t"+Sbranch+"\t"+S1+"\t"+S2+"\t"+S3+"\t"+S4+"\t"+S5+"\t"+S6+"\t"+totMarks
				          +"\t"+per+"\t"+Result;
	}

}
