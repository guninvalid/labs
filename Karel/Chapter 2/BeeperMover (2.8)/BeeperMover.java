/**
 * Write a description of class BeeperMover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import kareltherobot.*;
import java.awt.Color;

public class BeeperMover implements Directions {
	
	public static void task(UrRobot karel) {
		
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
