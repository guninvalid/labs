/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/

import kareltherobot.*;

public class SteepleChaserBot extends HighHurdlerBot {
	
	//Usual constructor
	public SteepleChaserBot(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	//Kinda complicated.
	//If the robot is in front of a wall, it will go up and over it.
	//If it is not in front of a wall but is to the left of one (i.e.
	//	suspended), it will go back down.
	//Otherwise, it will continue as is.
	public void raceStride() {
		
		if(!frontIsClear()) {
			
			up();
			over();
			
		} else if(isRightClear()) {
			
			down();
			
		} else {
			
			over();
			
		}
		
	}
	
	//If there is a wall in front of the robot, it will move upward
	//and call itself again.
	public void up() {
		
		if (!frontIsClear()) {
			
			turnLeft();
			move();
			turnRight();
			up();
			
		}
		
	}
	
	//It will move downward.
	public void down() {
		
		turnRight();
		goToWall();
		turnLeft();
		
	}
	
	//It will move forward and then downward
	public void over() {
		
		move();
		down();
		
	}
	
}
