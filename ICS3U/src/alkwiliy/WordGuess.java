/**
 * WordGuess.java
 * This program displays a word guessing game between the computer and user, where the user guesses the name of an animal
 * Faisal Al-kwiliy
 * Wednesday, May 11, 2016
 */
package alkwiliy;
import java.util.Scanner;


public class WordGuess {

	/**
	 * This is the start to the WordGuess program.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		// Array
		String[] animals = {"lion", "tiger", "leopard", "zebra", "monkey", "ant", "snail", "mouse",  "donkey", "dog", "horse", "bear", "wolf", "ostrich", "rhino", "cat", "owl"};

		// Variables
		int random;
		String letterGuess = null;
		String wordGuess;
		int  number;
		boolean fullWord = false;
		int counter=0;
	
		

		// Randomize the selection of the animal
		random = (int) (Math.random() * animals.length);
		String dash = "";

		// for loop
		for (int i = 0; i < animals[random].length(); i++) {
			dash = dash + "-";
		}

		// Output
		System.out.println("Let's play the word guessing game!!");
		System.out.println("You guess a letter each time, and if you know the word just enter '!'");
		System.out.println(dash);

		do{
			if (dash.equalsIgnoreCase(animals[random])){
				fullWord = true;
			}else{
				System.out.println("Guess a letter");
				letterGuess = scan.nextLine();
				if (letterGuess.equals("!")){
					fullWord = true;
				}
				else{

					number = animals[random].indexOf(letterGuess);
					if (number== -1){
						System.out.println("that letter isnt in there");
						counter++;
					}
					else{
						dash = dash.substring(0, number) + letterGuess + dash.substring ((number+1), dash.length()); 

						System.out.println(dash);
						counter++;
					}
				}
			}
			// While loop
		} while (!fullWord);

		if (letterGuess.equals("!")){
			System.out.println("Enter the whole word now");
			wordGuess = scan.nextLine();
			if (wordGuess.equals(animals[random])){
				System.out.println("You guessed the word, Congratulations you won! The secret word is " + animals[random]);
				System.out.println("You made " + counter  + " guesses before giving the full word");
			}
			else {
				System.out.println("you only had one chance to guess the word and you got it wrong so you lost. The secret word was " + animals[random]);
				System.out.println("You made " + counter  + " guesses before giving the full word");
			}
		}
	}


}







		


