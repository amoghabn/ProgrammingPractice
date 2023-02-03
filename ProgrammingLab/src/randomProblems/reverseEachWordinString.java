package randomProblems;

public class reverseEachWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to Arizona";
		String[] a = s.split(" ");
		String k="";
		for(int i=0; i<a.length; i++) {
			String l = "";
			for(int j=0; j<a[i].length(); j++) {
				l=a[i].charAt(j)+l;
			}
			k=k+l+" ";
		}
		System.out.println(k);
	}
}
