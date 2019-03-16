/**			
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/

import kareltherobot.*;

public class HurdlerBot extends AbstractHurdlerRobot {
	
	//Usual constructor
	public HurdlerBot(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	//Checks if there is a wall in front and moves up if it is.
	public void up() {
		
		if (!frontIsClear()) {
			
			turnLeft();
			move();
			turnRight();
			
		}
		
	}
	
	//Checks if it is next to a wall and moves downaward if it is.
	public void down() {
		
		turnRight();
		if (frontIsClear()) {
			
			move();
			
		}
		turnLeft();
		
	}
	
	//Simply moves.
	public void over() {
		
		move();
		
	}
	
}
