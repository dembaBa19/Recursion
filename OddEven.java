package recursion;

import java.util.Scanner;

public class OddEven {
	
//	import java.util.Scanner;

	public static boolean even(int number) {
		if(number==0) return true;
		return odd(number-1);
	}
	
	public static boolean odd(int number) {
		if(number==0) return false;
		return even(number-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number : ");
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		if(even(number)) {
			System.out.println(number + " is an even number");
		} else {
			System.out.println(number + " is an odd number");
		}
	}

}
