/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import kareltherobot.*;

public class VeryDangerousRobot extends BetterTurnerRobot {
	
	public VeryDangerousRobot(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	public void moveIntoRobotHeaven() {
		
		faceEast();
		
		while(nextToABeeper()) {
			
			turnAround();
			pickBeeper();
			
		}
		
		while(anyBeepersInBeeperBag()) {
			
			putBeeper();
			
		}
		
		move();
		pickAllBeepers();
		turnAround();
		move();
		faceNorth();
		
	}
	
	public void pickAllBeepers() {
		
		while (nextToABeeper()) {
			
			pickBeeper();
			
		}
		
	}
}
