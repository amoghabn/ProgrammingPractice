package randomProblems;

import java.util.Arrays;

public class ArrayManipulations {

	public static void main(String[] args) {
		Arrayy a = new Arrayy();
		int[] b = {7,2,4,1,5,8,6};
		int largestofArray = a.largest(b);
		System.out.println(largestofArray);
		System.out.println(a.smallest(b));
		System.out.println(a.sum(b));
		System.out.println(Arrays.toString(b));
		a.remove(b, 3);
		
		System.out.println(Arrays.toString(b));
	}

}

class Arrayy{
	
	
	
	public static int largest(int[] a) {
		int l = a[0];
		for(int i:a) {
			if(i>l)
				l=i;
		}
		return l;
	}
	
	public static int smallest(int[] a) {
		int l = a[0];
		for(int i:a) {
			if(i<l)
				l=i;
		}
		return l;
	}
	
	public static int sum(int[] a) {
		int s = 0;
		for(int i:a) {
			s+=i;
		}
		return s;
	}
//	public  int[] remove(int[] a, int i) {
//		if(i>=a.length || i<0 || a==null)
//		{
//			return a;
//		}
//		int[] b= new int[a.length-1];
//		for(int j=0, k=0; j<b.length; j++) {
//			if(j==i) {
//				
//				continue;
//			}
//				
//			else {
//				b[k]=a[j];
//				k++;
//			}
//		}
//		return b;
//		
//		
//	}
	
	public void  remove(int[] a, int i) {
		if(i>=a.length || i<0 || a==null)
		{
			a=a;
		}
		int[] b= new int[a.length-1];
		for(int j=0, k=0; j<b.length; j++) {
			if(j==i) {
				
				continue;
			}
				
			else {
				b[k]=a[j];
				k++;
			}
		}
		a=b;
		
		
	}
	
}
