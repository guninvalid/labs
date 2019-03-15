/**
 * 
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: all of them
 * 
**/

public class BoolBot extends BetterTurnerRobot {
	
	//Simple constructor. Nothing special.
	public BoolBot(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	//Function which returns whether there is a wall to the left of the robot.
	public boolean isLeftClear() {
		
		boolean output = false;
		turnLeft();
		output = frontIsClear();
		turnRight();
		return output;
		
	}
	
	//Function whwich returns whether there is a wall to the right of the robot.
	public boolean isRightClear() {
		
		boolean output = false;
		turnRight();
		output = frontIsClear();
		turnLeft();
		return output;
		
	}
	
}
