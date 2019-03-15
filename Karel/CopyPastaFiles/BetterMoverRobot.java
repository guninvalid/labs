/**			
 * 
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: all of them
 * 
**/

public class BetterMoverRobot extends BoolBot {
	
	//Simple constructor. The usual stuff.
	public BetterMoverRobot(int st, int ave, Direction dir, int beeps) {
		
		super(st, ave, dir, beeps);
		
	}
	
	//Function that will move forward until a wall is found.
	public void goToWall() {
		
		while (frontIsClear()) {
			
			move();
			
		}
		
	}
	
	//Functions that will move westward until a wall is found.
	public void goToWestWall() {
		
		faceWest();
		goToWall()
		
	}
	
	//Function that will move northward until a wall is found.
	public void goToNorthWall() {
		
		faceNorth();
		goToWall();
		
	}
	
	//Function that will move southward until a wall is found.
	public void goToSouthWall() {
		
		faceSouth();
		goToWall();
		
	}
	
	//Function that will move eastward until a wall is found.
	public void goToEastWall() {
		
		faceEast();
		goToWall();
		
	}
	
	//Function that will go to the origin by going to the south wall and
	//then to the west wall. It will terminate facing north.
	public void goToOrigin() {
		
		goToSouthWall();
		goToWestWall();
		turnRight();
		
	}
	
	//Function that will move a given amount of steps and place a beeper.
	//move and put
	public void mvNPut(int times) {
		
		mvT(times);
		putBeeper();
		
	}
	
	//Function that will  move a given amount of steps and pick a beeper.
	//move and pick
	public void mvNPk(int times) {
		
		mvT(times);
		pkBp();
		
	}
	
	//Function that will move a given amount of steps and place a beeper
	//if it has one to place.
	//move and put if possible
	public void mvNPutiP(int times) {
		
		mvT(times);
		putBpiP();
		
	}
	
	//Function that will move a given amount of steps and pick a beeper 
	//if there is one.
	//move and pick if possible
	public void mvNPkiP(int times) {
		
		mvT(times);
		pkBpiP();
		
	}
	
	//Function that will pick up a beeper it is standing on if that beeper exists.
	//pick beeper if possible
	public void pkBpiP() {
		
		if (nextToABeeper()) {
			
			pickBeeper();
			
		}
		
	}
	
	//Function that will place a beeper if it has one to place.
	//put beeper if possible
	public void putBpiP() {
		
		if(anyBeepersInBeeperBag()) {
			
			putBeeper();
			
		}
		
	}
	
	/**
	 * 
	 * Some of the following are single move versions of the prior methods.
	 * They carry different method signatures as these do not have an int
	 * parameter, while the prior ones mostly do.
	 * 
	**/
	
	//Function that moves once and picks a beeper.
	//move and pick
	public void mvNPk() {
		
		move();
		pickBeeper();
		
	}
	
	//Function that moves once and puts a beeper.
	//move and put
	public void mvNPut() {
		
		move();
		putBeeper();
		
	}
	
	//Function that moves once and picks a beeper if there is one.
	//move and pick if possible
	public void mvNPkiP() {
		
		move();
		pkBpiP();
		
	}
	
	//Function that moves once and places a beeper if there is one.
	//move and put if possible
	public void mvNPutiP() {
		
		move();
		putBpiP();
		
	}
	
	//Function that picks a beeper and moves once.
	//pick and move
	public void pkNMv() {
		
		pickBeeper();
		move();
		
	}
	
	//Function that will place a beeper move forward.
	//put and move
	public void putNMv() {
			
		putBeeper();
		move();
		
	}
	
	//Function that moves a given number of spaces.
	public void mvT(int amount) {
		
		for (int i = amount; i > 0; i--) {
			
			move();
			
		}
		
	}
	
}
