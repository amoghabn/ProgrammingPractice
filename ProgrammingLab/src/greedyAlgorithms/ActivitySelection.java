package greedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

	public static void main(String[] args) {
		Activiti b = new Activiti(12,25);
		Activiti c = new Activiti(10,20);
		Activiti d = new Activiti(20,30);
		Activiti e = new Activiti(15,22);
		Activiti f = new Activiti(35,40);
		Activiti[] a = {b,c,d,e,f};
		System.out.println(maxActivity(a));	
	}
	
	static int maxActivity(Activiti[] arr) {
		Mcomp mc = new Mcomp();
		Arrays.sort(arr, mc);
		int res = 1;
		int prev = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i].start>=arr[prev].finish) {
				res++;
				prev = i;
			}
		}
		return res;
	}
}

class Activiti {
	int start;
	int finish;
	Activiti(int s, int f){
		start = s;
		finish =f;
	}
}

class Mcomp implements Comparator<Activiti>
{
	public int compare(Activiti a1, Activiti a2) {
		return a1.finish -a2.finish;
	}
}
