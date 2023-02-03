package arrays;

public class Frequency {
	
	static void fre(int[] b) {
		int count=0;
		for(int i=0; i<b.length; i++) {
			count=0;
			for(int j=0; j<b.length; j++) {
				if(b[i]==b[j]) {
					count++;
				}
			}
			System.out.println(b[i]+" "+count);
			i=i+count-1;
		}
	}

	public static void main(String[] args) {
		int[] b = {30,10,10,8,8,8,9,9,30,2,2,2,};
		fre(b);

	}

}
