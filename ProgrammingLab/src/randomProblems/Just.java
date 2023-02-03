package randomProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Just {

//	static void set(int a, int n) {
//		if((a&(1<<(n-1))) == 0) 
//			System.out.println("not set");
//		else
//			System.out.println("set");		
//	}
	
	static int numofsets(int n) {
		int res=0;
//		for(int i=1; i<32; i++) {
//			if((n&1)==1) 
//				res++;
//			n=(n>>1);
//		}
		
//		while(n>0) {
//			if(n%2==1)
//				res++;
//			n=n/2;
//		}
		while(n>0) {
			n=(n&(n-1));
			res++;
		}
		return res;
	}
	
	
	static boolean TF(int n) {
//		if(n==1)
//			return true;
//		if(n==0)
//			return false;
//		while(n>1) {
//			if(n%2==1)
//				return false;
//			n=n/2;
//		}
//		return true;
		
		if(n==0)
			return false;
		return ((n&(n-1))==0);
		
	}
	
//	static int  eo(int[] a) {
//		int[] f=new int[2];
//		int c=0;
//		
//		for(int i=0; i<a.length; i++) {
//			int count=0;
//			for(int j=0; j<a.length; j++) {
//				if(a[i]==a[j])
//					count++;
//			}
//			if(count%2!=0) {
//				if(f[0]!=a[i]) {
//					f[c]=a[i];
//					c++;
//				}
//				
//			}
//			
//				
//		}
//		System.out.println(f[0]+" "+ f[1]);
		
		
		
//		int res=a[0];
//		for(int i=1; i<a.length; i++) {
//			res=res^(a[i]);
//			System.out.println(res);
//		}
//		return res;
//		
//	}
	
	static void twoOddOccuring(int[] n) {
		int res = n[0];
		for(int i=1; i<n.length; i++) {
			res=res^n[i];
		}
		System.out.println(res);
		
		int k = (res&(~(res-1)));
		int res1=0,res2=0;
		for(int i=0; i<n.length; i++) {
			if((k&n[i])==0)
				res1=res1^n[i];
			else
				res2=res2^n[i];
		}
		System.out.println(res1+" "+res2);
	}
	
	
	
	static boolean prime(int n) {
		
		if(n<=1)
			return false;
		if(n==2 || n==3)
			return true;
		if(n%2==0 || n%3==0)
			return true;
		for(int i=5; i*i<=n; i=i+6) {
			if((n%i==0 || n%(i+2)==0) )
				return false;
		}
		return true;
		
		
		
		
	}
	
	static void primeseries(int n) {
		boolean[] a= new boolean[n+1];
		Arrays.fill(a, true);
		
		for(int i=2; i*i<=n; i++) {
			if(prime(i)) {
				for(int j=i*i; j<=n; j=j+i) {
					a[j]=false;
				}
			}
				
		}
		for(int i=2; i<=n; i++) {
			if(a[i])
				System.out.print(i+", ");
		}
		
		
		
	}
	
	static void fun(int n) {
		if(n==0)
			return;
		System.out.print(n+" ");
		fun(n-1);
	}
	
	static void fun1(int n) {
		if(n==0)
			return;
		fun1(n-1);
		System.out.print(n+" ");
	}
	
	static int Jo(int n, int k) {
		ArrayList<Integer> a = new ArrayList<Integer>();
        int x=1;
        while(n>0){
            a.add(x);
            n--;
            x++;
        }
        int ind=0;
       while(n<k){
           for(int i=ind; i<a.size()+ind; i++){
               a.remove((k-1)/a.size());           }
           ind=k;
           n--;
       }
       return a.get(0);
	}
	
	
	
//	static int fibo(int n) {
//		if(n==0)
//			return 0;
//		if(n==1)
//			return 1;
//		return fibo(n-1)+fibo(n-2);	
//	}
	
	
//	static int sum(int n) {
//		if(n==0)
//			return 0;
//		return n+sum(n-1);
//	}
	
	static void palindrome(String s) {
		int l=s.length();
		String rev = "";
		while(l!=0) {
			rev=rev+s.substring(l-1, l);
			l-=1;
			}
		if(s.equals(rev))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
//		int l=s.length();
//		if(l==0||l==1)
//			return true;
//		if(s.substring(0, 1).equals(s.substring(l-1, l))&&(palindrome(s.substring(1, l-1))))
//			return true;
//		return false;
		
		
		}
	
	static int sumofdigits(int n) {
		if(n<9)
			return n;
		return ((n%10)+sumofdigits(n/10));
	}
	
	static int cutrope(int n, int a, int b, int c) {
		if(n==0) 
			return 0;
		if(n<0)
			return -1;
		
		int res = Math.max(Math.max(cutrope(n-a,a,b,c), cutrope(n-b,a,b,c)), cutrope(n-c,a,b,c));
		if(res==-1)
			return -1;
		return res+1;
	}
	
	static void subsets(String s, String cur, int i) {
		if(i==s.length()) {
			System.out.print(cur+" ");
			return;
		}
		subsets(s, cur, i+1);
		subsets(s, cur+s.charAt(i), i+1);
	}
	
	static void hanoi(int n, char A, char B, char C) {
		if(n==1) {
			System.out.println("move disc 1 from "+A+" to "+C);
			return;
		}
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(4);
		a.remove(0);
		hanoi(n-1, A, C, B);
		System.out.println("move disc "+n+" from "+A+" to "+C);
		hanoi(n-1, B, A, C);
		return;
	}
	
	public static void print(char a[], int n,
            int ind){

// print from ind-th index to
// (n+i)th index.
for (int i = ind; i < n + ind; i++)
System.out.print(a[(i % n)] + " ");
}
	
	public static int digitalRoot(int n)
    {
        int sum=0;
        if(n<=9) {
        	return n;
        }
        
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        
        return digitalRoot(sum);
    }
	
	
	
	
	
	public static void main(String[] args) {
		
//		set(16,5);
		//numofsets(8);
		//System.out.println(TF(6));
//		int[] a = {8,7,7,8,8,7,8,9,8,9};
//		twoOddOccuring(a);
		//eo(a);
		//System.out.println(eo(a));
//primeseries(23);
		//fun1(5);
		//System.out.println(sum(2));;
		//System.out.println(palindrome("racecara"));;
		//System.out.println(sumofdigits(235));
		//subsets("ABC", "", 0);
		//hanoi(3, 'A' , 'B', 'C');
		
System.out.println(digitalRoot(99999));
		


	}
	
	
	


}


