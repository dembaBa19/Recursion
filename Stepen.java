package recursion;

import java.util.Scanner;

public class Stepen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 numbers: ");
		Scanner reader = new Scanner(System.in);
		int n1 = reader.nextInt();
		int n2 = reader.nextInt();
		System.out.println(n1 + "^" + n2 + " = " + powRecursive(n1,n2,1));
	}
	
	public static int powRecursive( int x, int n, int res ) {
		if (n == 0) {
			return res;
		}
		
		return powRecursive(x, n - 1, res*x );
	}

	
}
