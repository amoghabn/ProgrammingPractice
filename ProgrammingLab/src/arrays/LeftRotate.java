package arrays;

public class LeftRotate {

	static void leftRotate(int[] a, int n) {
		int temp=0;
		while(n!=0) {
			temp = a[0];
			for(int i=0; i<a.length-1; i++) {
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
			n--;
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	
	static void leftRotateO(int[] a, int n) {
		int[] b=new int[a.length];
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
			
		for(int i=n; i<a.length; i++) {
			a[i-n]=b[i];
		}
		for(int i=(a.length-n), j=0; i<a.length & j<n; i++,j++) {
			a[i]=b[j];
		}		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}
	
	
	
	public static void main(String[] args) {
		int[] b = {1,2,3,4,5,6,7,8};
		leftRotateO(b,3);
	}

}
