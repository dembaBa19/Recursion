package recursion;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many numbers?");
		Scanner reader = new Scanner(System.in);
		double numbers[] = new double[20];
		int br = reader.nextInt();
		System.out.println("Enter em all");
		for(int i=0; i<br; i++) {
			numbers[i] = reader.nextDouble();
		}
		System.out.println(" The average is " + average(numbers, br));
	}
	
	public static double average(double[] arr, int br) {
		return sum(arr, br, 0)/br;
	}
	
	public static double sum(double[] arr, int br, double res) {
		if(br==0) return res;
		return sum(arr, br-1, res + arr[br-1]);
	}

	
}
