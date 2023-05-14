import java.util.Scanner;
class UserDetails //SubClass
	{
		String uName,pWord,fName,lName,mailId;
		long phoneNo;
		UserDetails(){}
		
		UserDetails(String a,String b,String c,String d,String e,long f)
			{
				uName=a;
				pWord=b;
				fName=c;
				lName=d;
				mailId=e;
				phoneNo=f;
			}
		void setUserDetails(String a,String b,String c,String d,String e,long f)
			{
				uName=a;

				pWord=b;
				fName=c;
				lName=d;
				mailId=e;
				phoneNo=f;
			}
		void getUserDetails()
			{
				System.out.println("====UserDetails====");
				System.out.println("UserName:"+uName);

				System.out.println("PassWord:"+pWord);
				System.out.println("FirstName:"+fName);
				System.out.println("LastName:"+lName);
				System.out.println("MailId:"+mailId);
				System.out.println("PhoneNo:"+phoneNo);
			}

	}
class constructor4 //MainClass
	{
		public static void main(String[] args)
			{
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the UserName:");

				String uN = s.nextLine();
				System.out.println("Enter the PassWord:");
				String pW = s.nextLine();
				System.out.println("Enter the FirstName:");

				String fN = s.nextLine();
				System.out.println("Enter the LastName:");

				String lN = s.nextLine();
				System.out.println("Enter the MailId:");
				String mId = s.nextLine();
				System.out.println("Enter the PhoneNo:");
				long phNo = s.nextLong();
				System.out.println("====Choice====");
				System.out.println
				("1.Constructor\n2.setter method\n3.Object reference");
				System.out.println("Enter the Choice:");
				int choice = s.nextInt();
				
				switch(choice)
					{
						case 1:
							UserDetails ud1 =new UserDetails(uN,pW,fN,lN,mId,phNo);
							//Con_call_with_Para
							ud1.getUserDetails();
							break;
	
						case 2:
							UserDetails ud2 = new UserDetails();
							//Con_Call_with_OUT_para
							ud2.setUserDetails(uN,pW,fN,lN,mId,phNo);
							ud2.getUserDetails();
							break;
						case 3:
							UserDetails ud3 = new UserDetails();
							//Con_Call_with_OUT_Para
							ud3.uName = uN;
							ud3.pWord = pW;
							ud3.fName = fN;
							ud3.lName = lN;
							ud3.mailId = mId;
							ud3.phoneNo = phNo;
							ud3.getUserDetails();
							break;
						default:
							System.out.println("Invalid Choice....");

					}//end of choice
				s.close();

			}
	}