package randomProblems;

import java.util.Arrays;

public class CountDigits {
	
//	static int  lcm(int a, int b){
//		int lcm=1;
//		if(a%b==0 || b%a==0) {
//			lcm=Math.max(a, b);
//		}
//		else {
//			for(int i=Math.max(a, b); i<=a*b; i++) {
//				if(i%a==0 && i%b==0) {
//					lcm=i;
//					break;
//				}
//			}
//		}
//	
//		return lcm;
//	}
	//(method to detect if a number is prime . time complexity is O[sqrt(n)])
	static boolean prime(int n) {
		
		if(n<=1) {
			return false;
		}
		if(n==2 || n==3)
			return true;
		if(n%2==0 || n%3==0)
			return false;
		for(int i=5; i*i<=n; i=i+6) {
			if(n%i==0 || n%(i+2)==0) 
				return false;
		}
		return true;
		
	}
	
	static void pf(int y) {
		for(int j=2; j<y; j++) {
				if(prime(j)) {
					int l=j;
					while(y%l==0) {
						 System.out.print(j+", ");
						 l=l*j;	
					}
				}
					
			}
		}
		
	

	static void divisors(int n) {
		int i;
		for( i=1; i*i<=n; i++) {
			if(n%i==0) {
				System.out.print(i+", ");
			}
		}
		for( i=i-1; i>=1; i--) {
			if(n%i==0 && n/i!=i)
				System.out.print(n/i+", ");
		}
			
		
	}

	
	static void sieve(int n) {
		boolean[] a = new boolean[n+1];
		Arrays.fill(a, true);

		for(int i=2; i*i<=n; i++) {
			if(prime(i)) {
				for(int j=2*i; j<=n; j=j+i) {
					a[j]=false;
				}
			}
		}
		for(int i=2; i<=n; i++) {
			if(a[i])
				System.out.print(i+", ");
		}
	}
		//Leetcode
		static void paypal(String s) {
			String[] g = s.split("");
			int count=0;
			String f = s;
			
			while(f.contains("01")) {
				for(int i=0; i<s.length()-1; i++) {
					if(g[i].equals("0") && g[i+1].equals("1")) {
						g[i]="1";
						g[i+1]="0";
					}	
				}
				f="";
				for(int i=0; i<s.length(); i++) {
					f=f+g[i];
				}
				count++;
			}			
			System.out.println("count="+count);
			System.out.println(f);	
		}
	
		
		static int power(int x, int n) {
			int res = 1;
			if(n%2==0) {
				for(int i=1; i<=n/2; i++) {
					res = res*x;
				}
				res=res*res;
			}
			else {
				res = power(x,n-1)*x;
			}
			return res;
		}
	
		//computing power : TC: O(logn)
		static int pow(int x, int n) {
			if(n==0)
				return 1;
			int temp = pow(x, n/2);
			temp = temp*temp;
			if(n%2==0)
				return temp;
			else
				return temp*x;
		}
		
		static int ipower(int x, int y) {
			int res =1;
			while(y>0) {
				if(y%2!=0)
					res=res*x;
				x=x*x;
				y=y/2;
			}
			System.out.println(res);
			return res;
		}
		
		
		
		
	

	public static void main(String[] args) {
		
//int a=lcm(3,7);
//boolean a=prime(49);
//pf(315);
//		divisors(12);
//		System.out.println();
//		divisors(36);
		//sieve(25);
		//paypal("0110");
//System.out.println(pow(2,1));
		//int x =ipower(2,1);
		
		System.out.println(prime(5));
		
		
}

	

}


