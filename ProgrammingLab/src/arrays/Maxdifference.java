package arrays;

public class Maxdifference {
	
	static void maxdif(int[] a) {
		int max = a[a.length-1]-a[a.length-2];
		
		for(int i=a.length-1; i>0; i--) {
			for(int j=i-1; j>=0; j--) {
				if((a[i]-a[j])>max) {
					max=(a[i]-a[j]);
				}
					
			}
		}
		System.out.println(max);
	}
	

	public static void main(String[] args) {
		int[] b = {30,10,8,2};
		maxdif(b);

	}

}
