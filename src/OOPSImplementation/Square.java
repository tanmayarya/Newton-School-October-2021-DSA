package OOPSImplementation;

public class Square extends Shape {
	
	public Square(int side) {
		super(side);
	}

	@Override
	void area() {
		System.out.println("side * side");
	}
}
