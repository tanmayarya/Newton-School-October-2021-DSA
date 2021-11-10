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
	
	public static void printIncreasing(int n) {
		
		if(n == 1) {
			System.out.println(n);
			return;
		}
		
		printIncreasing(n-1);
		System.out.println(n);
	}
	
	
	public static int fact(int n) {
		if(n == 0) 
			return 1;
		
		int fnm1 = fact(n-1);
		int fn = n * fnm1;
		return fn;
	}
	
	public static int pow1(int n, int p) {
		
		if(p == 0) return 1;
		
		int pm1 = pow1(n, p -1);
		int ans = pm1 * n;
		return ans;
	}
	
public static int pow2(int n, int p) {
		
		if(p == 1) return n;
		
		int po = pow2(n, p/2);
		int ans = 0;
		if(p % 2 == 0) {
			ans = po * po; 
		} else {
			ans = po * po * n;
		}
		
		return ans;

	}
	
	public static void main(String[] args) {
//		printDecreasing(5);
//		printIncreasing(10);
//		System.out.println(fact(6));
		System.out.println(pow2(3, 4));
		
	}
}
