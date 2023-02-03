package randomProblems;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int storenum = num;
		sc.close();
		int reverse =0;
		int count=0;
		while(num!=0) {
			reverse = reverse*10 + num%10;
			num=num/10;
			count++;
		}
		if (storenum==0)
			count=1;
			
		System.out.println("Reverse of Number "+storenum+ " is "+reverse);
		System.out.println("Number of digits is "+count);
		

	}

}
