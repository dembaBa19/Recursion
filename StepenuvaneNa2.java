package recursion;

import java.util.Scanner;

public class StepenuvaneNa2 {
	
//	import java.util.Scanner;

	public static int stepenuvaneI(int osnova, int stepen) {
		int izhod=1;
		while(stepen>0) {
			izhod*=osnova;
			stepen--;
		}
		return izhod;
	}
	
	public static int stepenuvaneR(int osnova, int stepen) {
		if (stepen > 0) {
			return(osnova*stepenuvaneR(osnova,stepen-1));
	   	} else {
	   		return 1;
	   	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number : ");
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		System.out.print("Result is " +  stepenuvaneI(2,number));
		System.out.println(" - itterative");
		System.out.print("Result is " +  stepenuvaneR(2,number));
		System.out.println(" - recursive ");
		
	}

}
