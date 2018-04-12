package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int x=0;
		// 2.  Ask the user a question 
		String name=JOptionPane.showInputDialog(null,"what is the world based off of");
		// 3.  Use an if statement to check if their answer is correct
		String str="starbucks frappucino";
		if(str.equals("starbucks frappucino")) {
		// 4.  if the user's answer is correct
		// -- add one to their score
			x = x + 1;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		name=JOptionPane.showInputDialog(null,"why do we have to keep making questions");
		str="I do not know";
		if(str.equals("I dont know")) {
		// 6.  After all the questions have been asked, print the user's score 
	}
	}
	}

