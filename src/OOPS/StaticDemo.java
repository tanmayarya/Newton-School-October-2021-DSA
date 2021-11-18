package OOPS;


class Person{
	String name;
	static int count;
	
	static {
		count = 10;
		System.out.println("inside static block");
	}
	
	Person() {
		count++;
	}
	
	 static void printCount() {
		 System.out.println(count);
//		 System.out.println(name);
		 
		 Person o = new Person();
		 o.printInfo();
		 
	 }
	 
	 void print() {
		 printInfo();
	 }
	 
	 static void printInfo() {
//		 System.out.println(this.name);
		 System.out.println(count);
	 }
}

public class StaticDemo {
static class innerClass {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person s1 = new Person();
//		Person s2 = new Person();
//		
//		System.out.println(s1.count);
//		s1.count = 5;
//		System.out.println(s2.count);
	
//		Person p = new Person();
//		System.out.println(p.name);
		System.out.println(Person.count);
//		p.printInfo();
		Person.printCount();
		StaticDemo.innerClass c = new innerClass();

	}

}
