/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import kareltherobot.*;

public class DifferentSteepleChaser extends BetterTurnerRobot {
	
	public DifferentSteepleChaser(int street, int avenue, Direction direction, int beepers) {
		
		super(street, avenue, direction, beepers);
		
	}
	
	public void runRace() {
		
		move();
		
		for (int i = 0; i < 8; i++) {
			
			jumpSteeple();
			
		}
		
	}
	
	public void jumpSteeple() {
		
		turnLeft();
		
		for (int i = 0; i < 3 && nextToABeeper(); i++) {
			
			pickBeeper();
			move();
			
		}
		
		turnAround();
		
		while (frontIsClear()) {
			
			move();
			
		}
		
		turnLeft();
		
	}
	
}
