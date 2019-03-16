/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import kareltherobot.*;

import kareltherobot.*;

public class Carpeter extends BetterMoverRobot {
	
	public Carpeter(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	public int carpetHallway() {
		
		if (nextToABeeper()) {
			
			turnRight();
			return 0;
			
		} else {
		
			putBeeper();
			if (!frontIsClear()) {
				
				turnRight();
				
			}
			
			move();
			return 1 + carpetHallway();
			
		}
		
	}
	
}