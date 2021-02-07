package recursion;

import java.util.Scanner;

public class ReverseNumber {
	
//	import java.util.Scanner;

	public static void reverseNumberI(int n) {
		while(n>0) {
			System.out.print(n%10);
			n/=10;
		}
	}
	
	public static void reverseNumberR(int n) {
		if (n > 0) {
			System.out.print(n % 10);
	   		reverseNumberR(n / 10);
	   	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number : ");
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		System.out.println("Reversed number is ");
		reverseNumberI(number);
		System.out.println(" - itterative");
		reverseNumberR(number);
		System.out.println(" - recursive ");
		
	}

}
