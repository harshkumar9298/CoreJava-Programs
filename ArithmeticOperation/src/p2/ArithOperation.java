package p2;
import java.util.Scanner;

import p1.Addition;
import p1.Subtraction;
import p1.Multiplication;
import p1.Division;
import p1.ModDivision;


class ArithOperation //MainClass
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the int value1:");
		int v1 = s.nextInt();
		System.out.println("Enter the int value2:");
		int v2 = s.nextInt();
		System.out.println("====Choice====");
		System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.modDiv");
		System.out.println("Enter the Choice:");
		int choice = s.nextInt();
		
		switch(choice)
			{
				case 1:
					Addition ad = new Addition();
					int r1 = ad.add(v1,v2);
					System.out.println("Sum:"+r1);
					break;
				case 2:
					Subtraction sb = new Subtraction();
					int r2 = sb.sub(v1,v2);
					System.out.println("Sub:"+r2);
					break;
				case 3:
					Multiplication ml = new Multiplication();
					int r3 = ml.mul(v1,v2);
					System.out.println("Mul:"+r3);
					break;
				case 4:
					Division dv = new Division();
					float r4 = dv.div(v1,v2);
					System.out.println("div:"+r4);
					break;
				case 5:
					ModDivision md = new ModDivision();
					int r5 = md.modDiv(v1,v2);
					System.out.println("ModDiv:"+r5);
					break;
				default:

					System.out.println("Invalid Choice...");
			}//end of switch
		s.close();
	}
}