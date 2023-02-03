package arrays;

public class MaxSumArray {
	
	static int maxsum(int[] a) {
//		int max=a[0];
//		int sum;
//		for(int i=0; i<a.length; i++) {
//			sum=0;
//			for(int j=i; j<a.length; j++) {
//				sum=sum+a[j];
//				max=Math.max(max, sum);
//			}
//		}
//		return max;
		
		//O(nsquare) above ||  O(n) solution below
		int max=a[0];
		int maxending =a[0];
		for(int i=0; i<a.length; i++) {
			maxending = Math.max(maxending+a[i], a[i]);
			max=Math.max(maxending, max);
		}
		return max;
		
		
	}
	

	public static void main(String[] args) {
		int[] b = {2,3,-8,7,-1,2,3};
		System.out.println(maxsum(b));

	}

}
