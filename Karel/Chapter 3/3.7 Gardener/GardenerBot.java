/**			
 * 
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: GardenerBot
 * 
**/

import kareltherobot.*;

public class GardenerBot extends BetterTurnerRobot{
	
	public GardenerBot(int st, int ave, Direction dir, int beeps) {
		
		super (st,ave, dir, beeps);
		
	}
	
	public void plantGarden() {
		
		startPos();
		plantQuarter();
		plantQuarter();
		plantQuarter();
		plantQuarter();
		goHome();
		
	}
	
	public void startPos() {
		
		tA();
		mv();
		mv();
		mv();
		
	}
	
	public void plantQuarter() {
		
		orientRight();
		plantEighth();
		putBeeper();
		tL();
		plantEighth();
		tR();
		
	}
	
	public void goHome() {
		
		tA();
		mv();
		mv();
		mv();
		
	}
	
	public void plantEighth() {
		
		mv();
		putNMv();
		putNMv();
		
	}
	
	public void orientRight() {
		
		mv();
		tR();
		
	}
	
	public void putNMv() {
		
		putBeeper();
		move();
		
	}
	
	public void mv() {
		
		move();
		
	}
	
	public void tR() {
		
		turnRight();
		
	}
	
	public void tA() {
		
		turnAround();
		
	}
	
	public void tL() {
		
		turnLeft();
		
	}
	
}
