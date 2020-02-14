package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	System.out.println("Jayden");
	String age = JOptionPane.showInputDialog("How old are you?");
	JOptionPane.showMessageDialog(null, "I am " + age +" years old");
	
}
} 