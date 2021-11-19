package OOPS;

class Parent {
	int a;
	int c;
	
	public Parent() {
		this.a = 10;
		System.out.println(a);
	}
	
	public Parent(int a, int c) {
		this.a = a;
		this.c = c;
	}
	
	void printParent() {
		System.out.println(this.a);	
	}
}

class Child extends Parent {
	int a;
	int b;
	
	public Child() {
	}
	
	// overriding
	@Override
	void printParent() {
		System.out.println("inside child");
	}
	
	public Child(int a, int c, int a2, int b) {
		super(a,c);
		this.a = a2;
		this.b = b;
		
	}
	
	void PrintChild() {
		System.out.println(this.b);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}


class Shape {
	int side;
	
	void area() {
		System.out.println("Area of the shape");
	}
}

class Square extends Shape {
	
	public Square() {
		super.side = 4;
	}
	
//	@Override
	void area() {
		System.out.println("Area is side * side");
	}
}

class Triangle extends Shape {
	public Triangle() {
		super.side = 3;
	}
	
//	@Override
	void area() {
		System.out.println("Area is 0.5 * b * h");
	}
}

public class Inheritance {

	public static void main(String[] args) {
//		Parent p = new Parent();
////		p.printA();
//
//		Child c = new Child();
////		c.printB();
////		c.printA();
//		
//		System.out.println(c.a+ " " + c.b);
		
//		Child c =  new Child(10, 20, 30, 40);
		
//		Parent p = new Child();
//		System.out.println(p.c);
//		System.out.println(p.b);
		
//		Child c = new Parent();
		
		Shape s = new Shape();
		Shape sq = new Square();
//		Triangle t = new Triangle();
		
//		s.area();
		sq.area();
//		t.area();
		
	}

}
