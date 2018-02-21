//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101)+1;
	
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
				String x=JOptionPane.showInputDialog("guesss");
				

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int bot= Integer.parseInt(x);
			// 5. if the guess is correct
			if(random==bot) {
				System.exit(0);
			}
				// 6. Win
			
				// 11. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			if(bot>random) {
				// 8. Tell them it's too high
				System.out.println("it's too high");
			}
			// 9. if the guess is low
			if(bot<random) {
				System.out.println("It's too low");
			}
				// 10. Tell them it's too low

		// 12. Tell them they lose
			System.out.println("you lose");
		
	}

}


