//package twoscomp;

import static twoscomp.Twos_Complement.invert;
import static twoscomp.Twos_Complement.convertToDecimal;
import static twoscomp.Twos_Complement.convertDecimalTo2sComplement;

public class Twos_ComplementTest {
	
	public static void main(String[] args) {
		
		testInvert();
		testTo2s();
		testFrom2s();
		
	}
	
	public static void testInvert() {
		
		for (Twos elem: Twos.values()) {
			
			try {
				
				elem.testInvert();
				
			} catch (Exception ex) {
				
				System.err.println("FAILED invert on " + String.valueOf(elem.value) + " with an error:");
				ex.printStackTrace(System.err);
				
			}
			
		}
		
	}
	
	public static void testTo2s() {
		
		for (Twos elem: Twos.values()) {
			
			try {
				
				elem.testTo2s();
				
			} catch (Exception ex) {
				
				System.err.println("FAILED to twos complement on " + String.valueOf(elem.value) + " with an error:");
				ex.printStackTrace(System.err);
				
			}
			
		}
		
	}
	
	public static void testFrom2s() {
		
		for (Twos elem: Twos.values()) {
			
			try {
				
				elem.testFrom2s();
				
			} catch (Exception ex) {
				
				System.err.println("FAILED from twos complement on " + String.valueOf(elem.value) + " with an error:");
				ex.printStackTrace();
				
			}
			
		}
		
	}
	
	private static enum Twos {
		
		ALLENTESTINVERT1(-7, "1001", "0111"),
		ALLENTESTINVERT2(-1, "111", "001"),
		ALLENTESTTOTWOS1(5, "00000101", "11111011"),
		ALLENTESTTOTWOS2(-3, "1111111111111101", "0000000000000011"),
		ALLENTESTFROMTWOS1(10, "01010", "10110"),
		ALLENTESTFROMTWOS2(-64 + 8 + 4 + 1, "1001101", "0110011"),
		ALLENTESTFROMTWOS3(2 + 16 + 32 + 128, "010110010", "101001110"),
		ALLENTESTFROMTWOS4(-2048 + 256 + 128 + 32 + 8 + 1, "100110101001", "011001010111"),
		
		T0000(0, "0000", "0000"),
		T0001(1, "0001", "1111"),
		T0010(2, "0010", "1110"),
		T0011(3, "0011", "1101"),
		T0100(4, "0100", "1100"),
		T0101(5, "0101", "1011"),
		T0110(6, "0110", "1010"),
		T0111(7, "0111", "1001"),
		T1000(-8, "1000", "1000"),
		T1001(-7, "1001", "0111"),
		T1010(-6, "1010", "0110"),
		T1011(-5, "1011", "0101"),
		T1100(-4, "1100", "0100"),
		T1101(-3, "1101", "0011"),
		T1110(-2, "1110", "0010"),
		T1111(-1, "1111", "0001"),
		
		;
		
		public final int value;
		public final String twos;
		public final String invert;
		
		Twos(int pvalue, String ptwos, String pinvert) {
			
			this.value = pvalue;
			this.twos = ptwos;
			this.invert = pinvert;
			
		}
		
		public void testInvert() throws Exception {
			
			String output = invert(twos);
			
			if (invert.equals(output)) {
				
				System.out.println("Succeeded invert on " + String.valueOf(value));
				
			} else {
				
				System.err.println("FAILED invert on " + String.valueOf(value) + ": tester recieved " + output + " but correct answer was " + invert);
				
			}
			
		}
		
		public void testTo2s() throws Exception {
			
			String output = convertDecimalTo2sComplement(value, twos.length());
			
			if (twos.equals(output)) {
				
				System.out.println("Succeeded to twos on " + String.valueOf(value));
				
			} else {
				
				System.err.println("FAILED to twos on " + String.valueOf(value) + ": tester recieved " + output + " but correct answer was " + twos);
				
			}
			
		}
		
		public void testFrom2s() throws Exception {
			
			int output = convertToDecimal(twos);
			
			if (value == output) {
				
				System.out.println("Succeeded from twos on " + String.valueOf(value));
				
			} else {
				
				System.err.println("FAILED from twos on " + String.valueOf(value) + "; tester recieved " + String.valueOf(output) + " but correct answer was " + String.valueOf(value));
				
			}
			
		}
		
	}
	
}
