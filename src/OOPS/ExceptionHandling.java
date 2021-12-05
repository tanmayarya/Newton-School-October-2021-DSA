package OOPS;

public class ExceptionHandling {
	
	public static int divide(int a, int b) throws Exception {
		
//		if(b == 0) {
//			throw new ArithmeticException("you can not divide by 0");
//		}
		int result = 0;
		try {
			
			System.out.println("before an exception");
			result = a/b;
//			int arr[] = new int[1];
//			arr[1] = 2;
			System.out.println("after an exception");
			
			
		}
		catch(NullPointerException ex) {
			System.out.println("null pointer catch block");
		}
//		catch(ArithmeticException ex) {
//			System.out.println("inside arithmetic catch block");
//		}
//		catch(Exception ex) {
//			System.out.println(ex.getMessage());
//			System.out.println("exception catch block");
//		}
		finally {
			System.out.println("inside finally block");
		}
				
		
		return result;
	}
	
	public static int fun(int a) throws Exception {
		return divide(a, a);	
	}

	public static void main(String[] args) {
		try {
			System.out.println(fun(0));
		} catch (Exception e) {
			System.out.println("Inside main catch block");
			// TODO: handle exception
		}
		
		

	}

}
