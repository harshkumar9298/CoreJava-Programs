package maccess;
import java.util.*;
import test.*;
public class DemoInheritance2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Display d = new Display();//Con_Call
		d.read(s);
		d.dis();
	}
}