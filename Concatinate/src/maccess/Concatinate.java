package maccess;
public class Concatinate 
	{
		public static void main(String[] args)
			{
				String s1 = "java";
				String s2 = "language";
				String s3 = "program";
				System.out.println("====Using concat() method====");
				String s4 = s1.concat(s2).concat(s3);
				System.out.println(s4.toString());
				System.out.println("====Using '+' symbol====");
				String s5 = s1+s2+s3;
				System.out.println(s5.toString());
			}
	}