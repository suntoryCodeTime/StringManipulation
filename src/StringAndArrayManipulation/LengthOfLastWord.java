package StringAndArrayManipulation;

public class LengthOfLastWord {

public static int lengthOfLastWord1(String s) {
		
		//Create an array by splitting the String
		String[] arr = s.split(" ");
		
		//Now simply return the length of the string stored at the last index in the arrary
		/*if(arr.length > 0)
			return arr[arr.length-1].length();
		return 0;*/
		
		return arr.length > 0 ? arr[arr.length - 1].length() : 0;
	}
	
	public static int lengthOfLastWord2(String s) {
		
		int count = 0;
	
		String rS = reverse(s);
		
		if(rS == null) {
			return 0;
		}
		
		int n = s.length();
		int pos = 0;
		
		//Find pos of first letter
		while(pos < n && rS.charAt(pos) == ' ') {
			pos++;
		}
		
		//Start counting from pos of first char until end of string or empty space is encounterd
		while(pos < n && rS.charAt(pos) != ' ') {
			pos++;
			count++;
		}
		
		return count;
	}
	
	private static String reverse(String input) {
		if(input == null)
			return null;
		
		StringBuilder output = new StringBuilder(input);
		
		return output.reverse().toString();
	}
	
}
