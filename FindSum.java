package recursion;

import java.util.Scanner;

public class FindSum {
	
//	import java.util.Scanner;

	public static int sumI(int n) {
	  	 int i=1;
	  	 int finalSum=0;
	  	 while(i<=n) {
	  		 finalSum+=i;
	  		 i++;
	  	 }
	  	 return finalSum;
	}
	
	public static int sumR(int n) {
	  	 if (n == 1)
	  		 return 1;
	  	 else
	  		 return n + sumR(n - 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number : ");
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		System.out.println("Sum is " + sumI(number) + " - itterative");
		System.out.println("Sum is " + sumR(number) + " - recursive");
		
	}

}
