/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import kareltherobot.*;

public class WestWallBeeperGetter extends BetterMoverRobot {
	
	public WestWallBeeperGetter(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	public void getBeeper() {
		
		faceWest();
		
		if (frontIsClear()) {
			
			move();
			getBeeper();
			move();
			
		} else {
			
			pickBeeper();
			turnAround();
			
		}
		
	}
	
}
