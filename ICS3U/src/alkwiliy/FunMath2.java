/**
 * FunMath2.java
 * This program uses 5 methods including the main method that adds, subtracts, multiplies, and divides two numbers entered by the user.
 * Faisal Al-kwiliy
 * Tuesday, May 24th, 2016
 */
package alkwiliy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FunMath2 {

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
		System.out.println(getNum1 + " + " + getNum2 + " = " + add(getNum1, getNum2));
		System.out.println(getNum1 + " - " + getNum2 + " = " +subtract(getNum1, getNum2));
		System.out.println(getNum1 + " x " + getNum2 + " = " +multiply(getNum1, getNum2));
		System.out.println(getNum1 + " / " + getNum2 + " = " +divide(getNum1, getNum2));
		}catch(Exception e){
			System.out.println("Error Occured " + e.getMessage());
			}
	}
	
	/**
	 * This method is the main method that adds the two numbers
	 * @param args
	 * @return 
	 */
	// Add both numbers
	private static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;

	}
	
	/**
	 * This method is the main method that subtracts the two numbers
	 * @param args
	 * @return 
	 */
	// Subtract number 2 from number 1
	private static int subtract(int num1, int num2) {
		int difference = num1 - num2;
		return difference;

	}
	
	/**
	 * This method is the main method that multiplies the two numbers
	 * @param args
	 * @return 
	 */
	// Multiplies both numbers
	private static int multiply(int num1, int num2) {
		int product = num1 * num2;
		return product;
	}
	
	/**
	 * This method is the main method that divides the two numbers
	 * @param args
	 * @return 
	 */
	// Divides number 2 from number 1
	private static String divide(int num1, int num2) {
		String quotient = df.format((double)num1/num2);	
		return quotient;

	}
}

