/**			
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/

import kareltherobot.*;

public class AbstractRacerRobot extends BetterMoverRobot {
	
	//Usual constructor
	public AbstractRacerRobot(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	public void runRace() {
		
		//turns to the proper place
		turnRight();
		
		//while its not finished it keeps racing strides
		while(!nextToABeeper()) {
			
			raceStride();
			
		}
		
	}
	
	public void raceStride() {
		
		move();
		
	}
	
}
