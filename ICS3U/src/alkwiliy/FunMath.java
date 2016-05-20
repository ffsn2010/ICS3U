/**
 * FunMath.java
 * This program uses 5 methods including the main method that adds, subtracts, multiplies, and divides two numbers entered by the user.
 * Faisal Al-kwiliy
 * Friday, May 20th, 2016
 */
package alkwiliy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FunMath {

	/**
	 * This method is the main method that displays two numbers that are added, subtracted, divided, and multiplied.
	 * @param args
	 */
	
	// Decimal format
			static DecimalFormat df = new DecimalFormat ("0.00");
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		// Variables
		int getNum1;
		int getNum2;
		
		// Input
		System.out.println("Please enter two whole numbers");
		try{
		getNum1 = Integer.parseInt(scan.nextLine());
		getNum2 = Integer.parseInt(scan.nextLine());
		
		// 4 Methods
		Add(getNum1, getNum2);
		Subtract(getNum1, getNum2);
		Multiply(getNum1, getNum2);
		Divide(getNum1, getNum2);
		}catch(Exception e){
			System.out.println("Error Occured " + e.getMessage());
			}
	}
	
	/**
	 * This method is the main method that adds the two numbers
	 * @param args
	 */
	// Add both numbers
	private static void Add(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));

	}
	
	/**
	 * This method is the main method that subtracts the two numbers
	 * @param args
	 */
	// Subtract number 2 from number 1
	private static void Subtract(int num1, int num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));

	}
	
	/**
	 * This method is the main method that multiplies the two numbers
	 * @param args
	 */
	// Multiplies both numbers
	private static void Multiply(int num1, int num2) {
		System.out.println(num1 + " x " + num2 + " = "  + (num1*num2));

	}
	
	/**
	 * This method is the main method that divides the two numbers
	 * @param args
	 */
	// Divides number 2 from number 1
	private static void Divide(int num1, int num2) {
		System.out.println(num1 + " / " + num2 + " = "  + (df.format((double)num1/num2)));	

	}
}

