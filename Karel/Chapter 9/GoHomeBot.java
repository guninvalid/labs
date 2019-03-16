/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import kareltherobot.*;

public class GoHomeBot extends BetterMoverRobot {
	
	public GoHomeBot(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	public void goHome() {
		
		goToWestWall();
		turnLeft();
		
		while(!nextToABeeper()) {
			
			move();
			
		}
		
		moveBackward();
		
	}
	
}
