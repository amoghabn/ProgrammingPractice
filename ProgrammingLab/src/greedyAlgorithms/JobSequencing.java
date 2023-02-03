package greedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {

	public static void main(String[] args) {
		Jobs b = new Jobs(1,2,100);
		Jobs c = new Jobs(2,1,19);
		Jobs d = new Jobs(3,2,27);
		Jobs e = new Jobs(4,1,25);
		Jobs f = new Jobs(5,1,15);
		Jobs[] a = {b,c,d,e,f};
		maxProfit(a, 4);
	}
	
	static void maxProfit(Jobs[] a, int n) {
		int totalProfit=0;
		int numberOfJobs=0;
		MyComp mc = new MyComp();
		
//		for(int i=0; i<a.length; i++) {
//		System.out.print(a[i].profit+" ");
//		}
//		System.out.println();
		
		Arrays.sort(a, mc);
		Jobs[] ans = new  Jobs[n];
		boolean[] slots = new boolean[n];
		for(int i=0; i<n; i++) {
			slots[i]=false;
		}
		
		
//		for(int i=0; i<a.length; i++) {
//		System.out.print(a[i].profit+" ");
//		}
//		System.out.println();
		
		for(int i=0; i<n; i++) {
			for(int j=Math.min(n, a[i].deadline)-1; j>=0; j--) {
				if(slots[j]==false) {
					ans[j]=a[i];
					slots[j]=true;
					numberOfJobs++;
					totalProfit+=a[i].profit;
					break;
				}
			}
		}
		System.out.println("profit = "+totalProfit);
		System.out.println("Number of jobs done = "+ numberOfJobs);
	}
}



class Jobs {
    int id, profit, deadline;
    Jobs(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class MyComp implements Comparator<Jobs>{
	public int compare(Jobs a1, Jobs a2) {
		return a2.profit-a1.profit;
	}
}
