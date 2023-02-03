package greedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class IntervalPartitioning {

	public static void main(String[] args) {
		Activiti b = new Activiti(12,25);
		Activiti c = new Activiti(10,20);
		Activiti d = new Activiti(20,30);
		Activiti e = new Activiti(15,22);
		Activiti f = new Activiti(35,40);
		Activiti[] a = {b,c,d,e,f};
		System.out.println(maxClassrooms(a));	

	}
	
	static int maxClassrooms(Activiti[] arr) {
		int res=0;
		MyCompare mc = new MyCompare();
		Arrays.sort(arr, mc);
		
		
		return res;
	}

}


class MyCompare implements Comparator<Activiti>{

	public int compare(Activiti a1, Activiti a2) {
		return a1.start-a2.start;
	}
	
}