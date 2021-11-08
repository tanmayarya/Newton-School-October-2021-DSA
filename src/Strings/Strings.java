package Strings;

public class Strings {
	
	public static void printAllSubstrings(String s) {
		for(int start = 0; start < s.length(); start++) {
			for(int end = start + 1; end <= s.length(); end++) {
				System.out.println(s.substring(start, end));
			}
		}
	}
	
	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		
		while(left < right) {
			char lchar = s.charAt(left);
			char rchar = s.charAt(right);
			if(lchar != rchar) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
		
	}
	
	// print all palindromic substrings
	public static void printAllPaindromicSubstrings(String s) {
		for(int start = 0; start < s.length(); start++) {
			for(int end = start + 1; end <= s.length(); end++) {
//				System.out.println(s.substring(start, end));
				
				if(isPalindrome(s.substring(start, end))) {
					System.out.println(s.substring(start, end));
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "naman";
//		s += 10;
//		System.out.println(s);
//		System.out.println(10 + 20 + "Hi" + 10 + 20);
		
//		char c = s.charAt(4);
//		System.out.println(c);
		
//		System.out.println(s.substring(1, 5));
//		System.out.println(s.substring(6));
//		
//		String strArr[] = s.split("H");
//		for(int i = 0; i< strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
		
		// length()
		
//		for(int i = 0; i < s.length(); i++) {
//			char a = s.charAt(i);
//			System.out.println(a);
//		}
//		
		
//		s.toCharArray()

//		printAllSubstrings("Hey");
//		System.out.println(isPalindrome("123214"));
		
//		char c = 'e';
//		
//		System.out.println(c);
//		System.out.println(c - 2);
//		System.out.println((char)(c - 2));
//		
//		for(int i = 0; i < 26; i++) {
//			System.out.println((char)('a' + i) + " ->" + ('a' + i));
//		}
		
//		printAllPaindromicSubstrings(s);
		
		String a = "Hey How Are You";
		String arr[] = a.split(" ");
		
		for(int i = 0; i < arr.length; i++)
			System.out.println(i + "index, :" + arr[i]);
		
		char arr2[] = a.toCharArray();
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
			
			
		}
		// aa
		// aaa
		// ba
		// baa
		
		
		System.out.println((int)' ');
		
		String q = "adadadf";
		isPalindrome(q);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
