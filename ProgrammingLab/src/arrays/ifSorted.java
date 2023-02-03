package arrays;

public class ifSorted {
	
	static void ifsorted(int[] a) {
		for(int i=1; i<a.length; i++) {
			if( a[i]<a[i-1]) {
				System.out.println("not sorted");
				return;
			}
				
		}
		System.out.println("sorted");
	}

	public static void main(String[] args) {
		int[] b = {100};
		ifsorted(b);
	}

}
