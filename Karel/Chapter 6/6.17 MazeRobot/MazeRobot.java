/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import kareltherobot.*;

public class MazeRobot extends MazeWalker {
	
	public MazeRobot(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	public void escape() {
		
		while (!nextToABeeper()) {
			
			followWall();
			
		}
		
	}
	
	public void followWall() {
		
		if (isRightClear()) {
			
			turnRight();
			move();
			
		} else if (frontIsClear()) {
			
			move();
			
		} else {
			
			turnLeft();
			
		}
		
	}
	
}
