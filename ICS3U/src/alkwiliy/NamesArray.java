/**
 * NamesArray.java
 * This program reads a list of names, and then outputs the list twice; one in order, and one in reverse order.                                                                                                                                                              
 * Faisal Al-kwiliy
 * Tuesday, March 26, 2016 
 */
package alkwiliy;
import java.util.Scanner;

public class NamesArray {


	public static void main(String[] args) {
		/**
		 * This is where the Names Array program starts.
		 * @param args
		 */
		Scanner scan = new Scanner (System.in);

		// input
		int name;
		
		// processing
		System.out.println("How much names are you inputting?");
		name = Integer.parseInt(scan.nextLine()); 
		String[] names=new String [name];

		System.out.println("Enter the " + name + " names one by one.");
		
		// output
		for (int i=0; i<name; i++)
			names[i] = scan.nextLine();
		
		for (int i=0; i<name; i++)
			System.out.println(names[i]);
			
		for (int i = name - 1; i >= 0; i--)	
			System.out.println(names[i]);
		


	}

}
