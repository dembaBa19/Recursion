package recursion;

import java.util.Scanner;

public class StepenuvaneNaX {
	
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
		
		System.out.println("Enter a base and a power : ");
		Scanner reader = new Scanner(System.in);
		int base = reader.nextInt();
		int power = reader.nextInt();
		System.out.print("Result is " +  stepenuvaneI(base,power));
		System.out.println(" - itterative");
		System.out.print("Result is " +  stepenuvaneR(base,power));
		System.out.println(" - recursive ");
		
	}

}
