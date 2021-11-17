package OOPS;

public class Basics {
	
	static class Student {
		String name;
		int rollNo;
		float marks;
		
		Student() {
			this("Tanmay", 1, 1.1f);
		}
		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		
		Student s2 = new Student("Sid", 2, 3.4f);
		s2.printInfo();
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
