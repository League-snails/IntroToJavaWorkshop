package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

 
public static void main(String[] args) {String speak; 
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
	speak("spell mandlebrot");
	speak= JOptionPane.showInputDialog("Write word here");
	


		
		
		

		// 2. Catch the user's answer in a String
	
	

		// 3. If the user spelled the word correctly, speak "correct"
	if(speak.equals("mandlebrot")){ 
		speak("correct!");
	}

		// 4. Otherwise say "wrong"
	else{ speak("YOU'RE WRONG!");
		
	}

		// 5. repeat the process for other words
	speak("spell supercalifragilisticexpialidocious");
	speak=JOptionPane.showInputDialog("Write word here");
	if(speak.equals("supercalifragilisticexpialidocious")){
	speak("correct!");
	}
	else{ 
		speak("You're Wrong!");
		
	}
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


