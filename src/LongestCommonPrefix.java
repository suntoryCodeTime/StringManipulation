
public class LongestCommonPrefix {
	
	public static String longestCommonPrefixHorizontalScanning(String[] strs) {
		//Base case - Return empty string if array is empty
		if(strs == null || strs.length == 0)
			return "";
		
		String prefix = strs[0]; //Set the default prefix to the first string
		
		//Iterate through each remaining string in the array
		for(int i = 1; i < strs.length; i++) {
			
			
			//indexOf will either return the first occuring index of the prefix
			//Or it -1 if it is not found. In either case, the prefix will be trimed by one
			//Until it is empty, once the condition is met that is the index returned is 0
			//The next string in the array will be used to find the shortest prefix
			while(strs[i].indexOf(prefix) != 0) {
				
				 //Succesively trim prefix until it is found in the string
				 prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
			}
			
		}
		
		return prefix;
	}
	
	
	public static String longestCommonPrefixVerticalScanning(String[] strs) {
		
		//Case where array is empty or null
		if(strs == null || strs.length == 0) {
			return "";
		}
		
		String first = strs[0]; //Set the default prefix to the first string
		
		char temp; //This variable is the target at which we will check every character against
		
		//For every character in the first string
		
		for(int i=0; i<first.length(); i++) {
			
			//Set the temp variable against each character in the first string of the array
			temp = first.charAt(i);
			
			//Vertically iterate through each character in every string remaining in the array
			for(int j = 1; j < strs.length; j++) {
			
				//If the
				 if (i == strs[j].length() || strs[j].charAt(i) != temp)
		                return strs[0].substring(0, i);   
				
			}
			
		}
		
		
		return first;
	}

}
