//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.security.SecurityPermission;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		for (int i = 0; i <10000; i++) {
			
			
		
		
		Robot robot = new Robot("mini");

		//3. Ask the user what color they would like the robot to draw
		String c= JOptionPane.showInputDialog(null,"what color would you like the robot red, blue or green?" );
		//4. Use an if/else statement to set the pen color that the user requested
		if(c.equals("red")){
			robot.setPenColor(Color.RED);         
		
			}
		else if(c.equals("blue")) {
			robot.setPenColor(Color.BLUE);
		}
		
		else if(c.equals("green")){
			robot.setPenColor(Color.GREEN);
			
		}

        //5. If the user doesn’t enter anything, choose a random color
		
	if (c.equals("")){
	robot.setRandomPenColor();
	}

        //6. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
	robot.setPenWidth(10);
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
	robot.penDown();
	robot.move(20);
	robot.turn(90);
	robot.move(20);
	robot.turn(90);
	robot.move(20);
	robot.turn(90);
	robot.move(20);
	robot.turn(90);

		}
	}
}
