package OOPS;

class Student {
	String name;
	int rollNo;
	float marks;
	
	// default constructor
	Student() {
		
		
		System.out.println("defaultv constructor");
	}
	
	// parameterized constructor
	Student(String name) {
		
	}
	
	// parameterized constructor
	Student(String name, int rollNo, float marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		
	}
	
	public void printInfo() {
		System.out.println("Name :" + this.name);
		System.out.println("RollNo :" + this.rollNo);
		System.out.println("Marks :" + this.marks);
	}
	
}

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Student s1 = new Student();
		s1.name = "Tanmay ";
		Student s2 = new Student("Sid", 2, 3.4f);
		s2.printInfo();
		
		final int a = 2;
//		a = 3;
		
		
//		printInfo();
//		Student s3 = s2;
		
//		s1.name = "tanmay";
//		s1.rollNo = 1;
//		s1.marks = 78.5f;
//		
//		s2.name = "sid";
//		s2.rollNo = 2;
//		s2.marks = 88.456f;
		
//		s1.printInfo();
//		System.out.println(s1.rollNo);
//		s2.printInfo();
//		s3.printInfo();
	}

}
