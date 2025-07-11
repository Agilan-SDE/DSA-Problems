import java.util.ArrayList;
import java.util.Stack;

public class ValidParenthesis {
	public static boolean ValidParenthesis(ArrayList<Character> N) {
		Stack<Character> M = new Stack<Character>();
		
		for(int i=0;i<N.size();i++) {
			char ch = N.get(i);
			
			if(ch=='{' || ch=='[' || ch=='(') {
				M.push(ch);
			}
			else {
				if(M.isEmpty()) {
					return false;
				}
				
				else if(ch=='}') {
					if(M.peek()=='{') {
						M.pop();
					}else {
						return false;
					}
				}
				else if(ch==']') {
					if(M.peek()=='[') {
						M.pop();
					}
					else {
						return false;
					}
				}
				else if(ch==')') {
					if(M.peek()=='(') {
						M.pop();
					}
					else {
						return false;
					}
				}
				}
				
			}
		
		if(M.size()==0) {
			return true;
		}
		
		return false;
	}
	public static void main(String[]args) {
		
		String s = "Agilan(is an intelligent){boy}so the teammatees are [making jealous of him]";
		ArrayList<Character> N = new ArrayList<Character>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='{' || s.charAt(i)=='}' || s.charAt(i)=='[' || s.charAt(i)==']' || s.charAt(i)=='(' || s.charAt(i)==')') {
				N.add(s.charAt(i));
			}
		}
		
		if(ValidParenthesis(N)) {
			System.out.println("Valid Parenthesis");
		}
		else {
			System.out.println("Not Valid Parenthesis");
		}
	}

}
