package Arrays;

import java.util.Scanner;

public class Array2D {

	public static void printZigZag(int arr[][]) {
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i % 2 == 0) {
				for(int j = 0; j <arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for(int j = arr[i].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
//			System.out.println();
		}
	}
	
	public static void display(int arr[][]) {
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printDiagonally(int arr[][]) {
		for(int gap = 0; gap < arr.length; gap++) {
			for(int i = 0, j = gap; j <arr.length; j++, i++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	
	public static void printSpiral(int arr[][]) {
		
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		
		int total = arr.length * arr[0].length;
		int count = 0;
		
		while(count < total) {
			
			// print left wall
			for(int i = minr; i <= maxr && count < total; i++) {
				System.out.println(arr[i][minc]);
				count++;
			}
			minc++;
			
			// print bottom wall
			for(int i = minc; i <= maxc && count < total; i++) {
				System.out.println(arr[maxr][i]);
				count++;
			}
			maxr--;
			
			// print right wall
			for(int i = maxr; i >=minr && count < total; i--) {
				System.out.println(arr[i][maxc]);
				count++;
			}
			maxc--;
			
			// print top wall
			for(int i = maxc; i >= minc && count < total; i--) {
				System.out.println(arr[minr][i]);
				count++;
			}
			minr++;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);

//		int row = scn.nextInt();
//		int col = scn.nextInt();
		
		int arr[][] = {
				{11, 12, 13, 14, 15, 16}, 
				{21, 22, 23, 24, 25, 26}, 
				{31, 32, 33, 34, 35, 36},
				{41, 42, 43, 44, 45, 46},
				{51, 52, 53, 54, 55, 56},
				{61, 62, 63, 64, 65, 66},
				};
//		arr = new int[row][col];
//		
//		
//		for(int i = 0; i < row; i++) {
//			for(int j = 0; j < col; j++) {
//				arr[i][j] = scn.nextInt();
//			}
//		}
//		
//		for(int i = 0; i < row; i++) {
//			for(int j = 0; j < col; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		arr = {{1,2}};
		
		display(arr);
//		printZigZag(arr);
//		printSpiral(arr);
		printDiagonally(arr);
		
	}

}
