/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/

import java.util.ArrayList;

public class MiscCollectionOfFunMethodsI {  
	
	public static int sumDigits(int i) {
		
		int sum = 1;
		int len = String.valueOf(Math.abs(i)).length() - 1;
		int temp;
		
		for (int k = len; k >= 0; k--) {
			
			temp = i / (int)Math.pow(10, k);
			sum += temp;
			i -= temp * (int) Math.pow(10,k);
			
		}
		
		return Math.abs(sum);
		
	}
	
	public static boolean isDivisibleBy9(int i) {
		
		while (i > 0) {
			
			i -= 9;
			
		}
		
		while (i < 0) {
			
			i += 9;
			
		}
		
		return i == 0;
		
	}
	
	public String toString() {
		
		//Change this line to the format given
		return "<name>, Period <period number>";
		
	}
	
	public static double average(int[] numbers) {
		
		double sum = 0;
		
		for (int val: numbers) {
			
			sum += (double) val;
			
		}
		
		return ((double) sum) / ((double) numbers.length);
		
	}
	
	public static double average(double[] numbers) {
		
		double sum = 0;
		
		for (double val: numbers) {
			
			sum += val;
			
		}
		
		return sum / ((double) numbers.length);
		
	}
	
	public static double average(ArrayList<Double> numbers) {
		
		double sum = 0;
		
		for (double val: numbers) {
			
			sum += val;
			
		}
		
		return sum / ((double) numbers.size());
		
	}
	
	public static double standardDeviation(int[] numbers) {
		
		double avg = average(numbers);
		ArrayList<Double> differences = new ArrayList<Double>();
		
		for (int num: numbers) {
			
			double x = (double) avg - num;
			differences.add(x * x);
			
		}
		
		return (double) Math.sqrt(average(differences));
		//I've been told this doesn't compile without the cast even though it compiles on my end ¯\_(ツ)_/¯
		
	}
	
	public static int[] getDigits(int num) {
		
		char[] characters = String.valueOf(num).toCharArray();
		int[] output = new int[characters.length];
		
		for (int i = 0; i < characters.length; i++) {
			
			String number = String.valueOf(characters[i]);
			output[i] = Integer.parseInt(number);
			
		}
		
		return output;
		
	}
	
}
