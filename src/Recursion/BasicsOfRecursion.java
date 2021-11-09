package Recursion;

public class BasicsOfRecursion {
	
	public static void printDecreasing(int n) {
		
		if(n == 0) {
			System.out.println(0);
			return;
		}
		
		System.out.println(n);
		printDecreasing(n-1);
	}
	
	
	public static void main(String[] args) {
		printDecreasing(5);
	}
}
