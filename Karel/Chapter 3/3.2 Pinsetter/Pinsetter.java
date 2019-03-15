/**			
 * 
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: Pinsetter
 * 
**/

//I forget how this one works. I just know it did. I think.

import kareltherobot.*;

public class PinSetter extends BetterTurnerRobot {
	
	/**
	 * Constructor for objects of class Pinsetter
	 */
	public PinSetter(int st, int ave, Direction dir, int beeps) {
		
		super (st,ave, dir, beeps);
		
	}
	
	public void setPins() {
		
		setPins1247();
		setPins853();
		setPins69();
		setPins10();
		
	}
	
	public void setPins1247() {
		
		move();
		putBeeper();
		turnRight();
		setPin();
		setPin();
		setPin();
		
	}
	
	public void setPins853() {
		
		move();
		move();
		turnAround();
		putBeeper();
		turnRight();
		setPinRight();
		setPinRight();
		
	}
	
	public void setPins69() {
		
		move();
		turnRight();
		move();
		putBeeper();
		setPin();
		
	}
	
	public void setPins10() {
		
		move();
		move();
		putBeeper();
		turnLeft();
		move();
		turnLeft();
		move();
		move();
		move();
		turnLeft();
		
	}
	
	public void setPin() {
		
		turnLeft();
		move();
		turnLeft();
		move();
		turnLeft();
		turnLeft();
		putBeeper();
		
	}
	
	public void setPinRight() {
		
		turnRight();
		move();
		turnRight();
		move();
		turnAround();
		putBeeper();
		
	}
	
}
