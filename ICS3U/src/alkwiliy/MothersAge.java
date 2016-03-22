package alkwiliy;
/*
 * MothersAge.java
 * The program displays the age your mother was when you were born.
 * Faisal Al-kwiliy
 * Tuesday, March 8, 2016
 **/
import java.util.Scanner;

public class MothersAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		
		//*** variables
		int motherAge; // user's mother's age
		int kidAge; //user's child's age
		int motherYoungAge; //user's mother's age when child is born
		String motherName; //mother's name
		String kidName; //kid's name

		System.out.println("Please enter your mother's name");
		motherName = myInput.nextLine();
		System.out.println("Please enter your kid's name");
		kidName = myInput.nextLine();
		System.out.println("Please enter your mother's age");
		motherAge = Integer.parseInt(myInput.nextLine());
		System.out.println("Please enter your kid's age");
		kidAge=Integer.parseInt(myInput.nextLine());

		motherYoungAge = motherAge-kidAge; //how old will the mother be when her child was born?

		System.out.println(motherName+ ", you were " + motherYoungAge + " when your child " + kidName + " was born.");
	}

}
