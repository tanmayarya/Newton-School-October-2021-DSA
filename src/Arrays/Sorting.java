package Arrays;

import java.util.Scanner;

public class Sorting {
	
	public static void insertionSort(int arr[]) {
		
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
			
		}
		
	}
	
	public static void bubbleSort(int arr[]) {
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i; j++) {
				
				if(arr[j] > arr[j+1]) { // left element is greater
					// swap j with j+1
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	
	public static void selectionSort(int arr[]) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			int minIdx = i;
			
			// finding the minIdx
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIdx])
					minIdx = j;
			}
			
			// swap ith element with element at minIdx
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}
	}
	
	public static void display(int arr[]) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 3, 1, 4, 2};
//		Scanner scn = new Scanner(System.in);
//		int t = scn.nextInt();
//		
//		for(int i = 0; i < t; i++) {
//			int n = scn.nextInt();
//			int arr[] = new int [n];
//			for(int j = 0; j < n; j++) {
//				arr[j] = scn.nextInt();
//			}
//			bubbleSort(arr); 
//		}
		display(arr);
//		bubbleSort(arr);
//		display(arr);
//		selectionSort(arr);
		insertionSort(arr);
		display(arr);
		
	}

}
