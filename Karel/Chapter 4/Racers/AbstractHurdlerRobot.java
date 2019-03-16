/**			
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/

import kareltherobot.*;

public abstract class AbstractHurdlerRobot extends AbstractRacerRobot {
	
	//Usual constructor
	public AbstractHurdlerRobot(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	//Goes up and then over and then down.
	public void raceStride() {
		
		up();
		over();
		down();
		
	}
	
	public abstract void up();
	
	public abstract void down();
	
	public abstract void over();
	
}
