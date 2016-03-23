package alkwiliy;
/**
 * RollingDice.java
 * The program stimulates rolling two dice at random and announcing who won between the computer and the user, or say it was a tie.                                                                                                                                                                     
 * Faisal Al-kwiliy
 *Wednesday, March 23, 2016
 **/


public class RollingDice {


	public static void main(String[] args) {
		/**
		 * This is where the Rolling Dice program starts.
		 * @param args
		 */

		//*** variables
		int UserDie;
		int ComputerDie;
		
		//*** processing
		UserDie= (int)(Math.random()*6)+1;
		ComputerDie= (int)(Math.random()*6)+1;

		System.out.println("User's roll: " + UserDie);
		System.out.println("Computer's roll: " + ComputerDie);
		
		//*** output
		if (UserDie>ComputerDie){
			System.out.println("Congratulations, the user won");
		}
		else if (UserDie<ComputerDie){
			System.out.println("Sorry, the computer won");
		}
		else {
			System.out.println("The user and computer are tied.");
		}

	}


}