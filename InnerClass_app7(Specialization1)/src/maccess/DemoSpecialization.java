package maccess;
import test.*;
	public class DemoSpecialization {
		public static void main(String[] args) {
			CClass ob = (CClass)new PClass();
			ob.m1(12);
			ob.m2(13);
			ob.m3(14);
		}
}