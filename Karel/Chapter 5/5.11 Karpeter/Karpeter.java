/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import kareltherobot.*;

public class Karpeter extends BetterTurnerRobot {
	
	public Karpeter(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	public void carpetRooms() {
		
		carpetPlace();
		carpetPlace();
		carpetPlace();
		carpetPlace();
		carpetPlace();
		carpetPlace();
		carpetPlace();
		carpetPlace();
		carpetPlace();
		
	}
	
	public void carpetPlace() {
		
		move();
		turnLeft();
		move();
		checkRoom();
		turnAround();
		move();
		turnLeft();
		
	}
	
	public void checkRoom() {
		
		if(!(leftIsClear() || rightIsClear() || frontIsClear())) {
			
			putBeeper();
			
		}
		
	}
	
	public boolean leftIsClear() {
		
		turnLeft();
		
		if (frontIsClear()) {
			
			turnRight();
			return true;
			
		}
		
		turnRight();
		return false;
		
	}
	
	public boolean rightIsClear() {
		
		turnRight();
		
		if (frontIsClear()) {
			
			turnLeft();
			return true;
			
		}
		
		turnLeft();
		return false;
		
	}
	
}
