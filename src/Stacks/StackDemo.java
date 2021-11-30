package Stacks;
import java.util.*;
public class StackDemo {
	
	public static boolean duplicateBrackets(String s) {
		
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == ')') {
				if(st.peek() == '(') {
					return true;
				}
				while(st.peek() != '(') {
					st.pop();
				}
				st.pop();
				
			} else st.push(c);
		}
		return false;
	}
	
	public static boolean checkcompliment(Stack<Character> st, char bracket) {
		if(st.isEmpty()) return false;
		if(st.peek() != bracket) return false;
		st.pop();
		return true;
	}
	
	public static boolean balancedBrackets(String s) {
		Stack<Character> st = new Stack<Character>();
		
		for(int i =0; i< s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(' || c == '[' || c == '{') {
				st.push(c);
			} else if(c == ')') {
				if(checkcompliment(st, '(') == false) return false;
				
			
			} else if(c == ']') {
				if(checkcompliment(st, '[') == false) return false;	
			
				
			} else if(c == '}') {
				if(checkcompliment(st, '{') == false) return false;	
			}
			
		}
		
		return st.isEmpty();
	}

	public static void main(String[] args) {
		
//		Stack<Integer> st = new Stack<>();
//		st.push(2);
//		st.push(3);
//		st.push(4);
//		System.out.println(st.size());
//		System.out.println(st.peek());
//		
//		System.out.println(st.pop());
//		System.out.println(st.size());
//
//		st.clear();
//		System.out.println(st.isEmpty());
//		st.push(5);
//		System.out.println(st.isEmpty());
//		
//		LinkedList<Integer> list = new LinkedList<>();
//		list.isEmpty();
//		
//		Scanner scn = new Scanner(System.in);
		
//	System.out.println(duplicateBrackets("((a+b)+(c))"));
		System.out.println(balancedBrackets("{([a+b]+d)+e}{"));
	}

}
