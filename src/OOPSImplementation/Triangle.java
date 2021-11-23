package OOPSImplementation;

public class Triangle extends Shape {
	int h;
	int b;
	public Triangle(int h, int b) {
		super(3);
		this.h = h;
		this.b = b;
	}

	@Override
	void area() {
		System.out.println(0.5 * b * h);
	}

}
