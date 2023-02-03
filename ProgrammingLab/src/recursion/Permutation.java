package recursion;

public class Permutation {
	
	
	static String swap(String s, int i, int j) {
		char[] ch = s.toCharArray();
		char temp = ch[j];
		ch[j]=ch[i];
		ch[i]=temp;
		return String.valueOf(ch);
		
		
	}

	static void stringPermutation(String s, int i) {
		if(i==s.length()-1) {
			System.out.println(s);
			return;
		}
		
		for(int j=i; j<s.length(); j++) {
			s = swap(s, i, j);
			stringPermutation(s,i+1);
			s= swap(s, i, j);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		stringPermutation("ABC", 0);
		//System.out.println(swap("ABC",0,1));

	}

}
