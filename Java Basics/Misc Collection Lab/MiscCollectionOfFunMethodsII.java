/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import java.util.*; 
/**
 * Write a description of class MiscCollectionOfFunMethods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiscCollectionOfFunMethodsII {
	
	public static int uglyNumberGetter(int n) {
		
		int i = 0;
		for (int c = 1; c < n; c++) {
			
			while (!isUglyNumber(i)) {
				
				i++;
				
			}
			
			i++;
			
		}
		return i;
		
	}
	
	public static boolean isUglyNumber(int n) {
		
		double num = (double) n;
		
		while (num % 5 == 0) {
			
			num /= 5;
			
		}
		
		while (num % 3 == 0) {
			
			num /= 3;
			
		}
		
		while (num % 2 == 0) {
			
			num /= 2;
			
		}
		
		return num == 1;
		
	}
	public static void compact (Object[] array, Object item) {
		
		Object tmp = new Object();
		int e = array.length - 1;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i].equals(item)) {
				
				array[i] = tmp;
				e--;
				
			}
			
		}
		
		for (int i = 0; i < vec.length; i++) {
			
			if (vec[i].equals(tmp)) {
				
				for (int j = i; j < vec.length - 1; j++) {
					
					vec[j] = vec[j + 1];
					 
				}
				
			}
			
		}
		
		for (int i = vec.length - 1; i > e; i--) {
			
			vec[i] = null;
			
		}
		
	}
	
	public static String carRentalCode(String licensePlate) {
		
		char[] plate = licensePlate.toCharArray();
		String o = "";
		int sum = 0;
		
		for (char c: plate) {
			
			if ((int) c < 60) {
				
				sum += ((int) c) - 48;
				
			} else {
				
				sum += (int) c;
				
			}
			
			if (c >= 60) {
				
				o += c;
				
			}
			
		}
		
		o = (char) (sum % 26 + 65) + String.valueOf(sum) + o.toLowerCase();
		
		return o; 
		
	}
	
	public static boolean isPrimeNumber(int n) {
		
		for (int i = 2; i <= (int) (Math.sqrt((double) n) + 1.0); i++) {
			
			if (n % i == 0){
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
		
	public static int[] primeNumberGenerator(int from, int to) {
		
		int[] output = new int[2];
		output[0] = 0;
		output[1] = 0;
		int i = from - 1;
		
		while (i <= to) {
			
			if (isPrimeNumber(i)) {
				
				output[0]++;
				output[1] = i;
				
			}
			
			i++;
			
		}
		
		return output;
		
	}
	

	public String toString() {
		// postcondition:   return a String with YOUR name and class period in it
		return "You should change your tester so it says your name, Period X";
	}
	
	public static boolean isUnitSummation(int n) {
		
		int[] num = getDigits(n);
		int sum = 0;
		for (int number: num) {
			
			sum += number;
			
		}
		
		return sum == 2*num[num.length-1];
		
	}
   
	public static int[] getUnitSummationBetween(int first, int last) {

		int[] output = new int[0];
		int[] temp = output;
		for (int i = first; i <= last; i++) {
			
			if (isUnitSummation(i)) {
				
				temp = output;
				output = new int[temp.length + 1];
				for (int j = 0; j < temp.length; j++) {
					
					output[j] = temp[j];
					
				}
				output[output.length - 1] = i;
				
			}
			
		}
		
		return output;
		
	}
	
	public static int[] getDigits(int num) {
		
		int[] output = new int[0];
		int len = 0;
		for (int i = 0; len == 0; i++) {
			
			if (Math.abs(num) < Math.pow(10, i)) {
				
				output = new int[i];
				len = i - 1;
				
			}
			
		}
		
		int temp;
		for (int k = len; k >= 0; k--) {
			
			 temp = num / (int)Math.pow(10, k);
			 output[len - k] = temp;
			 num -= temp * (int) Math.pow(10,k);
			 
		}
		return output;
		
	}
	
}
