package alkwiliy;
/**
 * LikeOrHate.java
 * The program displays at random if the name inputed is a favorite or if it is despised.                                                                                                                                                    
 * Faisal Al-kwiliy
 *Wednesday, March 23, 2016
 **/
import java.util.Scanner;
public class LikeOrHate {


	public static void main(String[] args) {
		/**
		 * This is where the Rolling Dice program starts.
		 * @param args
		 */

		Scanner scan = new Scanner (System.in);

		//***variables

		String name;

		//*** input
		System.out.println("What is your name?");
		name=scan.nextLine();
		
		//*** processing
		int random=(int)(Math.random()*10)+1;

		//*** output
		if (random <=3){
			System.out.println("I hate that name");
		}
		else{
			System.out.println("That name is my favourite name");	
		}
	}

}
