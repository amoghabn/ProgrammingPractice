package arrays;

public class Stocks {
	
	static int maxProfit(int[] a, int start, int end) {
		if(end<=start)
			return 0;
		int profit=0;
		for(int i=start; i<end; i++) {
			for(int j=i+1; j<=end; j++) {
				if(a[j]>a[i]) {
					int curprofit=a[j]-a[i] + maxProfit(a, start, i-1) + maxProfit(a, j+1, end);
					profit=Math.max(profit,curprofit);
				}
			}
		}
		return profit;
		
	}
	

	public static void main(String[] args) {
		int[] b = {1,5,3,8,12};
		System.out.println(maxProfit(b,0,b.length-1));
		

	}

}
