/**
 * GuessingGame.java
 * This program stimulates computer guesses at random with the user telling the computer if it is right or wrong.
 * Faisal Al-kwiliy
 *Thursday, March 28, 2016
 **/
package alkwiliy;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		/**
		 * This is where the Guessing Game program starts.
		 * @param args
		 */
		Scanner scan = new Scanner (System.in);

		// Arrays
		String[] animals = {"Lion", "Tiger", "Gorilla", "Cheetah", "Zebra", "Monkey", "Deer", "Squirrel", "Mouse", "Alligator", "Donkey", "Dog", "Horse", "Bear", "Wolf", "Giraffe", "Ostrich", "Rhino", "Cat", "Owl"};
		boolean[] animal = new boolean [20];
		// Variables
		String yesNo;

		int i=0;

		// input
		System.out.println("You want to play a guessing game? Think of an animal (Y/N)");
		yesNo = scan.nextLine();

		// output
		if (yesNo.equalsIgnoreCase("Y")){
			do{

				int computerGuess = (int)(Math.random()*animals.length);
				if (!animal[computerGuess]){
					animal[computerGuess]=true;
					System.out.println("Is it a " +animals[computerGuess]+ " ? (Y/N)");
					yesNo = scan.nextLine();
					i++;

					if (yesNo.equalsIgnoreCase("Y"))
					{
						System.out.println("I win in " + i + " guesses!");

					}
					else if (animals.length==i)
						System.out.println("You ran out of your 20 guesses.");
					{
						animal[computerGuess]=true;
					}
				}

			} while(yesNo.equalsIgnoreCase("N"));


		}


	}
}



