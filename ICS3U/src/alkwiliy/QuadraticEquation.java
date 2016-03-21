package alkwiliy;
/**
 * QuadraticEquation.java
 * The program displays the two x values in a quadratic equation using the quadratic formula.                                                                                                                                                                     
 * Faisal Al-kwiliy
 * Monday, March 21, 2016
 **/

import java.util.Scanner;
import java.text.DecimalFormat;

public class QuadraticEquation {
	/**
	 * This is where the quadratic equation program starts.
	 * @param args
	 */
	public static void main(String[] args){
		Scanner myInput = new Scanner(System.in);

		//*** variables
		int a;
		int b;
		int c;
		double x1;
		double x2;
		
		DecimalFormat df = new DecimalFormat ("0.00");

		//*** input
		System.out.println("ax2+bx+c=0");
		System.out.println("Please enter the a value");
		a = Integer.parseInt(myInput.nextLine());
		System.out.println("Please enter the b value");
		b = Integer.parseInt(myInput.nextLine());
		System.out.println("Please enter the c value");
		c = Integer.parseInt(myInput.nextLine());

		//*** processing
		x1 = (-b + (Math.sqrt(Math.pow(b,2)- 4 * a * c)))/(2*a);
		x2 = (-b - (Math.sqrt(Math.pow(b,2)- 4 * a * c)))/(2*a);

		//*** output
		if ((Math.pow(b,2)- 4 * a * c<0)){
			System.out.println("There are zero possible roots");
		} else if ((Math.pow(b,2)- 4 * a * c>0)){
			System.out.println("Theare are two roots, and they are: " + df.format (x1) + " and " + df.format (x2));
		} else {
			System.out.println("There is only 1 root, and it is: " +  df.format (x1));
		}
	}



}


