package maccess;
import test.*;
public class DemoInnerAbstractClass3 {
	public static void main(String[] args) {
      AClass ob= new AClass() {};
      AClass.AClass1 ob2 =ob.new AClass1() {
    	  public void m1(int x)
			{
				System.out.println("====m1(x)====");
				System.out.println("The value x:"+x);
			}
    	  
      };
      ob2.m1(122);
     
      AClass.AClass2 ob3 =new AClass.AClass2() {
    	  
    	  public void m2(int y)
			{
				System.out.println("====m2(y)====");
				System.out.println("The value y:"+y);
			}
    	  
      };
      ob3.m2(123);

	}

}
