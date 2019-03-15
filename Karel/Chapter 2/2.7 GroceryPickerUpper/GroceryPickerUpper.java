/**			
 *
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: GroceryPickerUpper
 *
**/

import kareltherobot.*;

public class GroceryPickerUpper implements Directions {
	
	public static void task(UrRobot karel)  {
		
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.pickBeeper();
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		karel.move();
		karel.move();
		
	}
	
}
