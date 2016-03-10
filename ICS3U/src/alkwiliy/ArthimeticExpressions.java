package alkwiliy;

/**
 * ArithmeticExpressions.java
 * The program displays the different outputs of arithmetic expressions.                                                                                                                                                                     
 * Faisal Al-kwiliy
 * Wednesday, March 9, 2016
 **/
import java.util.Scanner;

public class ArthimeticExpressions {
	/**
	 * The main method, and this is where the program starts. 
	 * @param args
	 */
	public static void main(String[] args){
		Scanner myInput = new Scanner(System.in);
		
		//*** variables
		int Num1;
		int Num2;
		int Num3;
		int Num4;
		int Num5;
		int Val1;
		int Val2;
		int Val3;
		double Val4;
		int Val5;
		double Val6;
		double Val7;
		
		//*** input
		System.out.println("Please enter the first number");
		Num1 = Integer.parseInt(myInput.nextLine());
		System.out.println("Please enter the second number");
		Num2 = Integer.parseInt(myInput.nextLine());
		System.out.println("Please enter the third number");
		Num3 = Integer.parseInt(myInput.nextLine());
		System.out.println("Please enter the fourth number");
		Num4 = Integer.parseInt(myInput.nextLine());
		System.out.println("Please enter the fifth number");
		Num5 = Integer.parseInt(myInput.nextLine());
		
		//*** processing		
		Val1 = Num1 + Num2+Num3+Num4+Num5;
		Val2 = Num3 - Num2;
		Val3 = Num1 * Num5;
		Val4 = (double)Num4 / Num2; 
		Val5 = Num4 % Num2;
		Val6 = Math.pow(Num1, Num3);
		Val7 = Math.sqrt(Num5);
		 
		//*** output	
		System.out.println("Sum of all five numbers: " + Val1);
		System.out.println("Result after subtracting second number from the third: " + Val2);
		System.out.println("Product of first and fifth numbers: " + Val3);
		System.out.println("Quotient of the fourth number divided by the second: " + Val4);
		System.out.println("Remainer of the fourth number divided by the second: " + Val5);
		System.out.println("The first number raised to the power of the third number: " + Val6);
		System.out.println("Square root of the fifth number: " + Val7);
		

	}
}
