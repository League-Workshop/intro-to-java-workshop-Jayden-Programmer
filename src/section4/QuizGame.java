package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String input = JOptionPane.showInputDialog("How was your day?");
		String input2 = JOptionPane.showInputDialog("Are you a good person?");
		String input3 = JOptionPane.showInputDialog("Do you like Java?");
	
		// 3. Use an if statement to check if their answer is correct
		JOptionPane.showMessageDialog(null, "good job!");
		// 4. if the user's answer was correct, add one to their score
		if (input.equalsIgnoreCase("bad")) {

		} else if (input.equalsIgnoreCase("good")) {
			score++;

		}

		if (input2.equalsIgnoreCase("bad")) {
			score++;
		}

		else if (input2.equalsIgnoreCase("good")) {
			JOptionPane.showMessageDialog(null, ("liar"));
			score--;

		}

		if (input3.equalsIgnoreCase("bad")) {
			score--;
			
			
		}
		
		else if (input3.equalsIgnoreCase("good")) {
			score++;
		}
		
		
		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		// 6. After all the questions have been asked, print the user's score
		JOptionPane.showMessageDialog(null, "congradulations! your score is "+ score);
	}
}
