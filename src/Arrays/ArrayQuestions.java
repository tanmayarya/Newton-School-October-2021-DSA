package Arrays;

import java.util.Scanner;

public class ArrayQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
//		int arr[]  = {10,2,3,15,17,20,12,6};
		
		// return max value in array
//		int max = arr[0];
		
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
		
//		int val = scn.nextInt();
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
		
//		int a[] = {1,3,5,6,8,10};
//		
//		int left = 0, right = a.length - 1;
//		int idx = -1;
//		
//		while(left <= right) {
//			int mid = (left + right) / 2;
//			
//			// check equality
//			if(a[mid] == val) {
//				idx = mid;
//				break;
//			} else if(val > a[mid]) { // val is greater so ignore the left area
//				left = mid + 1;
//			} else {// val is smaller so ignore the right area
//				right = mid - 1;
//			}
//		}
//		System.out.println(idx);
		
		
		// reverse an array
		// least value
		// sum of array 
		// search the last idx of an element  using linear search and binary search
	
		
		
		
		// Alternate Sum
		
//		int sumOdd = 0, sumEven = 0;
//		
//		for(int i =0; i < arr.length; i++) {
//			if(i%2 == 0) { // even case
//				sumEven += arr[i]; // sumEven = sumEven + arr[i];
//			} else { // odd case 
//				sumOdd += arr[i];
//			}
//		}
//		System.out.println("Odd Sum = " + sumOdd);
//		System.out.println("Even Sum = " + sumEven);
		
		
		
		// sum of 2 arrays
		
//		int n1 = scn.nextInt();
//		int arr1[] = new int[n1];
//		
//		for(int i = 0 ; i < n1; i++) {
//			arr1[i] = scn.nextInt();
//		}
//			
//		int n2 = scn.nextInt();
//		int arr2[] = new int[n2];
//		
//		for(int i = 0; i < n2; i++) {
//			arr2[i] = scn.nextInt();
//		}
//		
//		int maxLength = Math.max(n1, n2);
//		
//		int result[] = new int[maxLength + 1];
//		
//		int i = arr1.length - 1;
//		int j = arr2.length -1;
//		int k = result.length - 1;
//		int carry = 0;
//		
//		while (k >= 0) {
//			int sum = 0;
//			
//			
//			
//			if(i >= 0) {
//				sum += arr1[i];
//			}
//			
//			if( j >= 0) {
//				sum += arr2[j];
//			}
//			
//			sum += carry;
//			
//			result[k] = sum % 10;
//			carry = sum >= 10 ? 1 : 0; 
//
//			
//			i--;
//			j--;
//			k--;
//		}
//		
//		for(i = 0; i < result.length;i++)
//			System.out.print(result[i] + " ");
		
		
		// Reverse an array
		
		int arr[]  = {10,2,3,15,17,20,12,6};
		int left = 0;
		int right = arr.length -1;
		
		while(left < right) {
			
			// swap element at left with element at right
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
