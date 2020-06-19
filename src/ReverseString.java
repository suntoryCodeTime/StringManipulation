import java.util.Stack;

public class ReverseString {
	
	//Reverse a String in Place
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

}
