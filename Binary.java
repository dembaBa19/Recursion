package recursion;

import java.util.Scanner;

public class Binary {
	
//	import java.util.Scanner;

	public static String dec2Bin(int value) {
		if(value==0) {
			return "";
		} else {
			String result = value%2 + "";
			return dec2Bin(value/2) + result;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number : ");
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		System.out.println("The binary of the number " + number + " is " + dec2Bin(number));
	}

}
