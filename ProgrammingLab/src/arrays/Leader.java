package arrays;

public class Leader {
	
	static void leader(int[] a) {
		boolean flag=true;
		for(int i=0; i<a.length; i++) {
			flag=true;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]>=a[i])
					flag=false;
			}
			if(flag)
				System.out.print(a[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		int[] b = {7,10,4,10,6,5,2};
		leader(b);

	}

}
