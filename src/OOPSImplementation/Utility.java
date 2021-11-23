package OOPSImplementation;

public class Utility {

	public static void main(String[] args) {
		Shape shape = new Square(4);
		shape.area();
		
		System.out.println(shape.getSides());
//		
//		Shape t = new Triangle(3, 4);
//		t.area();
		
		Car c = new Car();
		c.start();
		c.accelerate(10);
		
		Vehicle v = new Car();
		 
	}

}
