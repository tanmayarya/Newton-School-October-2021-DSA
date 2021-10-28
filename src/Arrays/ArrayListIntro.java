package Arrays;

import java.util.*;

public class ArrayListIntro {
	
	
	

	public static void main(String[] args) {

		
		ArrayList<Integer> al = new ArrayList();
		System.out.println(al);
		
		
		// add element
//		al.add(1);
//		al.add(2);
//		System.out.println(al);
//		
//		System.out.println(al.size());
//		
//		al.add(1, 5);
//		System.out.println(al + "->" + al.size());
//		
//		//get element
//		System.out.println(al.get(2));
//		
//		
//		// set element 
//		al.set(1, 8);
//		System.out.println(al);
//		
//		// remove
//		al.remove(2);
//		System.out.println(al);
//		
//		al.add(5);
//		al.add(6);
//		al.add(10);
//		al.add(11);
//		al.add(12);
		System.out.println(al);
//		
		// remove all the even elements from the array
		int arr[] = {1, 2, 5, 6, 10, 11, 12};
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] % 2 == 1) { // if odd
				al.add(arr[i]);
			} 
		}
		System.out.println(al);
		
	}

}
