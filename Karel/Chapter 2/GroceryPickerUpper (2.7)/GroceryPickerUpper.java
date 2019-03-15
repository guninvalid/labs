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
		
		karel.turnLeft(); //1
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.turnLeft(); //5
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move(); //10
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.pickBeeper();
		karel.turnLeft(); //15
		karel.move();
		karel.pickBeeper();
		karel.move();
		karel.turnLeft();
		karel.move(); //20
		karel.pickBeeper();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move(); //25
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		karel.move();
		karel.move(); //30
		
	}
	
}
