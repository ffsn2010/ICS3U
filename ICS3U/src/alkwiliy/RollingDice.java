package alkwiliy;

import java.util.Scanner;

/**
 * RollingDice.java
 * The program stimulates rolling two dice at random for the user, and then for the computer, and announcing who won between the computer and the user, or say it was a tie and lets the user plays until he wants to stop.                                                                                                                                                                     
 * Faisal Al-kwiliy
 *Wednesday, March 23, 2016
 **/


public class RollingDice {


	public static void main(String[] args) {
		/**
		 * This is where the Rolling Dice program starts.
		 * @param args
		 */

		Scanner scan = new Scanner(System.in);

		//*** variables
		int userDie1;
		int userDie2;
		int computerDie1;
		int computerDie2;
		int userTotalRoll;
		int computerTotalRoll;
		String playAgain = "yes";

		//*** output

		while(playAgain.equalsIgnoreCase("yes")){

			userDie1= (int)(Math.random()*6)+1;
			userDie2= (int)(Math.random()*6)+1;
			computerDie1= (int)(Math.random()*6)+1;
			computerDie2= (int)(Math.random()*6)+1;

			userTotalRoll = userDie1 + userDie2;
			computerTotalRoll = computerDie1 + computerDie2;


			System.out.println("User's roll: " + userTotalRoll);
			System.out.println("Computer's roll: " + computerTotalRoll);
			if (userTotalRoll>computerTotalRoll){
				System.out.println("Congratulations, the user won");
			}
			else if (userTotalRoll<computerTotalRoll){
				System.out.println("Sorry, the computer won");
			}
			else {
				System.out.println("The user and computer are tied.");
			}

			System.out.println("Play again?");
			playAgain = scan.nextLine();

		}

	}



}

