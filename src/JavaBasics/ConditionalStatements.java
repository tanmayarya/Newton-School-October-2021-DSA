package JavaBasics;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 34;
//		
//		if(age > 18) {
//			System.out.println("Minor");
//		}else {
//			System.out.println("Adult");
//		}
//		
		//grade system
		// marks >= 90 print grade as A
		// marks >= 70 and < 90 print grade as B
//		marks >=50 and < 70 print grade C
//		marks < 50 print D
		
		
		// Z patern
		
//		System.out.println("*****");
//		System.out.println("   *");
//		System.out.println("  *");
//		System.out.println(" *");
//		System.out.println("*****");
//		System.out.println("*****\n   *\n  *\n *\n*****");
		
		//
		// Print name of the day
		int day = 7;
		
//		if(day == 1) {
//			System.out.println("Monday");
//		} else if(day == 2) {
//			System.out.println("Tuesday");
//		} else if(day == 3) {
//			System.out.println("Wednesday");
//		} else if(day == 4) {
//			System.out.println("Thursday");
//		} else if(day == 5) {
//			System.out.println("Friday");
//		} else if(day == 6) {
//			System.out.println("Saturday");
//		}
//		else {
//			System.out.println("Sunday");
//		}
		
		
		switch (4) {
		case 1:
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day");
			
		}

	}

}
