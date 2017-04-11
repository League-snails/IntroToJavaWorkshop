package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class DrawTriangle {
	public static void main(String[] args) {
		Robot freddy=new Robot("batman");
		freddy.penDown();
		freddy.setSpeed(10);
		freddy.setPenWidth(10);
		freddy.setRandomPenColor();
		freddy.move(100);
		freddy.turn(120);
		freddy.setRandomPenColor();
		freddy.move(100);
		freddy.turn(110);
		freddy.setRandomPenColor();
		freddy.move(100);
	
		
	}

			

}
