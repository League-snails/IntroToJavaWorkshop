import org.jointheleague.graphical.robot.Robot;

public class MoveRobot {
public static void main(String[] args) {
	Robot robert=new Robot("batman");
	robert.penDown();
	robert.setSpeed(10);
	robert.setPenWidth(20);
	robert.setRandomPenColor();
	robert.move(100);
	robert.setRandomPenColor();
	robert.turn(90);
	robert.move(100);
	robert.setRandomPenColor();
	robert.turn(90);
	robert.move(100);
	robert.setRandomPenColor();
	robert.turn(90);
	robert.move(100);
	robert.setRandomPenColor();
	robert.turn(270);
	robert.move(100);
	
}
}
