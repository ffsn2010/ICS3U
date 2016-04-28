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

		Scanner scan = new Scanner (System.in);

		// Arrays
		String[] animals = {"Lion", "Tiger", "Gorilla", "Cheetah", "Zebra", "Monkey", "Deer", "Squirrel", "Mouse", "Alligator", "Donkey", "Dog", "Horse", "Bear", "Wolf", "Giraffe", "Ostrich", "Rhino", "Cat", "Owl"};
		boolean[] animal = new boolean [20];
		// Variables
		String yesNo;
		int counter = 0;
		
		// input
		System.out.println("You want to play a guessing game? Think of an animal (Y/N)");
		yesNo = scan.nextLine();
		
		// output
		while(yesNo.equalsIgnoreCase("Y")){
		if (yesNo.equalsIgnoreCase("Y")){
			for (int i=20; i!=-1; i--){
				counter++;
				int computerGuess = (int)(Math.random()*i);
				if (!animal[computerGuess]){
					System.out.println("Is it a " +animals[computerGuess]+ " ? (Y/N)");
					yesNo = scan.nextLine();

					if (yesNo.equalsIgnoreCase("Y"))
					{
						System.out.println("I win in " + counter + " guesses!");
						i=0;
					}
					else if (counter==20)
						System.out.println("U ran out of your 20 guesses.");
					{
						animal[computerGuess]=true;
					}
				}
			}
		}
		else 
		{

		}
		System.out.println("Play again? (Y/N)");
		yesNo = scan.nextLine();
		}

	}
}



