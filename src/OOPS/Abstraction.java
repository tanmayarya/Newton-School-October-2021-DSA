package OOPS;
//import OOPSImplementation.Shape;
abstract class AbstractDemo {
	int a;
	 
	public AbstractDemo(int a) {
		this.a = a;
	}
	
	abstract void sum(int a, int b);
	abstract void printN(int n);
}

class AbstractDemoChild extends AbstractDemo{
	public AbstractDemoChild() {
		super(10);
	}

	@Override
	void sum(int a, int b) {
		System.out.println(b + a);
		
	}

	@Override
	void printN(int n) {
		// TODO Auto-generated method stub
		
	}
}

public class Abstraction {

	public static void main(String[] args) {
//		AbstractDemo obj1 = new AbstractDemo();
		AbstractDemoChild c = new AbstractDemoChild();
		AbstractDemo obj = new AbstractDemoChild();
		obj.sum(0, 0);
		c.sum(10, 20);

	}

}
