/**
 * 
 * @Author:
 * Date: March 14, 2019
 * Teacher: 
 * Lab: all of them
 * 
**/

import kareltherobot.*;

public class BetterTurnerRobot extends Robot {
	
	
	//Simple base constructor. Almost every robot will have this exact constructor.
	public BetterTurnerRobot(int street, int avenue, Direction direction, int beeps) {
		
		super(st, av, dir, beeps);
		
	}
	
	//Turns right by turning left thrice.
	public void turnRight() {
		
		turnLeft();
		turnLeft();
		turnLeft();
		
	}
	
	//Turns around by turning left twice.
	public void turnAround() {
		
		turnLeft(); 
		turnLeft();
		
	}
	
	//Moves backword by turning around and moving.
	public void moveBackward() {
		
		turnAround();
		move();
		
	}
	
	//Turns left until the robot is facing west.
	public void faceWest() {
		
		while(!facingWest()) {
			
			turnLeft();
			
		}
		
	}
	
	//Turns left until the robot is facing north.
	public void faceNorth() {
		
		while(!facingNorth()) {
			
			turnLeft();
			
		}
		
	}
	
	//Turns left until the robot is facing east.
	public void faceEast() {
		
		while(!facingEast()) {
			
			turnLeft();
			
		}
		
	}
	
	//Turns left until the robot is facing south.
	public void faceSouth() {
		
		while(!facingSouth()) {
			
			turnLeft();
			
		}
		
	}
	
	//Turns to face a given direction.
	public void face(Direction dir) {
		
		switch (dirString(dir)) {
						
			case "North":	faceNorth();
							break;
			case "East":	faceEast();
							break;
			case "South":	faceSouth();
							break;
			case "West":	faceWest();
							break;
							
		}
		
	}
	
	//Private string that returns the string type of a direction.
	//Used exclusively for face(Direction dir) above.
	private String dirString(Direction dir) {
		
		if (dir.equals(North)) {
			
			return "North";
			
		} else if (dir.equals(East)) {
			
			return "East";
			
		} else if (dir.equals(South)) {
			
			return "South";
			
		} else if (dir.equals(West)) {
			
			return "West";
			
		} else {
			
			return "This shouldn't be happening!";
			
		}
		
	}
	
}
