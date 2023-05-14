
class CTest1 //SubClass
 {
    int a=10;//Instance Variable
    CTest1()//Constructor
     {
       System.out.println("====CTest1()====");
       System.out.println("The value a:"+a);
     }
    void dis()//Instance method
     {
       System.out.println("====dis()====");
       System.out.println("The value a:"+a);
     }
  }
class constructor1 //MainClass
{
    public static void main(String[] args)
    {
       CTest1 ob = new CTest1();//Constructor call
       ob.dis();//Instance method call
       ob.dis();
       ob.dis();
       
     }

}