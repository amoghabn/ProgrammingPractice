package arrays;

public class MaxConsecutiveOnes {
	
	static int maxones(int[] a) {
		int count=0, max=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				//max=Math.max(max, count);
				count=0;
				//continue;
			}
			else {
				count++;
				max=Math.max(max, count);
			}
			
		}
		max=Math.max(max, count);
		return max;
	}

	public static void main(String[] args) {
		int[] b = {0,1,1,0,1,1,1};
		System.out.println(maxones(b));

	}

}
