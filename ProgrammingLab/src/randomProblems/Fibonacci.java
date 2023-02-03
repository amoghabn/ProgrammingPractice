package randomProblems;

public class Fibonacci {

	public static void main(String[] args) {
		int first=0, second=1, n=2, i=0;
		
//		fibonacci using while loop
		
//		while(i<n) {
//			System.out.print(first + " ");
//			int third = first + second;
//			first = second;
//			second = third;
//			i++;
//		}
		
//      fibonacci using recursive function
		for(int j=0; j<n; j++) {
			System.out.print(fib(j)+" ");
		}
	}
	
	public static int fib(int k) {
		if(k<1)
			return 0;
		else if (k==1)
			return 1;
		return fib(k-1)+fib(k-2);
	}

}
