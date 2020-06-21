package BitwiseOperators;
/*
 * This class will be a sandbox used to understand how bitwise operators work in java
 * 
 * */
public class BitwiseOperators {

	public static void main(String args[]) {
		int a = 15;
		int b = 27;
		
		//15 = 0000 1111
		//27 = 0001 1011
		
		//Binary AND Operators(&)
		int and = a&b;
		//11 = 0000 1011
		
		//Binary OR Operator(|)
		int or = a|b;
		//31 = 0001 1111
		
		//Binary XOR Operator(^)
		int xor = a^b;
		//20 = 0001 0100
		
		//Binary One Complement OPerators(~)
		int oneComplement = ~a;
		//-16 = 0001 0000
		
		//Binary Left Shift Operators(<<)
		int leftShift = a << 2;
		
		//Binary Right Shift OPerator(>>)
		int rightShift = a >> 2;
		
		//Binary Right Shift Zero Fill Operator(>>>)
		int shiftRightZero = a >>>2;
		
//		System.out.println("And Operator: " + and);
//		System.out.println("Or Operator: " + or);
//		System.out.println("Xor Operator: " + xor);
//		System.out.println("1's Complement Operator: " + oneComplement);
//		System.out.println();
//		System.out.println();
		int decimal = 0110110;
		System.out.println(decimal);
		
	}
}
