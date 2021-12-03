package Recursion;

public class RecursionQuestions {

	public static void printReverse(int arr[], int idx) {
		
		if(idx == arr.length) return;
		
		printReverse(arr, idx + 1);
		System.out.println(arr[idx]);
	}
	
	public static int max(int arr[], int idx) {
		
		if(idx == arr.length - 1) return arr[idx];
		
		int maxr = max(arr, idx+1);
		return Math.max(maxr, arr[idx]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		printReverse(new int[] {10, 2, 3, 0, 7, 1, 5}, 0);
	
		System.out.println(max(new int[] {10, 2, 3, 0, 7, 1, 5}, 0));
	}

}
