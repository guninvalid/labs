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
		
		turnLeft(); //1
		turnLeft(); 
		turnLeft();
		move();
		turnLeft(); //5
		move();
		move();
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
		move();
		move();
		turnLeft();
		move();
		turnLeft();
		
	}
	
}
