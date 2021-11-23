package OOPS;
import Arrays.ArrayBasics;


public class AccessModifiers extends ArrayBasics {
	public int a;
	private int b;
	protected int c;
	int d;

	public static void main(String[] args) {
		A obj = new A();
//		int val = obj.b;
		
		ArrayBasics obj2 = new ArrayBasics();
//		int b = obj2.a;
		
		AccessModifiers obj3 = new AccessModifiers();
		int b = obj3.a;
	}
}
