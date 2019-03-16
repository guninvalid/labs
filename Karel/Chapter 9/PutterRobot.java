/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import kareltherobot.*;

public class PutterRobot extends GoHomeBot {
	
	public PutterRobot(int st, int ave, Direction dir, int beeps) {
		
		super (st, ave, dir, beeps);
		
	}
	
	public void putStack() {
		
		while(anyBeepersInBeeperBag()) {
			
			putNMv();
			
		}
		
		goHome();
		
	}
	
	public void goHome() {
		
		super.goHome();
		while(nextToABeeper()) {
			
			move();
			
		}
		
	}
	
}
