package recursion;

import java.util.Scanner;

public class Foo {
	
	public static int foo (int x, int y) {
		if (y == 0)
			return x;
		else
	   		return foo(y, x % y);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 numbers: ");
		Scanner reader = new Scanner(System.in);
		int n1 = reader.nextInt();
		int n2 = reader.nextInt();
		System.out.println("GCF is " + foo(n1,n2));
	}

}
