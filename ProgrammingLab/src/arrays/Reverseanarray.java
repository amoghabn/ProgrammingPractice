package arrays;

public class Reverseanarray {

	static int[] rev(int[] a) {
//		int[] b = new int[a.length];
//		for(int i=(a.length-1),j=0;  j<(a.length) & i>=0; i--,j++) {
//			b[j]=a[i];
//		}
//		return b;
		
		int i=0, j=a.length-1;
		while(j>i) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		
		return a;
		
		
	}
	
	public static void main(String[] args) {
		int[] c = {1,2,3,4,5,6};
		c=rev(c);
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}

	}

}
