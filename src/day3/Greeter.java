package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name;
	name= JOptionPane.showInputDialog("What is your name?");
	//System.out.println(name);
	JOptionPane.showMessageDialog(null, "Hello " + name);
	JOptionPane.showMessageDialog(null, "That's a very nice name!");
	JOptionPane.showInputDialog("What's your favorite food?");

	
}
}
