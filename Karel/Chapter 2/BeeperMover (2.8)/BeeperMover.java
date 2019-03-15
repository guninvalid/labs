/**			
 *
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: HBot
 *
**/

import kareltherobot.*;
import java.awt.Color;

public class BeeperMover implements Directions {
	
	public static void task(UrRobot karel) {
		
		//It's been several months, I can't remember what this problem was
		//so I can't be bothered to add in comments explaining what everything does
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.pickBeeper();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.pickBeeper();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.pickBeeper();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		
	}
	
}
