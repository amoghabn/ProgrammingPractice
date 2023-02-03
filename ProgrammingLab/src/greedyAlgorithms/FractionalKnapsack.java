package greedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

	public static void main(String[] args) {
		Activity b = new Activity(50,600);
		Activity c = new Activity(20,500);
		Activity d = new Activity(30,400);
		Activity[] a = {b,c,d};
		System.out.println(knapSack(a,70));
	}
	static int knapSack(Activity[] a, int cap) {
		int res = 0;
		MyCmp mc = new MyCmp();
//		for(int i=0; i<a.length; i++) {
//			System.out.print(a[i].weight+" ");
//		}
//		System.out.println();
		Arrays.sort(a, mc);
//		for(int i=0; i<a.length; i++) {
//			System.out.print(a[i].weight+" ");
//		}
//		System.out.println();
		for(int i=0; i<a.length; i++) {
			if(cap>=a[i].weight) {
				res+=a[i].value;
				//System.out.println(res);
				cap-=a[i].weight;
			}
			else {
				res+=(cap*a[i].value/a[i].weight);
				break;
			}
			if(cap==0)
				break;
		}
		return res;
	}
}

class Activity{
	int weight;
	int value;
	Activity(int w, int v){
		weight = w;
		value = v;
	}
}

class MyCmp implements Comparator<Activity> {
	public int compare(Activity a1, Activity a2) {
//		return (a1.value / a1.weight)-(a2.value/a2.weight);
		//the above for sorting in ascending order
		return (a2.value / a2.weight)-(a1.value/a1.weight);
		//the above for sorting in descending order
	}
}
