package day3;




//Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.print.attribute.standard.PrinterLocation;
import javax.swing.JOptionPane;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	int random;

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
random= new Random().nextInt(4);

	// 3. Print out this variable
System.out.println(random);

	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Enter a yes or no question");

	// 5. If the random number is 0

	// -- tell the user "Yes"
if(random== 0){
	JOptionPane.showMessageDialog(null, "Yes!");
}

	// 6. If the random number is 1

	// -- tell the user "No"
if(random== 1){
	JOptionPane.showMessageDialog(null, "No!");
}

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"
if(random== 2){
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
}

	// 8. If the random number is 3

	// -- write your own answer
if(random== 3){
	JOptionPane.showMessageDialog(null, "My sources say maybe!");
}
}
}



