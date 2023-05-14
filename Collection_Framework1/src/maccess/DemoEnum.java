package maccess;
import test.Cars;
public class DemoEnum {
	public static void main(String[] args) {
		Cars c[] = Cars.values();//Generating Array
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i].toString()+" Costs "+c[i].getPrice()+" thousand Dollars");
		}
	}
	}