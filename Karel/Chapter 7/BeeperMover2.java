/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import kareltherobot.*;

public class BeeperMover2 extends BetterMoverRobot {
	
	public BeeperMover2(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	public void moveBeepersNorth() {
		
		findStart();
		pickAndTranslateSelfToNorth();
		dropRow();
		
	}
	
	public void findStart() {
		
		if (!nextToABeeper()) {
			
			faceEast();
			move();
			findStart();
			
		} else {
			
			return;
			
		}
		
	}
	
	public void pickAndTranslateSelfToNorth() {
		
		if(nextToABeeper()) {
			
			moveBackward();
			turnRight();
			
		} else {
			
			pickBeeper();
			move();
			pickAndTranslateSelfToNorth();
			move();
			
		}
		
	}
	
	public void dropRow() {
		
		if (anyBeepersInBeeperBag()) {
			
			faceWest();	
			putBeeper();
			move();
			dropRow();
			
		} else {
			
			return;
			
		}
		
	}
	
}