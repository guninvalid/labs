/**			
 * 
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: BaseballBot
 * 
**/

import kareltherobot.*;

public class BaseballBot extends BetterTurnerRobot {
	
	public BaseballBot(int st, int ave, Direction dir, int beeps) {
		
		super (st,ave, dir, beeps);
		
	}
	
	public void clearDiamond() {
		
		startPos();
		harvest2Lines();
		harvest2Lines();
		goHome();
		
	}
	
	public void startPos() {
		
		tR();
		mv();
		tA();
		
	}
	
	public void harvest2Lines() {
		
		orientFront();
		harvestLine();
		orientBack();
		harvestLine();
		
	}
	
	public void goHome() {
		
		tL();
		mv();
		mv();
		mv();
		mv();
		tL();
		mv();
		mv();
		mv();
		tL();
		
	}
	
	public void harvestLine() {
		
		mvNPk();
		mvNPk();
		mvNPk();
		//mvNPk();
		
	}
	
	public void orientFront() {
		
		mv();
		tR();
		mv();
		tR();
		pickBeeper();
		
	}
	
	public void orientBack() {
		
		tL();
		mv();
		tL();
		mv();
		pickBeeper();
		
	}
	
	public void mvNPk() {
		
		tL();
		mv();
		tR();
		mv();
		pickBeeper();
		
	}
	
	public void mv() {
		
		move();
		
	}
	
	public void tL() {
		
		turnLeft();
		
	}
	
	public void tR() {
		
		turnRight();
		
	}
	
	public void tA() {
		
		turnAround();
		
	}
	
}
