package randomProblems;


public class BitwiseOperators {

	public static void main(String[] args) {
		int a = 15, b=27;
		// 15 is 0000 1111  (8421)BCD
		// 27 is 0001 1011  (16 8 4 2 1)
		int and = a&b;
		int  or = a|b;
		int xor = a^b;
		int oc = ~a;
		int ls = a << 2;
		int rs = a >> 2;
		int rszero = a >>> 2;
		System.out.println("AND OPERATOR a&b=" + " " + and );
		System.out.println("OR OPERATOR a|b=" + " " + or );
		System.out.println("XOR OPERATOR a^b=" + " " + xor );	
		System.out.println("OnesComplement ~a=" + " " + oc );
		System.out.println("LeftShift OPERATOR a<<2=" + " " + ls );
		System.out.println("RightShift OPERATOR a>>2=" + " " + rs );
		System.out.println("RightShiftZero OPERATOR a>>>2=" + " " + rszero );

	}

}
