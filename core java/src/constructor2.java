class CTest2 //SubClass
{
    int a=10;//Instance Variable memory in Object
    int b=10;//Instance Variable memory in object
    static int k=10;//static variable memory in class
  static
   {
     k++;
     System.out.println("====Static block====");
     System.out.println("The value k:"+(++k));
   }

   {
     b++;
     k++;
     System.out.println("====Instance block====");
     System.out.println("The value a:"+(a++));
     System.out.println("The value b:"+b);
     System.out.println("The value k:"+(++k));
   }
  CTest2()//Constructor
   {
     b++;
     k++;

     System.out.println("====CTest2()====");
     System.out.println("The value a:"+(a++));
     System.out.println("The value b:"+b);
     System.out.println("The value k:"+(++k));
    }
   void dis()//Instance method
    {
      b++;
      k++;
      System.out.println("====dis()====");
      System.out.println("The value a:"+(a++));
      System.out.println("The value b:"+b);
      System.out.println("The value k:"+(++k));
    }
}
class constructor2 //MainClass
 {
    public static void main(String[] args)
     {
       CTest2 ob = new CTest2();//Constructor call
       ob.dis();//Instance method call
     }
 }