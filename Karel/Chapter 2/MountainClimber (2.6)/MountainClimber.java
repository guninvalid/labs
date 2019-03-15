/**			
 *
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: MountainClimber
 *
**/

import kareltherobot.*;

public class MountainClimber implements Directions {
	
	public static void task(UrRobot karel) {
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.turnLeft(); //5
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.turnLeft(); //10
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move(); //15
		karel.putBeeper();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft(); //20
		//karel.move();
		//karel.turnLeft();
		//karel.move();
		//karel.turnLeft();
		//karel.turnLeft(); //25
		//karel.turnLeft();
		karel.move();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.turnLeft(); //30
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.turnOff();
		
		//add your code here
		
	}
	
}
