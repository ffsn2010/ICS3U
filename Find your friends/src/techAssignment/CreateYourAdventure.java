package techAssignment;

import hsa_new.Console;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;      

/**
 * CreateYourAdventure.java
 * This program is our adventure game creation (Choose your own adventure).
 *Faisal Al-kwiliy & Kevin Appiah, 
 *Tuesday, April 19th, 2016
 */
public class CreateYourAdventure {

	static Console c = new Console(45,160);

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		c.setTextColor(Color.red);
		c.setTextBackgroundColor(Color.black);
		c.clear();
		
		//*** variables
		String direction; 
		String southAnswer;
		String southAnswer1;
		String southAnswer2;
		String southAnswer3;
		String northAnswer;
		String northAnswer1;
		String northAnswer2;
		String northAnswer3;
		String eastAnswer;
		String eastAnswer1;
		String eastAnswer2;
		String eastAnswer3;
		String westAnswer;
		String westAnswer1;
		String westAnswer2;
		String westAnswer3;
		String westAnswer4;
		String playAgain = "yes";
		
		//*** images
		Image jpgriverImage = Toolkit.getDefaultToolkit ().getImage ("riverImage.jpg");
		Image jpgsnakeImage = Toolkit.getDefaultToolkit ().getImage ("snakeImage.jpg");
		Image jpgjumpImage = Toolkit.getDefaultToolkit ().getImage ("jumpImage.jpg");
		Image jpgcabinImage = Toolkit.getDefaultToolkit ().getImage ("cabinImage.jpg");
		Image jpgforestImage = Toolkit.getDefaultToolkit ().getImage ("forestImage.jpg");
		Image jpgsoundsImage = Toolkit.getDefaultToolkit().getImage ("soundsImage.jpg");
		Image jpgstudentsImage = Toolkit.getDefaultToolkit().getImage("studentsImage.jpg");
		Image jpgbearImage = Toolkit.getDefaultToolkit().getImage("bearImage.jpg");
		Image jpgcrazymanImage = Toolkit.getDefaultToolkit().getImage("crazymanImage.jpg");
		Image jpgcliffImage = Toolkit.getDefaultToolkit().getImage("cliffImage.jpg");
		Image jpgcollapseImage = Toolkit.getDefaultToolkit().getImage("collapseImage.jpg");
		Image jpggorillaImage = Toolkit.getDefaultToolkit().getImage("gorillaImage.jpg");
		Image jpgpersonImage = Toolkit.getDefaultToolkit().getImage("personImage.jpg");
		Image jpgtunnelImage = Toolkit.getDefaultToolkit().getImage("tunnelImage.jpg");
		Image jpgcabin2Image = Toolkit.getDefaultToolkit().getImage("cabin2Image.jpg");
		Image jpgforest2Image = Toolkit.getDefaultToolkit().getImage("forest2Image.jpg");
		Image jpgmonsterImage = Toolkit.getDefaultToolkit().getImage("monsterImage.jpg");
		Image jpgswampImage = Toolkit.getDefaultToolkit().getImage("swampImage.jpg");
		Image jpgtiredImage = Toolkit.getDefaultToolkit().getImage("tiredImage.jpg");
		Image jpgforkImage = Toolkit.getDefaultToolkit().getImage("forkImage.jpg");
		Image jpgphoneImage = Toolkit.getDefaultToolkit().getImage("phoneImage.jpg");
		Image pngdeadImage = Toolkit.getDefaultToolkit().getImage("deadImage.png");
		Image jpgwolvesImage = Toolkit.getDefaultToolkit().getImage("wolvesImage.jpg");
		Image jpgclassmatesImage = Toolkit.getDefaultToolkit().getImage("classmatesImage.jpg");
		Image jpgpathsImage = Toolkit.getDefaultToolkit().getImage("pathsImage.jpg");
		Image jpgeastImage = Toolkit.getDefaultToolkit().getImage("eastImage.jpg");
		Image jpgripImage = Toolkit.getDefaultToolkit().getImage("ripImage.jpg");
		Image jpgwarehouseImage = Toolkit.getDefaultToolkit().getImage("warehouseImage.jpg");
		Image jpgmadmanImage = Toolkit.getDefaultToolkit().getImage("madmanImage.jpg");
		Image jpgwalkieImage = Toolkit.getDefaultToolkit().getImage("walkieImage.jpg");
		Image jpgtrainImage = Toolkit.getDefaultToolkit().getImage("trainImage.jpg");
		Image jpgtrainHitImage = Toolkit.getDefaultToolkit().getImage("trainHitImage.jpg");
		Image jpgwalkingForeverImage = Toolkit.getDefaultToolkit().getImage("walkingForeverImage.jpg");
		Image jpgpoliceImage = Toolkit.getDefaultToolkit().getImage("policeImage.jpg");
		Image jpgbridgeImage = Toolkit.getDefaultToolkit().getImage("bridgeImage.jpg");
		Image jpgrobotImage = Toolkit.getDefaultToolkit().getImage("robotImage.jpg");


		//*** output
		while(playAgain.equalsIgnoreCase("yes")){

			Clip theme;
			try {
				theme = AudioSystem.getClip();
				theme.open(AudioSystem.getAudioInputStream(new File("Windy.wav")));
				theme.start();
				//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgpathsImage, jpgpathsImage.getWidth(null), jpgpathsImage.getHeight(null), null)));

				c.drawImage (jpgpathsImage, 50, 50, 800, 600, null);
				c.println("You're on a field trip and you fall asleep. When you wake up, no one is around and you are lost. Which way do you go: North, South, East, or West?");
				direction = c.readLine();


				if (direction.equalsIgnoreCase("North")) 
				{
					theme.stop();
					theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("Stream.wav")));
					theme.start();
					c.clear();
					//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgriverImage, jpgriverImage.getWidth(null), jpgriverImage.getHeight(null), null)));

					c.drawImage (jpgriverImage, 50, 50, 800, 600, null);

					c.println("You come across a river. What do you do? (jump, swim, find something)");
					northAnswer =c.readLine();

					{
						if (northAnswer.equalsIgnoreCase("jump")){
							theme.stop();
							c.clear();
							theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("LegsBreak.wav")));
							theme.start();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgjumpImage, jpgjumpImage.getWidth(null), jpgjumpImage.getHeight(null), null)));

							c.drawImage (jpgjumpImage, 50, 50, 800, 600, null);
							c.println("You cant jump the river, you die."); 
						}
						else if (northAnswer.equalsIgnoreCase("find something")){
							theme.stop();
							c.clear();
							theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("Snake.wav")));
							theme.start();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgsnakeImage, jpgsnakeImage.getWidth(null), jpgsnakeImage.getHeight(null), null)));

							c.drawImage (jpgsnakeImage, 50, 50, 800, 600, null);
							c.println("When looking for the log, there is a poisonous snake, and it bites you and you die.");
						}
						else 
						{ theme.stop();
						c.clear();
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("Owl.wav")));
						theme.start();
						//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgforestImage, jpgforestImage.getWidth(null), jpgforestImage.getHeight(null), null)));

						c.drawImage (jpgforestImage, 50, 50, 800, 600, null);
						c.println("Your clothes get wet, but you make it safely across. It's getting darker and you see a forest. What do you do? (approach, camp)");

						northAnswer1=c.readLine();
						if (northAnswer1.equalsIgnoreCase("Camp")){
							theme.stop();
							c.clear();
							theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("Bear.wav")));
							theme.start();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgbearImage, jpgbearImage.getWidth(null), jpgbearImage.getHeight(null), null)));

							c.drawImage (jpgbearImage, 50, 50, 800, 600, null);
							c.println("You go to sleep, and while your sleeping, a bear comes and kills you.");
						}
						else 
						{theme.stop();
						c.clear();
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("Forest2.wav")));
						theme.start();
						//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgcabinImage, jpgcabinImage.getWidth(null), jpgcabinImage.getHeight(null), null)));

						c.drawImage (jpgcabinImage, 50, 50, 800, 600, null);
						c.println("You go into the forest and see a cabin, do you enter the cabin or continue your path? (enter, continue)");

						northAnswer2=c.readLine();
						if (northAnswer2.equalsIgnoreCase("Enter")){
							theme.stop();
							c.clear();
							theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("Knife.wav")));
							theme.start();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgcrazymanImage, jpgcrazymanImage.getWidth(null), jpgcrazymanImage.getHeight(null), null)));

							c.drawImage (jpgcrazymanImage, 50, 50, 800, 600, null);
							c.println("You see a man that has a knife and kills you.");
						}
						else
						{theme.stop();
						c.clear();
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("Crickets.wav")));
						theme.start();
						//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgsoundsImage, jpgsoundsImage.getWidth(null), jpgsoundsImage.getHeight(null), null)));

						c.drawImage (jpgsoundsImage, 50, 50, 800, 600, null);
						c.println("You contine and you hear sounds up ahead. Do you go towards the sounds or turn around? (towards, turn around)");
						northAnswer3=c.readLine();
						if (northAnswer3.equalsIgnoreCase("Turn around")){
							theme.stop();
							c.clear();
							theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("Knife.wav")));
							theme.start();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgcrazymanImage, jpgcrazymanImage.getWidth(null), jpgcrazymanImage.getHeight(null), null)));

							c.drawImage (jpgcrazymanImage, 50, 50, 800, 600, null);
							c.println("You turn around and go back, but the inhabitant of the cabin sees you and kills you.");
						}
						else
						{theme.stop();
						c.clear();
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("Cheer (2).wav")));
						theme.start();
						//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgstudentsImage, jpgstudentsImage.getWidth(null), jpgstudentsImage.getHeight(null), null)));

						c.drawImage (jpgstudentsImage, 50, 50, 800, 600, null);
						c.println("You go towards the sounds and it turns out that the noise was your classmates searching for you, and you make it home.");
						}
						}
						}
						}


					}
				}

				else if (direction.equalsIgnoreCase("South"))
				{
					theme.stop();
					c.clear();
					theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("Windy.wav")));
					theme.start();
					//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgcliffImage, jpgcliffImage.getWidth(null), jpgcliffImage.getHeight(null), null)));

					c.drawImage (jpgcliffImage, 50, 50, 800, 600, null);
					c.println("You spot a cliff, and see someone below the cliff and must find a way down.");
					c.println("You either have to climb down, use the rope attached to the cliff or look for another way down. (climb down, look for another way down, use rope)");
					southAnswer = c.readLine();
					if (southAnswer.equalsIgnoreCase("Climb Down")){

						theme.stop();
						c.clear();
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("LegsBreak.wav")));
						theme.start();
						//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgripImage, jpgripImage.getWidth(null), jpgripImage.getHeight(null), null)));

						c.drawImage (jpgripImage, 50, 50, 800, 600, null);
						c.println("You slip and fall to your death");
					}

					else if (southAnswer.equalsIgnoreCase("Look for another way down"))
					{
						theme.stop();
						c.clear();
						//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgtunnelImage, jpgtunnelImage.getWidth(null), jpgtunnelImage.getHeight(null), null)));

						c.drawImage (jpgtunnelImage, 50, 50, 800, 600, null);
						c.println("You find an opening to a tunnel, with a sign that says:");
						c.println("Follow to reach the door, with a keypad lock, with a 1 number code. You have 4 tries. (It's a number from 0-9)");
						int guessCode = Integer.parseInt(c.readLine());
						int guessCounter=0;
						int correctNumber = (int)(Math.random()* 9) + 0;
						while (guessCounter !=3 && guessCode != correctNumber)
						{
							if (guessCode != correctNumber)
							{
								theme.stop();
								c.clear();
								theme = AudioSystem.getClip();
								theme.open(AudioSystem.getAudioInputStream(new File("Buzz.wav")));
								theme.start();
								c.println("That wasn't it, try again.");
								guessCode=Integer.parseInt(c.readLine());
								guessCounter++;
							}
						}

						if (guessCode >= 3)
						{
							theme.stop();
							c.clear();
							theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("Collapse.wav")));
							theme.start();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgcollapseImage, jpgcollapseImage.getWidth(null), jpgcollapseImage.getHeight(null), null)));

							c.drawImage (jpgcollapseImage, 50, 50, 800, 600, null);
							c.println("You get the number wrong; and the tunnel collapses and you die.");
						}

						else if (guessCode == correctNumber) 
						{	
							theme.stop();
							c.clear();
							theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("Gorilla.wav")));
							theme.start();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(jpggorillaImage, jpggorillaImage.getWidth(null), jpggorillaImage.getHeight(null), null)));

							c.drawImage (jpggorillaImage, 50, 50, 800, 600, null);
							c.println("You get the number right; but the door opens and a gorilla is inside, and you die.");

						}
					}

					else if (southAnswer.equalsIgnoreCase("Use Rope"))
					{
						theme.stop();
						c.clear();
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("Hi.wav")));
						theme.start();
						//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgpersonImage, jpgpersonImage.getWidth(null), jpgpersonImage.getHeight(null), null)));

						c.drawImage (jpgpersonImage, 50, 50, 800, 600, null);
						c.println("You use the rope safely, but it makes you hungry. You continue walking and meet the stranger. ");
						c.println("The stranger named Faisal asks you: Are you lost?(Yes, No)");
						southAnswer1 = c.readLine();
						if (southAnswer1.equalsIgnoreCase("No"))
						{
							theme.stop();
							c.clear();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(pngdeadImage, pngdeadImage.getWidth(null), pngdeadImage.getHeight(null), null)));

							c.drawImage (pngdeadImage, 50, 50, 800, 600, null);
							c.println("He leaves you alone, and you try to find food, but can't find any. You starve to death");
						}
						else if (southAnswer1.equalsIgnoreCase("Yes"))
						{
							theme.stop();
							c.clear();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgcabin2Image, jpgcabin2Image.getWidth(null), jpgcabin2Image.getHeight(null), null)));

							c.drawImage (jpgcabin2Image, 50, 50, 800, 600, null);
							c.println("The stranger offers food and a place to stay. You can either accept the food and be on your way, or stay in Faisal's cabin for the night(continue, enter)");
							southAnswer2 = c.readLine();
							if (southAnswer2.equalsIgnoreCase("enter"))
							{
								theme.stop();
								c.clear();
								theme = AudioSystem.getClip();
								theme.open(AudioSystem.getAudioInputStream(new File("Knife.wav")));
								theme.start();
								//while(!(Toolkit.getDefaultToolkit().prepareImage(pngdeadImage, pngdeadImage.getWidth(null), pngdeadImage.getHeight(null), null)));

								c.drawImage (pngdeadImage, 50, 50, 800, 600, null);
								c.println("You enter Faisal's house and spend the night, as you sleep he kills you.");
							}
							else if(southAnswer2.equalsIgnoreCase("continue"))
							{
								theme.stop();
								c.clear();
								c.println("He gives you some food and you go on your way; You're tired and you either have to camp for the night or continue walking.(continue, camp)");
								southAnswer3 = c.readLine();
								if (southAnswer3.equalsIgnoreCase("continue"))
								{
									theme.stop();
									c.clear();
									theme = AudioSystem.getClip();
									theme.open(AudioSystem.getAudioInputStream(new File("Wolves.wav")));
									theme.start();
									//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgwolvesImage, jpgwolvesImage.getWidth(null), jpgwolvesImage.getHeight(null), null)));

									c.drawImage (jpgwolvesImage, 50, 50, 800, 600, null);
									c.println("As you are walking, you hear a pack of wolves.");
									c.println("You are so tired that there is nothing you can do to defendd yourself, they end up killing you.");	
								}
								else if (southAnswer3.equalsIgnoreCase("camp"))
								{
									theme.stop();
									c.clear();
									theme = AudioSystem.getClip();
									theme.open(AudioSystem.getAudioInputStream(new File("Cheer (2).wav")));
									theme.start();
									//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgclassmatesImage, jpgclassmatesImage.getWidth(null), jpgclassmatesImage.getHeight(null), null)));

									c.drawImage (jpgclassmatesImage, 50, 50, 800, 600, null);
									c.println("You camp for the night, and when you wake up it's morning. All of your classmates are surrounding you.");
									c.println("They found you! You get home safely");
								}
							}

						}
					}
				}

				else if (direction.equalsIgnoreCase("East"))
				{
					theme.stop();
					c.clear();
					while(!(Toolkit.getDefaultToolkit().prepareImage(jpgeastImage, jpgeastImage.getWidth(null), jpgeastImage.getHeight(null), null)));

					c.drawImage (jpgeastImage, 50, 50, 800, 600, null);
					c.println("You are headed east, as you are walking you see train tracks. Follow the tracks or continue into the open plains straight across(avoid, follow)");
					eastAnswer = c.readLine();
					if(eastAnswer.equalsIgnoreCase("Avoid"))
					{
						theme.stop();
						c.clear();
						//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgripImage, jpgripImage.getWidth(null), jpgripImage.getHeight(null), null)));

						c.drawImage (jpgripImage, 50, 50, 800, 600, null);
						c.println("You avoid the tracks, and walk straight ahead into a vat of quicksand, you sink and are never heard from again");
					}
					else if (eastAnswer.equalsIgnoreCase("Follow"))
					{
						theme.stop();
						c.clear();
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("Static.wav")));
						theme.start();
						//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgwarehouseImage, jpgwarehouseImage.getWidth(null), jpgwarehouseImage.getHeight(null), null)));

						c.drawImage (jpgwarehouseImage, 50, 50, 800, 600, null);
						c.println("As you are walking along the tracks, you come across an abandoned train station. ");
						c.println("You enter and almost immediately, you here weird sounds, avoid the sound it or check it out(check it out, avoid)");
						eastAnswer1 = c.readLine();
						if (eastAnswer1.equalsIgnoreCase("avoid"))
						{
							theme.stop();
							c.clear();
							theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("Knife.wav")));
							theme.start();
							while(!(Toolkit.getDefaultToolkit().prepareImage(jpgmadmanImage, jpgmadmanImage.getWidth(null), jpgmadmanImage.getHeight(null), null)));

							c.drawImage (jpgmadmanImage, 50, 50, 800, 600, null);
							c.println("You avoid the mysterious sound, but bump into the madman in the station. He kills you"); 
						}
						else if (eastAnswer1.equalsIgnoreCase("check it out"))
						{
							theme.stop();
							c.clear();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgwalkieImage, jpgwalkieImage.getWidth(null), jpgwalkieImage.getHeight(null), null)));

							c.drawImage (jpgwalkieImage, 50, 50, 800, 600, null);
							c.println("You track down the noise and find out that it was a radio making static. You use the radio to contact the police department.");
							c.println("They say they will be there by morning. Do you wait for morning and sleep in the staion or do you keep moving(move, sleep)");
							eastAnswer2 = c.readLine();

							if (eastAnswer2.equalsIgnoreCase("sleep"))
							{
								theme.stop();
								c.clear();
								theme = AudioSystem.getClip();
								theme.open(AudioSystem.getAudioInputStream(new File("Knife.wav")));
								theme.start();
								//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgripImage, jpgripImage.getWidth(null), jpgripImage.getHeight(null), null)));

								c.drawImage (jpgripImage, 50, 50, 800, 600, null);
								c.println("Little did you know, the station was a murderer's hide out, he finds and kills you while you sleep");
							}

							else if (eastAnswer2.equalsIgnoreCase("move"))
							{
								theme.stop();
								c.clear();
								theme = AudioSystem.getClip();
								theme.open(AudioSystem.getAudioInputStream(new File("Horn.wav")));
								theme.start();
								//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgtrainImage, jpgtrainImage.getWidth(null), jpgtrainImage.getHeight(null), null)));

								c.drawImage (jpgtrainImage, 50, 50, 800, 600, null);
								c.println("You continue through the station and continue to follow the tracks. As you walk the tracks are walled in, but it's the only way to go.");
								c.println("You suddenly hear a train coming, but you can't turn around. ");
								c.println("There is a panel that can switch the direction of the train, but its locked with a one digit code, you have time for about 4 guesses. Its the only way (1-7)");
								int eGuessCode = Integer.parseInt(c.readLine());
								int correctNumber2 = (int)(Math.random()* 7) + 1;
								int guessCounter2 = 0;
								while (guessCounter2 != 3 && eGuessCode != correctNumber2 ){

									if (eGuessCode != correctNumber2)	
									{
										theme.stop();
										c.clear();
										theme = AudioSystem.getClip();
										theme.open(AudioSystem.getAudioInputStream(new File("Buzz.wav")));
										theme.start();
										c.println("Wrong, try again.");
										guessCounter2++;
										eGuessCode = Integer.parseInt(c.readLine());

									}

								}
								if (guessCounter2 == 3)
								{
									theme.stop();
									c.clear();
									theme = AudioSystem.getClip();
									theme.open(AudioSystem.getAudioInputStream(new File("Hit.wav")));
									theme.start();
									//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgtrainHitImage, jpgtrainHitImage.getWidth(null), jpgtrainHitImage.getHeight(null), null)));

									c.drawImage (jpgtrainHitImage, 50, 50, 800, 600, null);
									c.println("You are of time, the train hits you and you die");

								}
								else if ( eGuessCode == correctNumber2)
								{
									theme.stop();
									c.clear();
									//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgbridgeImage, jpgbridgeImage.getWidth(null), jpgbridgeImage.getHeight(null), null)));

									c.drawImage (jpgbridgeImage, 50, 50, 800, 600, null);
									c.println("You are right, the train switch directions and you are safe. You continue following the tracks, and see a police station perpindicular to the tracks. To get to it you have to attempt to walk across an old rusty brigde. (Attempt, continue)");
									eastAnswer3 = c.readLine();
									if (eastAnswer3.equalsIgnoreCase("Continue"))
									{
										theme.stop();
										c.clear();
										//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgwalkingForeverImage, jpgwalkingForeverImage.getWidth(null), jpgwalkingForeverImage.getHeight(null), null)));

										c.drawImage (jpgwalkingForeverImage, 50, 50, 800, 600, null);
										c.println("As you are walking you see a sign that says: next stop 40 kilometers. You starve to death after walking for 4 days");

									}
									else if (eastAnswer3.equalsIgnoreCase("Attempt"))
									{
										theme.stop();
										c.clear();
										theme = AudioSystem.getClip();
										theme.open(AudioSystem.getAudioInputStream(new File("Phone.wav")));
										theme.start();
										//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgpoliceImage, jpgpoliceImage.getWidth(null), jpgpoliceImage.getHeight(null), null)));

										c.drawImage (jpgpoliceImage, 50, 50, 800, 600, null);
										c.println("You make it across the bridge and enter the police station. They help you make it home safely. YOU WIN!!");

									}
								}

							}
						}
					}
				}
				else if (direction.equalsIgnoreCase("West"))
				{
					theme.stop();
					c.clear();
					theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("Windy.wav")));
					theme.start();
					//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgforkImage, jpgforkImage.getWidth(null), jpgforkImage.getHeight(null), null)));

					c.drawImage (jpgforkImage, 50, 50, 800, 600, null);
					c.println("You approach a path with a fork in the road. One path leads to a thick, dark forest, and the other leads to a foggy swamp. Which way do you go? (forest, swamp)");
					westAnswer=c.readLine();
					if (westAnswer.equalsIgnoreCase("Swamp"))
					{
						theme.stop();
						c.clear();
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("Crocodile.wav")));
						theme.start();
						//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgswampImage, jpgswampImage.getWidth(null), jpgswampImage.getHeight(null), null)));

						c.drawImage (jpgswampImage, 50, 50, 800, 600, null);
						c.println("You go into the swamp, but you can't see through the fog, and end up tripping on a crocodile who kills you!");
					}
					else 
					{
						theme.stop();
						c.clear();
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("Sounds.wav")));
						theme.start();
						//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgforest2Image, jpgforest2Image.getWidth(null), jpgforest2Image.getHeight(null), null)));

						c.drawImage (jpgforest2Image, 50, 50, 800, 600, null);
						c.println("While you are roaming in the forest, you here eerie sounds but you can't pinpoint where it is coming from. What do you do? (hide, continue, turn around)");
						westAnswer1=c.readLine();
						if (westAnswer1.equalsIgnoreCase("Hide")){
							theme.stop();
							c.clear();
							theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("Monster.wav")));
							theme.start();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgmonsterImage, jpgmonsterImage.getWidth(null), jpgmonsterImage.getHeight(null), null)));

							c.drawImage (jpgmonsterImage, 50, 50, 800, 600, null);
							c.println("The mysterious monster finds and kills you");}
						else if (westAnswer1.equalsIgnoreCase("turn around")){
							theme.stop();
							c.clear();
							theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("Monster.wav")));
							theme.start();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgmonsterImage, jpgmonsterImage.getWidth(null), jpgmonsterImage.getHeight(null), null)));

							c.drawImage (jpgmonsterImage, 50, 50, 800, 600, null);
							c.println("The sound was coming from behind you, and the monster meets and kills you");}
						else 
						{
							theme.stop();
							c.clear();
							theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("Tired.wav")));
							theme.start();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgtiredImage, jpgtiredImage.getWidth(null), jpgtiredImage.getHeight(null), null)));

							c.drawImage (jpgtiredImage, 50, 50, 800, 600, null);
							c.println("You manage to get ahead of the culprit of the noise (for now). You're tired from running, take a break and camp, or continue moving? (camp, continue)");
							westAnswer2=c.readLine();
							if (westAnswer2.equalsIgnoreCase("continue"))
							{	theme.stop();
							c.clear();
							theme = AudioSystem.getClip();
							theme.open(AudioSystem.getAudioInputStream(new File("Monster.wav")));
							theme.start();
							//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgmonsterImage, jpgmonsterImage.getWidth(null), jpgmonsterImage.getHeight(null), null)));

							c.drawImage (jpgmonsterImage, 50, 50, 800, 600, null);
							c.println("After a few minutes, the monster gets in your way, but you are too tired to do anyything. It kills you");
							}
							else
							{
								theme.stop();
								c.clear();
								c.println("As you catch your breath, the monster finds you and approaches you. What do you do? (Fight, Talk to it, Run)");
								westAnswer3=c.readLine();
								if (westAnswer3.equalsIgnoreCase("Run")){
									theme.stop();
									c.clear();
									theme = AudioSystem.getClip();
									theme.open(AudioSystem.getAudioInputStream(new File("Monster.wav")));
									theme.start();
									//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgmonsterImage, jpgmonsterImage.getWidth(null), jpgmonsterImage.getHeight(null), null)));

									c.drawImage (jpgmonsterImage, 50, 50, 800, 600, null);
									c.println("He is faster than you, he catches up to you and then kills you");}
								else if (westAnswer3.equalsIgnoreCase("Talk to it")){
									theme.stop();
									c.clear();
									theme = AudioSystem.getClip();
									theme.open(AudioSystem.getAudioInputStream(new File("Monster.wav")));
									theme.start();
									//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgmonsterImage, jpgmonsterImage.getWidth(null), jpgmonsterImage.getHeight(null), null)));

									c.drawImage (jpgmonsterImage, 50, 50, 800, 600, null);
									c.println("There is no negotiation, it kills you.");}
								else
								{
									theme.stop();
									c.clear();
									theme = AudioSystem.getClip();
									theme.open(AudioSystem.getAudioInputStream(new File("Monstercry.wav")));
									theme.start();
									//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgrobotImage, jpgrobotImage.getWidth(null), jpgrobotImage.getHeight(null), null)));

									c.drawImage (jpgrobotImage, 50, 50, 800, 600, null);
									c.println("You pick up a rock and hit him, it dazes him and you manage to escape. You finally exit the forest and reach a cabin with a guard robot that says: ");
									c.println("'I will let you in if you figure out this riddle. What month do people sleep the least? You have four tries'");
						
									int tries = 3;
									westAnswer4=c.readLine();
									while (!westAnswer4.equalsIgnoreCase("February")&& tries > 0) 
									{
										c.println("Try again!");
										tries--;
										westAnswer4=c.readLine();
									}
									if (tries==0) {
										theme.stop();
										c.clear();
										theme = AudioSystem.getClip();
										theme.open(AudioSystem.getAudioInputStream(new File("Monster.wav")));
										theme.start();
										//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgmonsterImage, jpgmonsterImage.getWidth(null), jpgmonsterImage.getHeight(null), null)));

										c.drawImage (jpgmonsterImage, 50, 50, 800, 600, null);
										c.println("You messed up, the monster catches up to you and kills you!");
									}
									else { 
										theme.stop();
										c.clear();
										theme = AudioSystem.getClip();
										theme.open(AudioSystem.getAudioInputStream(new File("Phone.wav")));
										theme.start();
										//while(!(Toolkit.getDefaultToolkit().prepareImage(jpgphoneImage, jpgphoneImage.getWidth(null), jpgphoneImage.getHeight(null), null)));

										c.drawImage (jpgphoneImage, 50, 50, 800, 600, null);
										c.println("You enter the cabin and call your teacher; they find you and you go home.");
									}
								}
							}

						}



					}


				}



				c.println("Play again?");
				playAgain = c.readLine();
				theme.stop();
				c.clear();
			}catch(Exception e){
				c.println("ERROR OCCURED!");
			}
		}

	}
}





