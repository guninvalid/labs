/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	

public class MiscCollectionOfFunMethodsI {  
	
	public static int sumDigits(Integer i) {
		
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
	
	public static boolean isDivisibleBy9(Integer i) {
		
		while (i > 0) {
			
			i -= 9;
			
		}
		
		while (i < 0) {
			
			i += 9;
			
		}
		
		return i == 0;
		
	}
	
	public String toString() {
		
		return "You should change your tester so it says your name, Period X";
		
	}
	
	public static double average(int[] numbers) {
		
		double sum = 0;
		
		for (int val: numbers) {
			
			sum += (double) val;
			
		}
		
		return sum / numbers.length;
		
	}
	
	public static double average(double[] numbers) {
		
		double sum = 0;
		for (double val: numbers) {
			
			sum += val;
			
		}
		return sum / numbers.length;
		
	}
	
	public static double average(ArrayList<Double> numbers) {
		
		double sum = 0;
		for (double val: numbers) {
			
			sum += val;
			
		}
		return sum / numbers.size();
		
	}
	
	public static double standardDeviation(int[] numbers) {
		
		double avg = average(numbers);
		ArrayList<Double> differences = new ArrayList<Double>();
		
		for (int num: numbers) {
			
			double x = (double) avg - num;
			differences.add(x * x);
			
		}
		
		return Math.sqrt(average(differences));
		
	}
	
	public static int[] getDigits(int num) {
		
		char[] charArray = String.valueOf(num).toCharArray();
		int[] output = new int[charArray.length];
		
		for (int i = 0; i < charArray.length; i++) {
			
			String number = String.valueOf(charArray[i]);
			output[i] = Integer.parseInt(number);
			
		}
		
		return output;
		
	}
	
}
