/**
 * HappySong.java
 * This program prints out lyrics for "if your happy and you know it" with 10 verses using arrays.                                                                                                                                  
 * Faisal Al-kwiliy
 * Tuesday, March 26, 2016 
 */
package alkwiliy;

import java.util.Scanner;

public class HappySong {
	public static void main(String[] args) {
		/**
		 * This is where the Happy Song program starts.
		 * @param args
		 */
		Scanner scan = new Scanner (System.in);
		
		// variables
		int verse=10;
		
		// input
		String[] verses = {"clap your hands", "stomp your feet", "snap your fingers", "nod your head", "pat your head", "slap your knees", "slap your legs", "jump up and down", "shout 'hooray'", "play NBA 2k15"};
		
		// output
		for (int i=0; i<verse; i++){
			System.out.println("If you're happy and you know it " + verses[i]);
			System.out.println("If you're happy and you know it " + verses[i]);
			System.out.println("If you're happy and you know it and you really want to show it ");
			System.out.println("If you're happy and you know it " + verses[i]);
			System.out.println("");
		}
	}
}
