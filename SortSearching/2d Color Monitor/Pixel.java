/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/

public class Pixel {
	
	private int red;
	private int green;
	private int blue;
	
	
	public Pixel(int r, int g, int b) {
		
		this.red = r;
		this.green = g;
		this.blue = b;
		
	}
	
	public int getRed() {
		
		return this.red;
		
	}
	
	public int getGreen() {
		
		return this.green;
		
	}
	
	public int getBlue() {
		
		return this.blue;
		
	}
	
	public void setRed(int r) {
		
		this.red = r;
		
	}
	
	public void setGreen(int g) {
		
		this.green = g;
		
	}
	
	public void setBlue(int b) {
		
		this.blue = b;
		
	}
	
	public boolean mostlyRed() {
		
		int trues = 0;
		
		if (red > green) {
			
			trues++;
			
		}
		
		if (red > blue) {
			
			trues++;
			
		}
		
		if (red >= 150) {
			
			trues++;
			
		}
		
		if (red > green + blue) {
			
			trues++;
			
		}
		
		return trues > 2;
		
	}
	
}