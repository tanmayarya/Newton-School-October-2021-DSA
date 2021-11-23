package OOPSImplementation;

abstract public class Shape {
private int sides;

public int getSides() {
	return sides;
}

public void setSides(int sides) {
	this.sides = sides;
}
	
	public Shape(int side) {
		this.sides = side;
	}
	abstract void area();
}
