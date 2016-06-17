package alkwiliy;


import hsa_new.Console;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
/**
 * NBAquiz1.java
 * This program has 3 methods including the main method. This program is used to test the user's knowledge about the NBA and give him/her a score out of 10 when they are done.
 * Faisal Al-kwiliy
 * Friday, June 17, 2016
 */
public class NBAquiz1 {

	// variables in the main, questionsEra, and score methods
	static Console c = new Console(409,150);
	static String passFail;
	static int score = 0;

	// Question Number array
	static String [] questionNumber = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

	// initialize font
	static Font font = new Font("Verdana", Font.BOLD, 18);

	/**
	 * This method is the main method of the NBA quiz program
	 * @param args unused
	 */
	public static void main(String[] args) {
		// start main method
		c.setTextColor(Color.red);

		// 3 Arrays for first Era
		String [] firstEraQuestions = new String [10];
		String [] firstEraAnswers = new String [10];
		String firstEraUserAnswers = new String();

		// Image array for first Era
		Image[] firstEraImages = new Image [10];{
			firstEraImages[0] = Toolkit.getDefaultToolkit ().getImage ("bostonCeltics1.jpg");
			firstEraImages[1] = Toolkit.getDefaultToolkit ().getImage ("losLakers1.jpg");
			firstEraImages[2] = Toolkit.getDefaultToolkit ().getImage ("chicagoBulls1.jpg");
			firstEraImages[3] = Toolkit.getDefaultToolkit ().getImage ("utahJazz1.jpg");
			firstEraImages[4] = Toolkit.getDefaultToolkit ().getImage ("utahJazz2.jpg");
			firstEraImages[5] = Toolkit.getDefaultToolkit ().getImage ("atlantaHawks1.jpg");
			firstEraImages[6] = Toolkit.getDefaultToolkit ().getImage ("phillySixers1.jpg");
			firstEraImages[7] = Toolkit.getDefaultToolkit ().getImage ("chicagoBulls2.jpg");
			firstEraImages[8] = Toolkit.getDefaultToolkit ().getImage ("detroitPistons1.jpg");
			firstEraImages[9] = Toolkit.getDefaultToolkit ().getImage ("losLakers2.jpg");
		}

		// first Era questions and answers
		firstEraQuestions[0] = "Who won the NBA title in the 1985-1986 season? (A, B, C, or D)" + "\n" + "A. Los Angeles Lakers" + "\n" + "B. Boston Celtics" + "\n" +"C. San Antonio Spurs" + "\n" + "D. Chicago Bulls";
		firstEraAnswers[0] = "B";
		firstEraQuestions[1] = "When did the 'showtime' Lakers originate? (A, B, C, or D)" + "\n" + "A. 1980" + "\n" + "B. 1979" + "\n" +"C. 1985" + "\n" + "D. 1983";
		firstEraAnswers[1] = "B";
		firstEraQuestions[2] =  "In the 1984 Draft, a legend in the making was drafted. Who was it? (A, B, C, D)"  + "\n" +  "A. Larry Bird"  + "\n" + "B. Karl Malone"  + "\n" +  "C. Michael Jordan"  + "\n" +  "D. Scottie Pippen";
		firstEraAnswers[2] = "C";
		firstEraQuestions[3] =  "Who was nicknamed 'the mailman'? (A, B, C, D)" + "\n" + "A. Karl Malone" + "\n" + "B. Moses Malone" + "\n" + "C. Kareem Abdul Jabbar" + "\n" + "D. Clyde Drexler";
		firstEraAnswers[3] = "A";
		firstEraQuestions[4] =  "Who won DPOY in the 1988-1989 NBA season? (A, B, C, D)" + "\n" + "A. Michael Jordan" + "\n" + "B. Mark Eaton" + "\n" +"C. Dikembe Mutombo" + "\n" + "D. Sidney Moncrief"; 
		firstEraAnswers[4] = "B";
		firstEraQuestions[5] = 	 "Who won scoring title in the 1985-1986 season? (A, B, C, D)" + "\n" + "A. Dominique Wilkins "+ "\n" + "B. Michael Jordan"+ "\n" + "C. Bernard King"+ "\n" + "D. Clyde Drexler";
		firstEraAnswers[5] = "A";
		firstEraQuestions[6] = "Who won the NBA All star MVP in the 1983 season? (A, B, C, D)"+ "\n" + "A. Magic Johnson " + "\n" + "B. Michael Jordan" + "\n" + "C. Larry Bird" + "\n" + "D. Julius Erving ";
		firstEraAnswers[6] = "D";
		firstEraQuestions[7] =  "Who holds the record for most points in an NBA playoff game? (A, B, C, D)" + "\n" +"A. Kobe Bryant " + "\n" + "B. Wilt Chamberlain" + "\n" + "C. Michael Jordan " + "\n" +"D. Lebron James";
		firstEraAnswers[7] = "C";
		firstEraQuestions[8] = "Who holds the points for the most points in a quarter in an NBA playoff game? (A, B, C, D)" + "\n" + "A. Michael Jordan " + "\n" + "B. Dominique Wilkins " + "\n" + "C. Larry Bird " + "\n" + "D. Isiah Thomas ";
		firstEraAnswers[8] = "D";
		firstEraQuestions[9] = "Who is the NBA all time scorer? (A, B, C, D)" + "\n" + "A. Kareem Abdul Jabbar  " + "\n" + "B. Kobe Bryant " + "\n" +"C. Karl Malone" + "\n" + "D. Michael Jordan";
		firstEraAnswers[9] = "A";


		// 3 Arrays for second Era
		String [] secondEraQuestions = new String [10];
		String [] secondEraAnswers = new String [10];
		String secondEraUserAnswers = new String();

		// Image array for second Era
		Image[] secondEraImages = new Image [10];{
			secondEraImages[0] = Toolkit.getDefaultToolkit ().getImage ("chicagoBulls3.jpg");
			secondEraImages[1] = Toolkit.getDefaultToolkit ().getImage ("chicagoBulls4.jpg");
			secondEraImages[2] = Toolkit.getDefaultToolkit ().getImage ("indianaPacers1.jpg");
			secondEraImages[3] = Toolkit.getDefaultToolkit ().getImage ("losLakers3.jpg");
			secondEraImages[4] = Toolkit.getDefaultToolkit ().getImage ("chicagoBulls5.jpg");
			secondEraImages[5] = Toolkit.getDefaultToolkit ().getImage ("utahJazz3.jpg");
			secondEraImages[6] = Toolkit.getDefaultToolkit ().getImage ("sanAntonio1.jpg");
			secondEraImages[7] = Toolkit.getDefaultToolkit ().getImage ("houstonRockets1.jpg");
			secondEraImages[8] = Toolkit.getDefaultToolkit ().getImage ("losLakers4.jpg");
			secondEraImages[9] = Toolkit.getDefaultToolkit ().getImage ("chicagoBulls6.jpg");
		}

		// second Era questions and answers
		secondEraQuestions[0] = "Who hit the clutch 3 pointer in 1993 to lead Chicago Bulls to its 3rd straight NBA title? (A, B, C, or D)" + "\n" + "A. Michael Jordan" + "\n" + "B. Steve Kerr" + "\n" +"C. John Paxson" + "\n" + "D. Scottie Pippen";
		secondEraAnswers[0] = "C";
		secondEraQuestions[1] = "How much wins did the 1995-1996 Chicago Bulls end with? (A, B, C, or D)" + "\n" + "A. 69" + "\n" + "B. 70" + "\n" +"C. 72" + "\n" + "D. 73";
		secondEraAnswers[1] = "C";
		secondEraQuestions[2] =  "Who is Indiana's 'Mr.Clutch'? (A, B, C, D)"  + "\n" +  "A. Paul George"  + "\n" + "B. Reggie Miller"  + "\n" +  "C. Chris Webber"  + "\n" +  "D. Ray Allen";
		secondEraAnswers[2] = "B";
		secondEraQuestions[3] =  "Who played a record 1042 straight NBA games? (A, B, C, D)" + "\n" + "A. Shaquille O'Neil" + "\n" + "B. Hakeem Olajuwan" + "\n" + "C. Ray Allen" + "\n" + "D. A.C Green";
		secondEraAnswers[3] = "D";
		secondEraQuestions[4] =  "Which years did Michael Jordan not play in when he chose to take a break from the NBA? (A, B, C, D)" + "\n" + "A. 1993, 1994" + "\n" + "B. 1995, 1996 " + "\n" +"C. 1997, 1998 " + "\n" + "D. 1991, 1992"; 
		secondEraAnswers[4] = "A";
		secondEraQuestions[5] = "Who leads the NBA in assists alltime? (A, B, C, D)" + "\n" + "A. Magic Johnson" + "\n" + "B. Jason Williams" + "\n" + "C. John Stockton" + "\n" + "D. Andre Miller";
		secondEraAnswers[5] = "C";
		secondEraQuestions[6] = "What is Tim Duncan's nickname? (A, B, C, D)"+ "\n" + "A. Mr.Postman " + "\n" + "B. The Big Fundamental" + "\n" + "C. The Admiral" + "\n" + "D. The Truth";
		secondEraAnswers[6] = "B";
		secondEraQuestions[7] =  "Who has the most blocks in NBA history? (A, B, C, D)" + "\n" +"A. Hakeem Olajuwan" + "\n" + "B. Dikembe Mutombo" + "\n" + "C. Tim Duncan" + "\n" +"D. Mark Eaton";
		secondEraAnswers[7] = "A";
		secondEraQuestions[8] = "Which NBA player died in 1999? (A, B, C, D)" + "\n" + "A. Kareem Abdul Jabbar" + "\n" + "B. Wilt Chamberlain" + "\n" + "C. Bill Russell" + "\n" + "D. James Worthy";
		secondEraAnswers[8] = "B";
		secondEraQuestions[9] = "Which NBA player is 6-0 in the finals? (A, B, C, D)" + "\n" + "A. Michael Jordan" + "\n" + "B. Magic Johnson" + "\n" +"C. Kobe Bryant" + "\n" + "D. Tim Duncan";
		secondEraAnswers[9] = "A";


		// 3 Arrays for third Era
		String [] thirdEraQuestions = new String [10];
		String [] thirdEraAnswers = new String [10];
		String thirdEraUserAnswers = new String();

		// Image array for third Era
		Image[] thirdEraImages = new Image [10];{
			thirdEraImages[0] = Toolkit.getDefaultToolkit ().getImage ("losLakers5.jpg");
			thirdEraImages[1] = Toolkit.getDefaultToolkit ().getImage ("denverNuggets1.jpg");
			thirdEraImages[2] = Toolkit.getDefaultToolkit ().getImage ("losLakers6.jpg");
			thirdEraImages[3] = Toolkit.getDefaultToolkit ().getImage ("coach1.jpg");
			thirdEraImages[4] = Toolkit.getDefaultToolkit ().getImage ("bostonCeltics3.jpeg");
			thirdEraImages[5] = Toolkit.getDefaultToolkit ().getImage ("clevelandCavaliers1.jpg");
			thirdEraImages[6] = Toolkit.getDefaultToolkit ().getImage ("losLakers5.jpg");
			thirdEraImages[7] = Toolkit.getDefaultToolkit ().getImage ("washingtonWizards1.jpg");
			thirdEraImages[8] = Toolkit.getDefaultToolkit ().getImage ("clevelandCavaliers2.jpg");
			thirdEraImages[9] = Toolkit.getDefaultToolkit ().getImage ("losLakers7.jpg");
		}

		// third Era questions and answers
		thirdEraQuestions[0] = "Which NBA team 3-peated during the years of 2000-2002? (A, B, C, or D)" + "\n" + "A. Chicago Bulls" + "\n" + "B. San Antonio Spurs" + "\n" +"C. Los Angeles Lakers" + "\n" + "D. Boston Celtics";
		thirdEraAnswers[0] = "C";
		thirdEraQuestions[1] = "Who was drafted 3rd overall in the 2003 NBA draft? (A, B, C, or D)" + "\n" + "A. Dwayne Wade" + "\n" + "B. Carmelo Anthony" + "\n" +"C. Chris Bosh" + "\n" + "D. Lebron James";
		thirdEraAnswers[1] = "B";
		thirdEraQuestions[2] =  "Which NBA player dropped 81 points during an NBA game in 2006? (A, B, C, D)"  + "\n" +  "A. Kobe Bryant"  + "\n" + "B. Lebron James"  + "\n" +  "C. Vince Carter"  + "\n" +  "D. Dwayne Wade";
		thirdEraAnswers[2] = "A";
		thirdEraQuestions[3] =  "Which coach has the most NBA titles won as a coach? (A, B, C, D)" + "\n" + "A. Red Auerbach" + "\n" + "B. Gregg Popovich" + "\n" + "C. Phil Jackson" + "\n" + "D. Stan Van Gundy";
		thirdEraAnswers[3] = "C";
		thirdEraQuestions[4] =  "Who was known as the Boston Celtic's 'Big Three'? (A, B, C, D)" + "\n" + "A. Rajon Rondo, Paul Pierce, Ray Allen" + "\n" + "B. Rajon Rondo, Ray Allen, Kevin Garnett" + "\n" +"C. Ray Allen, Kevin Garnett, Paul Pierce" + "\n" + "D. Kevin Garnett, Rajon Rondo, Paul Pierce"; 
		thirdEraAnswers[4] = "C";
		thirdEraQuestions[5] = "Which of these nicknames is LeBron James not called? (A, B, C, D)" + "\n" + "A. LeGOAT"+ "\n" + "B. The Great One" + "\n" + "C. The Chosen One"+ "\n" + "D. LBJ";
		thirdEraAnswers[5] = "B";
		thirdEraQuestions[6] = "Shaq and Kobe were: (A, B, C, D)"+ "\n" + "A. Teammates" + "\n" + "B. Rivals" + "\n" + "C. Brothers" + "\n" + "D. None of the above";
		thirdEraAnswers[6] = "A";
		thirdEraQuestions[7] = "Which team did Michael Jordan play for in the 2002 NBA season? (A, B, C, D)" + "\n" +"A. Washington Wizards" + "\n" + "B. Detroit Pistons " + "\n" + "C. Cleveland Cavaliers" + "\n" +"D. Charlotte Hornets";
		thirdEraAnswers[7] = "A";
		thirdEraQuestions[8] = "Who won back to back NBA MVPS in 2008-2009 and 2009-2010 NBA seasons? (A, B, C, D)" + "\n" + "A. Kevin Durant" + "\n" + "B. Kobe Bryant" + "\n" + "C. LeBron James " + "\n" + "D. Dwayne Wade";
		thirdEraAnswers[8] = "C";
		thirdEraQuestions[9] = "The NBA finals team that won in 2009 was: (A, B, C, D)" + "\n" + "A. Miami Heat " + "\n" + "B. Boston Celtics" + "\n" +"C. San Antonio Spurs" + "\n" + "D. Los Angeles Lakers";
		thirdEraAnswers[9] = "D";


		// 3 Arrays for fourth Era
		String [] fourthEraQuestions = new String [10];
		String [] fourthEraAnswers = new String [10];
		String fourthEraUserAnswers = new String();

		// Image array for fourth Era
		Image[] fourthEraImages = new Image [10];{
			fourthEraImages[0] = Toolkit.getDefaultToolkit ().getImage ("clevelandCavaliers3.jpg");
			fourthEraImages[1] = Toolkit.getDefaultToolkit ().getImage ("miamiHeat1.jpg");
			fourthEraImages[2] = Toolkit.getDefaultToolkit ().getImage ("dallasMavericks1.jpg");
			fourthEraImages[3] = Toolkit.getDefaultToolkit ().getImage ("miamiHeat2.jpg");
			fourthEraImages[4] = Toolkit.getDefaultToolkit ().getImage ("clevelandCavaliers4.jpg");
			fourthEraImages[5] = Toolkit.getDefaultToolkit ().getImage ("miamiHeat3.jpg");
			fourthEraImages[6] = Toolkit.getDefaultToolkit ().getImage ("chicagoBulls7.jpg");
			fourthEraImages[7] = Toolkit.getDefaultToolkit ().getImage ("miamiHeat4.jpg");
			fourthEraImages[8] = Toolkit.getDefaultToolkit ().getImage ("sanAntonio2.jpg");
			fourthEraImages[9] = Toolkit.getDefaultToolkit ().getImage ("goldenState1.jpg");
		}

		// fourth Era questions and answers
		fourthEraQuestions[0] = "Which NBA player got drafted number 1 overall in the 2011 NBA draft? (A, B, C, or D)" + "\n" + "A. Kyrie Irving" + "\n" + "B. Stephen Curry" + "\n" +"C. Damian Liliard" + "\n" + "D. Blake Griffin";
		fourthEraAnswers[0] = "A";
		fourthEraQuestions[1] = "Which NBA player made 'the decision'? (A, B, C, or D)" + "\n" + "A. Kobe Bryant" + "\n" + "B. Lebron James" + "\n" +"C. Dwayne Wade" + "\n" + "D. Kevin Durant";
		fourthEraAnswers[1] = "B";
		fourthEraQuestions[2] =  "Which NBA legend has the most points for a foreign player? (A, B, C, D)"  + "\n" +  "A. Manu Ginobli"  + "\n" + "B. Tony Parker"  + "\n" +  "C. Darko Milicic"  + "\n" +  "D. Dirk Nowitzki";
		fourthEraAnswers[2] = "D";
		fourthEraQuestions[3] =  "Which NBA player won back to back rings, back to back MVPs, and back to back finals MVPs? (A, B, C, D)" + "\n" + "A. Lebron James" + "\n" + "B. Stephen Curry" + "\n" + "C. Kevin Durant" + "\n" + "D. Dwayne Wade";
		fourthEraAnswers[3] = "A";
		fourthEraQuestions[4] =  "Lebron James finals record is: (A, B, C, D)" + "\n" + "A. 2-5" + "\n" + "B. 1-4" + "\n" +"C. 2-4" + "\n" + "D. 2-3"; 
		fourthEraAnswers[4] = "C";
		fourthEraQuestions[5] = "Who's nickname is Flash? (A, B, C, D)" + "\n" + "A. John Wall" + "\n" + "B. Isiah Thomas" + "\n" + "C. Dwayne Wade"+ "\n" + "D. Russell Westbrook";
		fourthEraAnswers[5] = "C";
		fourthEraQuestions[6] = "Who is the youngest to win an NBA MVP? (A, B, C, D)"+ "\n" + "A. Kevin Durant" + "\n" + "B. Stephen Curry" + "\n" + "C. Lebron James" + "\n" + "D. Derrick Rose";
		fourthEraAnswers[6] = "D";
		fourthEraQuestions[7] =  "Who hit the clutch 3 to send game 6 of the 2013 NBA finals to overtime? (A, B, C, D)" + "\n" +"A. Chris Bosh" + "\n" + "B. Ray Allen" + "\n" + "C. Lebron James" + "\n" +"D. Mike Miller";
		fourthEraAnswers[7] = "B";
		fourthEraQuestions[8] = "Tim Duncan has: (A, B, C, D)" + "\n" + "A. 3 rings " + "\n" + "B. 5 rings" + "\n" + "C. 4 rings" + "\n" + "D. 6 rings";
		fourthEraAnswers[8] = "B";
		fourthEraQuestions[9] = "The Golden State Warriors record in the 2014-2015 NBA season was: (A, B, C, D)" + "\n" + "A. 67-15" + "\n" + "B. 72-10" + "\n" +"C. 73-9" + "\n" + "D. 68-14";
		fourthEraAnswers[9] = "A";

		// variables in main method
		String playAgain = "yes";
		int score = 0;

		// start of while loop
		while (playAgain.equalsIgnoreCase("yes")){
			// start of try/catch
			Clip theme;
			try{
				c.clear();
				score = 0;

				c.println("Hi, this is an NBA trivia quiz, your skills and knowledge will be tested."
						+ " Choose a number from 1-4 to choose an era.");
				
				theme = AudioSystem.getClip();
				theme.open(AudioSystem.getAudioInputStream(new File("NBAThemeSong.wav")));
				theme.start();

				// Title page image
				Image jpgtitlePage = Toolkit.getDefaultToolkit().getImage ("titlePage.jpg");
				//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgtitlePage, jpgtitlePage.getWidth(null), jpgtitlePage.getHeight(null), null)));

				c.drawImage (jpgtitlePage, 150, 80, 900, 800, null);

				// input chosenEra
				int chosenEra = Integer.parseInt(c.readLine());

				if (chosenEra == 1 ||chosenEra == 2||chosenEra == 3||chosenEra == 4);

				else {
					c.println("That is not a number between 1-4, please enter a valid number or you will be asked to play again.");
					// input answer (A, B, C, or D)
					chosenEra = Integer.parseInt(c.readLine());

				}


				if (chosenEra==1){
					theme.stop();
					//for loop
					for (int i=0; i<10; i++){
						// call method questionsEra
						if(questionsEra(firstEraQuestions, firstEraAnswers, firstEraImages, i))
							score++;
					}
					//end loop

					passFail = score(score);
					// output
					c.println("You scored " + score + " out of 10. You " + passFail);
				}

				else if (chosenEra==2){
					theme.stop();
					//for loop
					for (int i=0; i<10; i++){
						// call method questionsEra
						if(questionsEra(secondEraQuestions, secondEraAnswers, secondEraImages, i))
							score++;
					}
					//end loop
					passFail = score(score);
					// output
					c.println("You scored " + score + " out of 10. You " + passFail);
				}


				else if (chosenEra==3){
					theme.stop();
					for (int i=0; i<10; i++){
						// call method questionsEra
						if(questionsEra(thirdEraQuestions, thirdEraAnswers, thirdEraImages, i))
							score++;
					}
					//end loop
					passFail = score(score);
					// output
					c.println("You scored " + score + " out of 10. You " + passFail);
				}


				else if (chosenEra==4){
					theme.stop();
					for (int i=0; i<10; i++){
						// call method questionsEra
						if(questionsEra(fourthEraQuestions, fourthEraAnswers, fourthEraImages, i))
							score++;
					}
					//end loop
					passFail = score(score);
					// output
					c.println("You scored " + score + " out of 10. You " + passFail);
				}

				else 
					c.println("Not a number between 1-4");




				c.println("Play again?");	
				// input yes or no
				playAgain = c.readLine();
				if (!playAgain.equalsIgnoreCase("yes")||!playAgain.equalsIgnoreCase("No"));{
					c.println("Please enter yes or no");
					playAgain = c.readLine();
				}


			}catch(
					Exception e){
				c.println("Error Occured");
			}
			// end of try/catch





		}
		// end of while loop




	}
	// end of main method

	/**
	 * This method is the questionsEra method where the program shows the questions in the era and add 1 to score for every correct answer.
	 * @param questions used for displaying question
	 * @param answers used for displaying correct answer
	 * @param images used for displaying images
	 * @param questionNumber used for displaying correct question and question number
	 * @return true if correct
	 * @return false if wrong
	 */
	private static boolean	questionsEra(String [] questions, String[] answers, Image[] images, int questionNumber) {
		// start questionsEra method
		// clear screen
		Clip theme;
		c.clear();

		// set font type and size
		c.setFont(font);
		// set font color
		c.setColor(Color.RED);
		// output
		c.println("                                                                           " + "NBA TRIVIA");
		c.println("Question:"); 
		c.println(questionNumber+1);
		c.println(questions[questionNumber]);
		// input answer (A, B, C, or D)
		String answer = c.readLine();
		if (answer.equalsIgnoreCase("A")||answer.equalsIgnoreCase("B")||answer.equalsIgnoreCase("C")||answer.equalsIgnoreCase("D"));

		else {
			c.println("That is not a valid answer, please enter a valid answer or your answer will be incorrect.");
			// input answer (A, B, C, or D)
			answer = c.readLine();

		}

		if(answer.equalsIgnoreCase(answers[questionNumber]))
		{
			// output correct
			c.drawString("You are Correct!", 200, 250);
			try {
				theme = AudioSystem.getClip();
			try {
				theme.open(AudioSystem.getAudioInputStream(new File("correctAnswer.wav")));
			} catch (IOException | UnsupportedAudioFileException e) {
				e.printStackTrace();
			}
			theme.start();
			} catch (LineUnavailableException e1) {
				e1.printStackTrace();
			}
			
			//while(!(Toolkit.getDefaultToolkit().prepareImage(firstEraImages, firstEraImages.getWidth(null), firstEraImages.getHeight(null), null)));

			// output image
			c.drawImage (images[questionNumber], 150, 400, 800, 700, null);
			// start try/catch for timer
			try {
				Thread.sleep (2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// end try/catch for timer
			c.clear();
			return true;
		}
		else 
		{
			// output incorrect and display correct answer
			c.drawString("Sorry, you were wrong. The answer was " + answers[questionNumber], 200, 250);
			try {
				theme = AudioSystem.getClip();
			try {
				theme.open(AudioSystem.getAudioInputStream(new File("wrongAnswer.wav")));
			} catch (IOException | UnsupportedAudioFileException e) {
				e.printStackTrace();
			}
			theme.start();
			} catch (LineUnavailableException e1) {
				e1.printStackTrace();
			}
			//while(!(Toolkit.getDefaultToolkit().prepareImage(firstEraImages, firstEraImages.getWidth(null), firstEraImages.getHeight(null), null)));

			//output image
			c.drawImage (images[questionNumber], 150, 400, 800, 700, null);
			// start try/catch for timer
			try {
				Thread.sleep (2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// end try/catch for timer
			c.clear();
		}

		return false;

	}

	// end of questionsEra method


	/**
	 * This method is the score method which displays if the user passed or failed and their total score.
	 * @param score checked to see if user passed or failed.
	 * @return passFail passed if 5+, failed if below 5
	 */
	private static String score(int score) {
		// start score method
		if (score >=0 && score <=2 )
			// output
			passFail = "failed terribly. You know nothing about this era in the NBA.";
		else if (score >=3 && score <=4)
			// output
			passFail = "failed. You should research about this era in the NBA.";
		else if (score >=5 && score <=7) 
			// output
			passFail = "passed. You know some info about this era in the NBA.";
		else if (score>=8 && score <=10)
			// output
			passFail = "passed. You know alot of info about this era in the NBA!";
		else
			// output
			passFail = "You achieved an impossible score";
		return passFail;		
	}
	// end score method




}