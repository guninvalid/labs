/**			
 * 
 * @Author:
 * Date: 
 * Teacher: 
 * Lab: NasaBot
 * 
**/

import kareltherobot.*;

public class NasaBot extends BetterTurnerRobot {
	
	public NasaBot(int st, int ave, Direction dir, int beeps) {
		
		super (st,ave, dir, beeps);
		
	}
	
	public void showTime() {
		
		print1();
		print0();
		printColon();
		print5();
		print2();
		
	}
	
	public void print1() {
		
		printVert0();
		printMidV0();
		printVert1();
		nextNum();
		
	}
	
	public void print2() {
		
		printVert2();
		printMidV1();
		printVert3();
		nextNum();
		
	}
	
	public void print3() {
		
		printVert4();
		printMidV1();
		printVert1();
		nextNum();
		
	}
	
	public void print4() {
		
		printVert5();
		printMidV2();
		printVert1();
		nextNum();
		
	}
	
	public void print5() {
		
		printVert3();
		printMidV1();
		printVert2();
		nextNum();
		
	}
	
	public void print6() {
		
		printVert1();
		printMidV1();
		printVert2();
		nextNum();
		
	}
	
	public void print7() {
		
		printVert6();
		printMidV3();
		printVert1();
		nextNum();
		
	}
	
	public void print8() {
		
		printVert1();
		printMidV1();
		printVert1();
		nextNum();
		
	}
	
	public void print9() {
		
		printVert3();
		printMidV1();
		printVert1();
		nextNum();
		
	}
	
	public void print0() {
		
		printVert1();
		printMidV4();
		printVert1();
		nextNum();
		
	}
	
	public void printBlank() {
		
		printVert0();
		printMidV0();
		printVert0();
		nextNum();
		
	}
	
	public void printVert0() {
		
		mv();
		mv();
		mv();
		mv();
		mv();
		nextVert();
		
	}
	
	public void printVert1() {
		
		putNMv();
		putNMv();
		putNMv();
		putNMv();
		putNMv();
		nextVert();
		
	}
	
	public void printVert2() {
		
		putNMv();
		putNMv();
		putNMv();
		mv();
		putNMv();
		nextVert();
		
	}
	
	public void printVert3() {
		
		putNMv();
		mv();
		putNMv();
		putNMv();
		putNMv();
		nextVert();
		
	}
	
	public void printVert4() {
		
		putNMv();
		mv();
		putNMv();
		mv();
		putNMv();
		nextVert();
		
	}
	
	public void printVert5() {
		
		mv();
		mv();
		putNMv();
		putNMv();
		putNMv();
		nextVert();
		
	}
	
	public void printVert6() {
		
		mv();
		mv();
		mv();
		mv();
		putNMv();
		nextVert();
		
	}
	
	public void printMidV0() {
		
		mv();
		mv();
		mv();
		mv();
		mv();
		nextVert();
		
	}
	
	public void printMidV1() {
		
		putNMv();
		mv();
		putNMv();
		mv();
		putNMv();
		nextVert();
		
	}
	
	public void printMidV2() {
		
		mv();
		mv();
		putNMv();
		mv();
		mv();
		nextVert();
		
	}
	
	public void printMidV3() {
		
		mv();
		mv();
		mv();
		mv();
		putNMv();
		nextVert();
		
	}
	
	public void printMidV4() {
		
		putNMv();
		mv();
		mv();
		mv();
		putNMv();
		nextVert();
		
	}
	
	public void printColon() {
		
		mv();
		putNMv();
		mv();
		putNMv();
		mv();
		nextVert();
		nextNum();
		
	}
	
	public void nextNum() {
		
		tR();
		mv();
		tL();
		
	}
	
	public void nextVert() {
		
		tA();
		mv();
		mv();
		mv();
		mv();
		mv();
		tL();
		mv();
		tL();
		
	}
	
	public void putNMv() {
		
		putBeeper();
		move();
		
	}
	
	public void mv() {
		
		move();
		
	}
	
	public void tL() {
		
		turnLeft();
		
	}
	
	public void tR() {
		
		turnRight();
		
	}
	
	public void tA() {
		
		turnAround();
		
	}
	
}
