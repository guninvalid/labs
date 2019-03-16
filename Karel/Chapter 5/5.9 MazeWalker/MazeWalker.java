/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/

import kareltherobot.*;

public class MazeWalker extends BoolBot {
	
	//Usual constructor.
	public MazeWalker(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	/**
	 * 
	 * Robot will, if there is a wall, turn left. If there is no wall, 
	 * it will move 
	 * 
	**/
	
	public void followWallRight() {
		
		if (!frontIsClear()) {
			
			turnLeft();
			
		} else {
			
			move();
			
			if(rightIsClear()) {
				
				turnRight();
				move();
				
				if (rightIsClear()) {
					
					turnRight();
					move();
					
				}
				
			}
			
		}
		
	}
	
	public boolean rightIsClear() {
		
		turnLeft();
		turnLeft();
		turnLeft();
		
		if (frontIsClear()) {
			
			turnLeft();
			return true;
			
		}
		
		turnLeft();
		return false;
		
	}
	
}
