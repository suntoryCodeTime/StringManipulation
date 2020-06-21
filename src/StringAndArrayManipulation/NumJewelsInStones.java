package StringAndArrayManipulation;

public class NumJewelsInStones {
	public static int numJewelsInStones(String J, String S) {
		int numJewels = 0;
		
		for(char c : S.toCharArray()) {
			if(J.contains(String.valueOf(c))) {
				numJewels++;
			}
		}
		
		
		return numJewels;
	}

}
