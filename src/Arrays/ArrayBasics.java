package Arrays;

import java.util.Scanner;

public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		
		int marks[];
		marks = new int[5];
//		marks[0] = 30;
//		marks[1] = 40;
//		marks[2] = 60;
//		marks[3] = 50;
//		marks[4] = 70;
		
//		System.out.println(marks.length);
		
//		for(int i = 0; i < marks.length; i++) {
//			marks[i] = scn.nextInt();
//		}
//		
//		for(int i = 0; i < marks.length; i++) {
//			System.out.println(marks[i]);
//		}
		
		int arr[] = {1,2,3,4};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int b[] = arr;
		
		b[2] = 10;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	
		
		

	}

}
