/*
 *
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: HBot
 *
 */
 
 import kareltherobot.*;
 
 public class HBot implements Directions {
 	
	public static void task(UrRobot karel) {
		
		//laying down the first column of beepers
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		
		//turning right and moving to the third column
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		
		//laying the third column of beepers
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		
		//moving to the center to place the middle beeper
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		
		//placing the middle beeper
		karel.putBeeper();
		
		//returning to the starting position
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		
	}
	
}
