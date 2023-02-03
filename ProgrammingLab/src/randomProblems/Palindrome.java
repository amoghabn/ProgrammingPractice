package randomProblems;

public class Palindrome {
	public static void main(String[] args) {
		String a= "madam";
		String aReverse ="";
		for(int i=0; i<a.length(); i++) {
			aReverse=a.charAt(i)+aReverse;
		}
		//if (a.equals(aReverse)) can also be used
		if (a.compareTo(aReverse)==0) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
		
		
		// Palindrome Number problem by using a seperate class
		PalindromeNumber z = new PalindromeNumber();
		z.palindromeNum(1325231);
	}
}

class PalindromeNumber {
	public boolean palindromeNum(int s) {
		int rev=0;
		int f = s;
		while(s>0) {
			rev=rev*10 + s%10;
			s=s/10;
		}
		if(f==rev)
		{
			System.out.println(f + " is palindrome number");
			return true;
		}
		System.out.println(f + " is not a palindrome number");
		return false;
	}
}