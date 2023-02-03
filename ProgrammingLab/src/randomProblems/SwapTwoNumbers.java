package randomProblems;

public class SwapTwoNumbers {
	public static void main (String[] args) {
		int a=10, b=20;
		System.out.println("BEFORE SWAP a = "+a+", b = "+b);
		//logic 1
		int temp =a;
		a=b;
		b=temp;
		
//		logic 2 without using third variable
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
//		Logic3 provided a not equal to zero and b not equal to zero
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
		System.out.println("AFTER SWAP a = "+a+", b = "+b);
		
	}

}
