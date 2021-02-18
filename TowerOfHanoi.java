package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	static int moves=0;
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		// Find the solution recursively
		System.out.println("The moves are:");
		moveDisks(n, 'A', 'C', 'B');
		System.out.println("There were " + moves + " moves.");		
	}

	/**
	 * The method for finding the solution to move n disks from fromTower to toTower
	 * with auxTower
	 */
	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		if (n == 1) { // Stopping condition
			moves++;
			System.out.println("Move disk " + n + " from "+ fromTower + " to " + toTower);
		} else {
			moveDisks(n - 1, fromTower, auxTower, toTower);
			moves++;
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}
}
