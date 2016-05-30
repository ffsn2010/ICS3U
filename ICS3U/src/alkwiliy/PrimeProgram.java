/**
 * PrimeProgram.java
 * This program uses 2 methods and a main method that checks if a number is a prime number or not.
 * Faisal Al-kwiliy
 * Monday, May 30th, 2016
 */
package alkwiliy;

import java.util.Scanner;

public class PrimeProgram {


	/**
	 * This method is the main method that displays whether a number is prime or not.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner scan =  new Scanner (System.in);

		// Variables
		int x;


		// Input
		System.out.println("Please enter a number");

		x = Integer.parseInt(scan.nextLine());

		// Processing
		if (isPrime(x))
			System.out.println(x + " is a prime number");
		else
			System.out.println(x + " is not a prime number");

	}


	/**
	 * This method is the isPrime method that checks if variable x is prime or not
	 * @param x number thats checked to be prime
	 * @return true if its prime, false if its not prime
	 */

	private static boolean isPrime(int x) {
		for (int i = 2; i < x; i++){
			if (isDivisible(x, i))
				return false;

		}
		return true;	

	}

	/**
	 * This method is the isDivisible method that checks if variable x modulus y equals 0 or not
	 * @param x
	 * @param y
	 * @return true if x modulus y is 0 and false if x modulus y is not 0
	 */
	private static boolean isDivisible(int x, int y) {
		if (x % y == 0)
			return true;
		else
			return false;
	}

}
