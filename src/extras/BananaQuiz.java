//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String x=JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, e
		if(x.equals("no")) {
			//tell them they are crazy 
			//and end quiz
			System.out.println("you are crazy");
			System.exit(0);
		}
		//3. if they say yes
			else if(x.equals("yes")) {
				JOptionPane.showInputDialog("what is your favorite hobby?");
			
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
				System.out.println("Your hobby is much better with bananas!");
			
		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
	
	}

}
	}

