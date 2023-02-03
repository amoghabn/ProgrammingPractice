package arrays;

public class LargestElement {
	
	
	static int Le(int[] a) {
		int l;
		if (a.length!=0) {
			l=a[0];
		}
		else {
			System.out.println("Array is empty, you will see -1 as answer");
			return -1;
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>l)
				l=a[i];
		}
		return l;
	}
	
	static int Sle(int[] a) {
		int l, sl;
		if (a.length!=0) {
			l=a[0];
			sl=a[0];
		}
		else {
			System.out.println("Array is empty, you will see -1 as answer");
			return -1;
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]>l) {
				sl=l;
				l=a[i];
			}
			else if(a[i]>sl && a[i]<l)
				sl=a[i];
		}
		if(sl==l)
			sl=-1;
		return sl;
	}
	

	public static void main(String[] args) {
		int[] b = {5,20,12,20,8,13};
		int[] c = {10,10};
		System.out.println(Sle(c)+" "+Le(c));

	}

}
