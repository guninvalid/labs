/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import kareltherobot.*;

public class PickerRobot extends GoHomeBot {
	
	public int beeps;
	
	public PickerRobot(int st, int ave, Direction dir, int beeps) {
		
		super (st, ave, dir, beeps);
		beeps = 0;
		
	}
	
	public void pickStack() {
		
		while (nextToABeeper()) {
			
			beeps++;
			pkNMv();
			
		}
		
	}
	
	public void goHome() {
		
		super.goHome();
		while(nextToABeeper()) {
			
			move();
			
		}
		
	}
	
}
