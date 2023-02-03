package randomProblems;

public class SubsetSumProblem {
	
	static int sum(int[] a) {
		return 0;
	}
	
	static int subset(int[] b, int m, int sum) {
		if(m==0) {
			if(sum==0)
				return 1;
			return 0;
		}
		return subset(b, m-1, sum)+subset(b, m-1, sum-b[m-1]);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,15,5};
		int k = subset(a,4,25);
		System.out.println(k);

	}

}
