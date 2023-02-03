package randomProblems;

import java.util.Arrays;

public class AllSolutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {1,2,3,4,5,7,8,9,10,11};
		int key = 10;
		int l=0;
		int h=b.length-1;
		
		boolean flag=false;
		while(l<=h) {
			int m = (l+h)/2;
			if(key==b[m]) {
				flag = true;
				break;
			}
			else if (key<b[m])
				h=m-1;
			else if (key>b[m])
				l=m+1;
		}
		
		if(flag)
			System.out.println("elememt found");
		else
			System.out.println("element not found");
		
		
		
		
		for(int i=0; i<b.length-1; i++) {
			for(int j=0; j<b.length-1; j++) {
				if(b[j]<b[j+1]) {
					int temp = b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(b));

	}
	
	
	

}
