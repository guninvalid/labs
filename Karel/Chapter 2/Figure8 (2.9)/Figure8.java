/**			
 *
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: HBot
 *
**/

import kareltherobot.*;

public class Figure8 extends UrRobot {
	
	public Figure8(int s, int a, Direction dir, int beeps) {
		
		super(s, a, dir, beeps);
		
	}
	
	public void task() {
		
		//turns to move to the right side of the 8
		turnLeft(); //1
		turnLeft(); 
		turnLeft();
		move();
		
		//turns to move up to the middle
		turnLeft(); //5
		move();
		move();
		
		//turns to move through the middle to the middle of the left side of the 8
		turnLeft();
		move();
		move();
		
		//turns around the middle beeper
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		move();
		
		//turns back to the middle of the 8
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		move();
		
		//moves around back to starting point around beeper
		turnLeft();
		move();
		move();
		turnLeft();
		move();
		turnLeft();
		
	}
	
}
