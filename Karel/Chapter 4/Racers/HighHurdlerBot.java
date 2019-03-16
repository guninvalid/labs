/**			
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/

import kareltherobot.*;

public class HighHurdlerBot extends HurdlerBot {
	
	//Usual constructor
	public HighHurdlerBot(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	//Basically just hops any walls that might exist
	public void raceStride() {
		
		up();
		over();
		down();
		
	}
	
	//moves upward until there is no wall to the right
	public void up() {
		
		turnLeft();
		
		while(!isRightClear()) {
			
			move();
			
		}
		
		turnRight();
		
	}
	
	//Moves downward until hitting a wall
	public void down() {
		
		turnRight();
		goToWall();
		turnLeft();
		
	}
	
	//Just moves
	public void over() {
		
		move();
		
	}
	
}
