package randomProblems;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		int[] a = {4,10,3,5,2};
		int l = a.length;
		System.out.println("Before sorting" + Arrays.toString(a));
		for(int i=0; i<l-1; i++) {
			for(int j=0; j<l-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	
		System.out.println("After sorting" + Arrays.toString(a));
	}

}

