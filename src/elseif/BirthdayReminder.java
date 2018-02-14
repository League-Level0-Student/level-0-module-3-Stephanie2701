
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 9th";
		String dadsBirthday = "March 21th";
		String myBirthday = "December 27th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String x =JOptionPane.showInputDialog(null, "Do you want the birthday of mom, dad, or mine?");
	
		// 3. Print out what the user typed
		System.out.println(x);
		// 4. if user asked for "mom"
		if(x.equals("mom")) {
			System.out.println(momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(x.equals("dad")) {
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
		else if(x.equals("your name")) {
			System.out.println(myBirthday);
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("sorry");
		}

	} 
}
