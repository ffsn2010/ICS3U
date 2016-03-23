package alkwiliy;
/**
 * RollingDice.java
 * The program stimulates rolling two dice at random for the user, and then for the computer, and announcing who won between the computer and the user, or say it was a tie.                                                                                                                                                                     
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
		int UserDie1;
		int UserDie2;
		int ComputerDie1;
		int ComputerDie2;
		int UserTotalRoll;
		int ComputerTotalRoll;
		
		//*** processing
		UserDie1= (int)(Math.random()*6)+1;
		UserDie2= (int)(Math.random()*6)+1;
		ComputerDie1= (int)(Math.random()*6)+1;
		ComputerDie2= (int)(Math.random()*6)+1;
		
		UserTotalRoll = UserDie1 + UserDie2;
		ComputerTotalRoll = ComputerDie1 + ComputerDie2;

		System.out.println("User's roll: " + UserTotalRoll);
		System.out.println("Computer's roll: " + ComputerTotalRoll);
		
		//*** output
		if (UserTotalRoll>ComputerTotalRoll){
			System.out.println("Congratulations, the user won");
		}
		else if (UserTotalRoll<ComputerTotalRoll){
			System.out.println("Sorry, the computer won");
		}
		else {
			System.out.println("The user and computer are tied.");
		}

	}


}