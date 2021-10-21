package Arrays;

import java.util.Scanner;

public class ArrayQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		int arr[]  = {10,2,3,15,17,20,12,6};
		
		// return max value in array
		int max = arr[0];
		
//		for(int i = 1; i< arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}	
//		}
//		System.out.println(max);
		
		
		
		// return index of max element
		
//		int maxIdx = 0;
//		for(int i = 1; i< arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//				maxIdx = i;
//			}	
//		}
//		System.out.println(maxIdx);
		
		
		// linear search 
		// return -1 if not found else return the index
		
		int val = scn.nextInt();
//		int idx = -1;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == val) {
//				idx = i;
//				break;
//			}
//		}
		
		// binary search
		//
		
//		System.out.println(idx);
		
		int a[] = {1,3,5,6,8,10};
		
		int left = 0, right = a.length - 1;
		int idx = -1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			// check equality
			if(a[mid] == val) {
				idx = mid;
				break;
			} else if(val > a[mid]) { // val is greater so ignore the left area
				left = mid + 1;
			} else {// val is smaller so ignore the right area
				right = mid - 1;
			}
		}
		System.out.println(idx);
		
		
		// reverse an array
		// least value
		// sum of array 
		// search the last idx of an element  using linear search and binary search
	
		
	}

}
