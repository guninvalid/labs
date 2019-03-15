/**			
 * 
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: Arranger
 * 
**/

import kareltherobot.*;
/**
 * Write a description of class Pinsetter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrangerBot extends BetterTurnerRobot {
	
	public ArrangerBot(int st, int ave, Direction dir, int beeps) {
		
		super (st,ave, dir, beeps);
		
	}
	
	public void arrangeBeepers() {
		
		arrangeQuarter();
		arrangeQuarter();
		arrangeQuarter();
		arrangeQuarter();
		
	}
	
	public void arrangeQuarter() {
		
		mvNPut();
		mvNPut();
		mvNPut();
		turnLeft();
		
	}
	
	public void mvNPut() {
		
		putBeeper();
		move();
		
	}
	
}
