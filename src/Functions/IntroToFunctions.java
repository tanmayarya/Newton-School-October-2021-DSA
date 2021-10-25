package Functions;

import java.util.Scanner;

public class IntroToFunctions {

	public static int fact(int n) { // n is parameter
		int factorial = 1;
		
		for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
		
		return factorial;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		
//		int nfact = 1;
//		
//		for(int i = 1; i<=n; i++) {
//			nfact *= i;
//		}
//		
//		int nmrfact = 1;
//		for(int i = 1; i <= n-r; i++) {
//			nmrfact *= i;
//		}
		
		int nfact = fact(n); // n is argument
		int nmrfact = fact(n - r);
		
		int npr = nfact / nmrfact;
		
		System.out.println(npr);
	}
	
	
	
}
