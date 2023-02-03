package randomProblems;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70,80,90,100};
		int key = 85;
		int l=0;
		int h=a.length-1;
		boolean flag=false;
		while(l<=h) {
			int mid=(l+h)/2;
			if(key==a[mid]) {
				flag = true;
				break;
			}
			else if(key>a[mid])
				l=mid+1;
			else if(key<a[mid])
				h=mid-1;
		}
		if(flag==true)
			System.out.println("Element Found");
		else
			System.out.println("Element Not Found");
	}

}
