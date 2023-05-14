class BTest1 //SubClass
{
     int a=10;//Instance variable memory in object
     static int b=20;//Static Variable memory in class
     
     static
        {
             System.out.println("====SubClass StaticBlock===");
             //System.out.println("The value a:"+a); //because static block do not able to access instance variable 
             System.out.println("The value b:"+b);

         }
  }
class staticBlock //MainClass
{
      int x=100;//Instance variable memory in Object
      static int y=200;//Static variable memory in Class
      public static void main(String[] args)
         {
             System.out.println("====main() method====");
             //System.out.println("The value x:"+x);//because static block do not able to access instance variable 
             System.out.println("The value y:"+y);
             BTest1 ob = new BTest1();
         }
      static
         {
             System.out.println("====MainClass StaticBlock====");
             //System.out.println("The value x:"+x);//because static block do not able to access instance variable 
             System.out.println("The value y:"+y);
          }
}