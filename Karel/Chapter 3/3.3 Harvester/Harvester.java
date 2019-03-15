/**			
 * 
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: Harvester
 * 
**/

import kareltherobot.*;

public class Harvester extends BetterTurnerRobot {
	
	public Harvester(int st, int ave, Direction dir, int beeps) {
		
		super (st,ave, dir, beeps);
		
	}
	
	public void harvestField() {
		
		startPos();
		harvest2Lines();
		harvest2Lines();
		harvest2Lines();
		
	}
	
	public void startPos() {
		
		tR();
		mv();
		tR();
		
	}
	
	public void harvest2Lines() {
		
		orientRight();
		harvestLine();
		orientLeft();
		harvestLine();
		
	}
	
	public void harvestLine() {
		
		pkNMv();
		pkNMv();
		pkNMv();
		pkNMv();
		pkNMv();
		
	}
	
	public void orientRight() {
		
		tR();
		mv();
		tR();
		mv();
		
	}
	
	public void orientLeft() {
		
		tL();
		mv();
		tL();
		mv();
		
	}
	
	public void pkNMv() {
		
		pickBeeper();
		mv();
		
	}
	
	public void mv() {
		
		move();
		
	}
	
	public void tR() {
		
		turnRight();
		
	}
	
	public void tL() {
		
		turnLeft();
		
	}
	
	public void tA() {
		
		turnAround();
		
	}
	
}
