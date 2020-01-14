/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/

public class ColorMonitor {
	
	private Pixel[][] monitor;
	private int rows;
	private int columns;
	
	
	public ColorMonitor(int r, int c) {
		
		this.monitor = new Pixel[r][c];
		this.rows = r - 1;
		this.columns = c - 1;
		
	}
	
	public int getNumRows() {
		
		return this.rows;
		
	}
	
	public int getNumCols() {
		
		return this.columns;
		
	}
	
	public void setPixel(int r, int c, Pixel p) {
		
		this.monitor[r][c] = p;
		
	}
	
	public Pixel getPixel(int r, int c) {
		
		return this.monitor[r][c];
		
	}
	
	public int numMostlyRed() {
		
		int count = 0;
		
		for (Pixel[] row: monitor) {
			
			for (Pixel elem: row) {
				
				if (elem.mostlyRed()) {
					
					count++;
					
				}
				
			}
			
		}
		
		return count;
		
	}
	
	public void darken(int someValue) {
		
		for (Pixel[] row: monitor) {
			
			for (Pixel elem: row) {
				
				elem.setBlue(Math.min(elem.getBlue() + someValue, 255));
				elem.setGreen(Math.min(elem.getGreen() + (someValue / 2), 255));
				
			}
			
		}
		
	}
	
	
	public boolean isBrightSpot(int r, int c) {
		
		final int BOUND = 1;
		int curRed = monitor[r][c].getRed();
		int curBlue = monitor[r][c].getBlue();
		int curGreen = monitor[r][c].getGreen();
		int greenAverage = 0;
		int surrounding = 0;
		Pixel elem;
		int elemRed;
		int elemGreen;
		int elemBlue;
		
		for (int i = Math.max(r - BOUND, 0); i <= Math.min(rows, r + BOUND); i++) {
			
			for (int j = Math.max(c - BOUND, 0); j <= Math.min(columns, c + BOUND); j++) {
				
				elem = monitor[i][j];
				elemRed = elem.getRed();
				elemGreen = elem.getGreen();
				elemBlue = elem.getBlue();
				
				if (i == r && j == c) {
					
					continue;
					
				}
				
				if (curRed <= elemRed) {
					
					return false;
					
				}
				
				if (curBlue >= elemBlue) {
					
					return false;
					
				}
				
				greenAverage += elemGreen;
				surrounding++;
				
			}
			
		}
		
		greenAverage /= surrounding;
		return curGreen > greenAverage;
		
	}

}
