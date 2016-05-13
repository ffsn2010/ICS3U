/**
 * TicTacToe.java
 * This Program is a Tic Tac Toe game between two users.
 * Faisal Al-kwiliy
 * Friday, May 13, 2016
 */
package alkwiliy;
import java.util.Scanner;

public class TicTacToe {

	/**
	 * This is where the Tic Tac Toe program starts.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		// Array
		char[][] board = {{' ',' ',' '}, {' ',' ',' '}, {' ', ' ', ' '}};
		
		// Variables
		boolean win = false;
		int rowNumber;
		int columnNumber;
		int playerORow;
		int playerOcolumn;
		System.out.println("Welcome to tic, tac, toe!\n");
		
		
		while (win == false){
			
			// Player X's turn
			System.out.println("Player X, please enter row (1-3) of your move: ");
			rowNumber = scan.nextInt();
			System.out.println("Player X, please enter column (1-3); of your move: ");
			columnNumber = scan.nextInt();

			board[rowNumber-1][columnNumber-1] = 'X';
			
			displayBoard(board);



			if ((board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0]!= ' ')||
					(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0]!= ' ')||	
					(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0]!= ' ')){
				
				System.out.println("The game is over. " + board[0][0] + " wins" ); 
				win = true;
			}
			else if ((board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0]!= ' ')||
			(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0]!= ' ')){

				System.out.println("The game is over. " + board[1][0] + " wins" );
				win = true;

			}
			else if ((board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1]!= ' ')){
			

				System.out.println("The game is over. " + board[0][1] + " wins" );
				win = true;
			}
			else if	((board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2]!= ' ')){
				
				System.out.println("The game is over. " + board[0][2] + " wins" );
				win = true;
			}

			else if 	((board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')){
				
				System.out.println("The game is over. " + board[1][1] + " wins");
				win = true;
			}
			
			// Player O's turn
			System.out.println("Player O, please enter row (1-3) for player O: ");
			playerORow = scan.nextInt();
			System.out.println("Player O, please enter column (1-3); of your move: ");
			playerOcolumn = scan.nextInt();

			board[playerORow-1][playerOcolumn-1] = 'O';

			
			displayBoard(board);

			if ((board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0]!= ' ')||
					(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0]!= ' ')||	
					(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0]!= ' ')){
				
				System.out.println("The game is over. " + board[0][0] + " wins" ); 
				win = true;
			}
			else if ((board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0]!= ' ')||
			(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0]!= ' ')){

				System.out.println("The game is over. " + board[1][0] + " wins" );
				win = true;

			}
			else if ((board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1]!= ' ')){
			

				System.out.println("The game is over. " + board[0][1] + " wins" );
				win = true;
			}
			else if	((board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2]!= ' ')){
				
				System.out.println("The game is over. " + board[0][2] + " wins" );
				win = true;
			}

			else if 	((board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')){
				
				System.out.println("The game is over. " + board[1][1] + " wins");
				win = true;
			}

		}
	}


	private static void displayBoard(char[][] board) {

		// board construction
		System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n---------");
		System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n---------");
		System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n");
	}

}


