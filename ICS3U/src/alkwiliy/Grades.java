package alkwiliy;

/**
 * Grades.java
 * This program displays the grade assigned to the number inputed by the user.                                                                                                                                                                
 * Faisal Al-kwiliy
 * Wednesday, March 30, 2016
 **/

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		/**
		 * This is where the Grades program starts.
		 * @param args
		 */

		Scanner scan = new Scanner(System.in);

		//*** input
		System.out.println("Please enter the number of grades you will enter.");
		int t = Integer.parseInt(scan.nextLine());
		

		
		for (int i=0; i<t; i++){
			
			//*** input
			System.out.println("Please enter the grades.");
			int grades = Integer.parseInt(scan.nextLine());
			
			//*** output
			if (0 <= grades && grades <= 49){

				System.out.println("F");
			}
			else if (50 <= grades && grades <= 59){
				System.out.println("D");
			}
			else if (60 <= grades && grades <= 69){
				System.out.println("C");
			}
			else if (70 <= grades && grades <= 79){
				System.out.println("B");
			}
			else if (80 <= grades && grades <= 100){
				System.out.println("A");
			}
			else {
				System.out.println("X");
			}

		}

		System.out.println("Done");

	}

}

