class BTest2 //SubClass
  {
    int a=10;//Instance Variable memory in object
    static int b=20;//Static Variable memory in Class

   {
     a++;
     b++;
     System.out.println("====Instance block====");
     System.out.println("The value a:"+a);
     System.out.println("The value b:"+b);
   }
  }
class instanceBlock //MainClass
{
    public static void main(String[] args)
     {
      System.out.println("*****Object-1*****");
      BTest2 ob1 = new BTest2();
      System.out.println("*****Object-2*****:");
      BTest2 ob2 = new BTest2();

     }
}