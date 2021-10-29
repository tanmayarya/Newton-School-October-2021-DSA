package Strings;

public class StringBuilderIntro {

	// toogle cases
	// abAc -> ABaC
	
	public static String toggleCase(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i); // E
			
			char d;
			if(c >= 'A' && c <= 'Z') // if c is Uppercase
			{
				d  = (char)(c - 'A' + 'a');
			} 
			else { // c is lowercase
				d = (char)(c -'a' + 'A');
			}
			sb.append(d);
			
		}
		
		return sb.toString();
	}
	
	// ASCII difference
	// acd => a2c1d
	// aefbd => a4e1f-4b2d
	
	
	//acd => a2c
	public static String ASCIIDifference(String s) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(s.charAt(0));
		
		for(int i = 1; i < s.length(); i++) {
			char curr = s.charAt(i);
			char prev = s.charAt(i - 1);
			
			int diff = curr - prev;
			sb.append(diff);
			sb.append(curr);
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuilder sb = new StringBuilder("Hey");
		System.out.println(sb);
		
		//get char
		char c = sb.charAt(0);
		System.out.println(c);
		
		//set char
		sb.setCharAt(2, 'a');
		System.out.println(sb);
		
		//insert or add at index		
		sb.insert(1, 'e');
		System.out.println(sb);
		
		//add in end
		sb.append('c');
		System.out.println(sb);

		
		//remove
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		//delete the substring
		sb.delete(1, 4);
		System.out.println(sb);
		
//		String s = sb.toString();
//		System.out.println(s);
		
		System.out.println("--------------------");
//		System.out.println(toggleCase("ABcdeFS"));
		
		System.out.println(ASCIIDifference("aefbd"));
		
	}

}
