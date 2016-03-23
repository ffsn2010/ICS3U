package alkwiliy;
/**
 * IfProgram.java
 * The program displays 4 different outputs for different integers inputed.                                                                                                                                                                     
 * Faisal Al-kwiliy
 *Tuesday, March 22, 2016
 **/
import java.util.Scanner;

public class IfProgram {

	/**
	 * This is where the IF program starts.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//*** variables
		int integer;
		int Remainder;

		//*** input
		System.out.println("What is your integer?");
		integer = Integer.parseInt(scan.nextLine());

		Remainder = integer % 7;

		//*** output
		if (integer > 0 && Remainder == 0){
			System.out.println("Your integer is positive and is divisible by 7");
		}
		else if (integer > 0 && Remainder != 0){
			System.out.println("Your integer is positive and is not divisible by 7");
		}
		else if (integer < 0 && Remainder == 0){
			System.out.println("Your integer is negative and is  divisible by 7");
		}
		else {
			System.out.println("Your integer is negative and is not divisible by 7");
		}


	}

}
