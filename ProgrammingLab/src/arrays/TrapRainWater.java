package arrays;

public class TrapRainWater {
	
	static int trap(int[] a) {
		int lmax=0;
		int rmax=0;
		int k= 0;
		int res=0;
		for(int i=1; i<a.length-1; i++) {
			lmax=a[i];
			for(int j=0; j<i; j++) {
				lmax=Math.max(a[j],lmax);
			}
			rmax=a[i];
			for(int j=i+1; j<a.length; j++) {
				rmax=Math.max(rmax, a[j	]);
			}
			k= Math.min(rmax, lmax);
			if(a[i]<k) {
				res=res+(k-a[i]);
			}
			
		}
		return res;
	}

	public static void main(String[] args) {
		int[] b = {1,2,3,4,5,6,7,6,9};
		System.out.println(trap(b));

	}

}
