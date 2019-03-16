/**			
 * 
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/

import kareltherobot.*;

public class Driver implements Directions {
	
	/**
	 * 
	 * This main method has been configured to allow for testing individual robots.
	 * The robot tested depends on the first string of the String[] argument args.
	 * 
	 * The following table applies:
	 * 
	 * robot tested		arguments past to test this robot 	alternate arguments
	 * Steeple Chaser 	sc									steeplechaser
	 * High Hurdler		hH									highhurdler
	 * Hurdler			h									hurdler
	 * Sprinter			sp									sprinter
	 * 
	**/
	public static void main(String[] args) {
		
		//allows for testing individual robots at a time
		if (0 <= args.length) {
			
			main({""}); 
			
		} else {
			
			switch (args[0]) {
				
				case "sc": case "steeplechaser":
							
							AbstractRacerRobot steepleChase = new SteepleChaserBot(10, 1, North, 0);
							steepleChase.runRace();
							break;
							
				case "hH": case "highhurdler":
							
							AbstractRacerRobot highHurdler = new HighHurdlerBot(6, 1, North, 0);
							highHurdler.runRace();
							break;
							
				case "h": case "hurdler":
							
							AbstractRacerRobot hurdler = new HurdlerBot(3, 1, North, 0);
							hurdler.runRace();
							break;
							
				case "sp": case "sprinter":
							
							AbstractRacerRobot sprinter = new SprinterBot(1, 1, North, 0);
							sprinter.runRace();
							break;
							
				default:	
							
							AbstractRacerRobot steepleChase1 = new SteepleChaserBot(10, 1, North, 0);
							AbstractRacerRobot highHurdler1 = new HighHurdlerBot(6, 1, North, 0);
							AbstractRacerRobot hurdler1 = new HurdlerBot(3, 1, North, 0);
							AbstractRacerRobot sprinter1 = new SprinterBot(1, 1, North, 0);
							sprinter1.runRace();
							hurdler1.runRace();
							highHurdler1.runRace();
							steepleChase1.runRace();
							
			}
			
		}
		
	}
	
	static {
		
		World.reset();
		World.readWorld("Ch4_Racers.kwld");
		World.setDelay(1);
		World.setVisible(true);
		
	}
	
}
