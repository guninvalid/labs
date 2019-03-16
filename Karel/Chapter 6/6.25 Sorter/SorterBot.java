	/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import kareltherobot.*;

public class SorterBot extends BetterMoverRobot {
	
	public SorterBot(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	public void sortThemAll() {
		
		goToOrigin();
		faceEast();
		goToEndOfBeeperLine();
		sortLines();
		
	}
	
	public void goToEndOfBeeperLine() {
		
		while (nextToABeeper()) {
			
			move();
			
		}
		
	}
	
	public void sortLines() {
		
		while (nextLineIsEmpty()) {
			
			sortLine();
			
		}
		
	}
	
	public boolean nextLineIsEmpty() {
		
		checkNextLine();
		return anyBeepersInBeeperBag();
		
	}
	
	public void checkNextLine() {
		
		moveBackward();
		turnRight();
		move();
		turnLeft();
		
		if(nextToABeeper()) {
			
			pickBeeper();
			
		}
		
		while (frontIsClear()) {
			
			mvNPkiP();
			
		}
		
	}
	
	public void sortLine() {
		
		goToNextLine();
		putBeeper();
		
		while(anyBeepersInBeeperBag()) {
			
			mvNPut();
			
		}
		
		turnAround();
		goToEndOfBeeperLine();
		
	}
	
	public void goToNextLine() {
		
		goToWestWall();
		turnLeft();
		move();
		turnLeft();
		
		while (!nextToABeeper()) {
			
			move();
			
		}
		
		goToEndOfBeeperLine();
		moveBackward();
		turnRight();
		move();
		turnLeft();
		
	}
	
	public void goToEndPos() {
		
		goToWestWall();
		
	}
	
}
