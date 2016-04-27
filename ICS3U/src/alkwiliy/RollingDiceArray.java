/**
 * RollingDiceArray.java
 * The program stimulates rolling two dice at random for the user and using an array that rolls the two dice 10000 times and displays how much times each number is rolled after 10000 rolls.                                                                                                                                                          
 * Faisal Al-kwiliy
 *Wednesday, March 27, 2016
 **/
package alkwiliy;

import java.util.Scanner;

public class RollingDiceArray {

	public static void main(String[] args) {
		/**
		 * This is where the Rolling Dice Array program starts.
		 * @param args
		 */
		Scanner scan = new Scanner (System.in);

		// Variables
		int numRolls = 10000;

		// Arrays
		String[] rolled = {"2", "3", "4", "5", "6", "7", "8","9", "10", "11", "12"};
		int[] times = new int [11];
		
		
		for (int i = 0; i < numRolls; i++) {
			// Variables
			int userDie1;
			int userDie2;
			int userTotalRoll;

			// Processing
			userDie1= (int)(Math.random()*6)+1;
			userDie2= (int)(Math.random()*6)+1;
			userTotalRoll = userDie1 + userDie2;

			
			if (userTotalRoll==2){
				times[0]++;
			}
			else if (userTotalRoll==3){
				times[1]++;
			}

			else if (userTotalRoll==4){
				times[2]++;
			}

			else if (userTotalRoll==5){
				times[3]++;
			}

			else if (userTotalRoll==6){
				times[4]++;
			}

			else if (userTotalRoll==7){
				times[5]++;
			}

			else if (userTotalRoll==8){
				times[6]++;
			}

			else if (userTotalRoll==9){
				times[7]++;
			}

			else if (userTotalRoll==10){
				times[8]++;
			}

			else if (userTotalRoll==11){
				times[9]++;
			}

			else {
				times[10]++;
			}


		}

			// output
			System.out.println("Total    	Number of Rolls");
			System.out.println("2			" + times[0]);
			System.out.println("3			" + times[1]);
			System.out.println("4			" + times[2]);
			System.out.println("5			" + times[3]);
			System.out.println("6			" + times[4]);
			System.out.println("7			" + times[5]);
			System.out.println("8			" + times[6]);
			System.out.println("9			" + times[7]);
			System.out.println("10			" + times[8]);
			System.out.println("11			" + times[9]);
			System.out.println("12			" + times[10]);
		}
	}


