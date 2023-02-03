package greedyAlgorithms;

import java.util.Arrays;

public class MinCoins {

	public static void main(String[] args) {
		int[] l= {10,5,2,1};
		System.out.println(minimumCoins(l,4,59));
	}
	
	public static int minimumCoins(int[] a, int n, int amount) {
		int res=0;
		int k=0;
		Arrays.sort(a);
		for(int i=a.length-1; i>=0; i--) {
			if(amount>=a[i]) {
				k = amount/a[i];
				amount=amount-(k*a[i]);
				res=res+k;
			}
			if(amount==0)
				break;
		}
		return res;
	}

}
