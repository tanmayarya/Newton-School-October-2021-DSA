package JavaBasics;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		// Q1 check prime
		
//		boolean isPrime = true;
//		
//		for(int i = 2; i*i <= n; i++) {
//			if(n % i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		
//		if(isPrime == true) {
//			System.out.println("Prime");
//		} else {
//			System.out.println("Not Prime");
//		}
		
		
		//Q2 nth fib
		 
//		int prev = 0, curr = 1;
//		
//		int next = prev + curr;
//		
//		for(int i = 2; i <= n; i++) {
//			next = prev + curr;
//			prev = curr;
//			curr = next;
//			
////			System.out.println(i + "th fibnacci is " + next);
//		}
//		System.out.println(n + "th fibnacci is " + next);
		
		
		// reverse a number
//		int lastD = 0, newNo = 0;
//		while(n > 0) {
//			lastD = n % 10;
//			n = n / 10;
//			newNo = newNo * 10 + lastD; 
//		}
//		System.out.println(newNo);
		
//		*
//		**
//		***
//		****
//		*****
		
//		for(int row = 1; row <= n; row++) {
//			for(int col = 1; col <= n; col++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		// star pyramid
		int noSpaces = n - 1;
		int noStars = 1;
		
		for(int row = 1; row <= n; row++) {
			// print spaces
			for(int i = 1; i <= noSpaces; i++) {
				System.out.print(" ");
			}
			
			// print stars
			for(int i = 1; i <= noStars; i++) {
				System.out.print("*");
			}
			
			//decrement noSpaces
			noSpaces -= 1;
			
			//increment noStart
			noStars += 2;
			
			System.out.println();
			
		}
		
		
		
	}

}
