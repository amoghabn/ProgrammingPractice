package arrays;

public class removeDuplicates {
	
	static void removeDuplicates(int[] a) {
		int res=1;
		
		for(int i=1; i<a.length; i++) {
			if(a[i]!=a[res-1]) {
				a[res]=a[i];
				res++;
			}
		}
	
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println(res);
	}
	
	
	static void movezeros(int[] a) {
		int res=1;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]!=a[res-1]) {
				a[res]=a[i];
				res++;
			}
		}
	
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println(res);
	}

	

	public static void main(String[] args) {
		int[] b = {5,6,20,20,20,30,40,50,50};
		removeDuplicates(b);
	}

}
