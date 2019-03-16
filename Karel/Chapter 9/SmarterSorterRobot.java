/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/

import kareltherobot.*;
import java.util.Arrays;

public class SmarterSorterRobot extends GoHomeBot {
	
	public int avenues;
	public int[] beepers;
	public PickerRobot[] pickers;
	
	public SmarterSorterRobot(int st, int ave, Direction dir, int beeps) {
		
		super (st,ave, dir, beeps);
		avenues = 0;
		beepers = null;
		pickers = null;
		
	}
	
	public void sortBeepers() {
		
		goToWestWall();
		goToSouthWall();
		turnLeft();
		
		while(nextToABeeper()) {
			
			move();
			avenues++;
			
		}
		
		pickers = new PickerRobot[avenues];
		beepers = new int[avenues];
		
		for (int i = 1; i <= avenues; i++) {
			
			pickers[i] = new PickerRobot(1, i, North, 0);
			
		}
		
		for (PickerRobot picker: pickers) {
			
			picker.pickStack();
			
		}
		
		for (int i = 0; i < avenues; i++) {
			
			beepers[i] = pickers[i].beeps;
			
		}
		
		Arrays.sort(beepers);
		
		for (int i = 1; i <= beepers.length; i++) {
			
			new PutterRobot(1, i, North, beepers[i - 1]).putStack();
			
		}
		
		for (PickerRobot picker: pickers) {
			
			picker.goHome();
			
		}
		
		super.goHome();
		
		while(nextToABeeper()) {
			
			move();
			
		}
		
	}
	
}
