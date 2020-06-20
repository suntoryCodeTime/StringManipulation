import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class ReverseString {
	
	//Reverse a String in Place O(1)
	public static char[] reverseString(char[] s) {
		int i = 0;
		int n = s.length-1;
		
		char temp;
		
		while(i <= n) {
			
			temp = s[i];
			s[i] = s[n];
			s[n] = temp;
			
			i++;
			n--;
		}
		
		
		return s;
	}
	
	
	//O(n) since we are allocating memory for a stack
	public static char[] reverseStringStack(char[] s) {
		Stack<Character> charStack = new Stack<>();
		
		for(char a : s) {
			charStack.push(a);
		}
		
		for(int i = 0; i < s.length; i++) {
			s[i] = charStack.pop();
		}
		
		return s;
	}
	
}
