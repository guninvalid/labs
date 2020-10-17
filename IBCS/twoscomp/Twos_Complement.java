//package twoscomp;

public class Twos_Complement {
	
	public static int convertToDecimal(String s) {
		
		char[] twos = s.toCharArray();
		final int N = twos.length;
		int pow = twoto(N - 1);
		int out = 0;
		
		if (twos[0] == '1') {
			
			out -= pow;
			
		}
		
		pow /= 2;
		
		for (int i = 1; i < N; i++) {
			
			if (twos[i] == '1') {
				
				out += pow;
				
			}
			
			pow /= 2;
			
		}
		
		return out;
		
	}
	
	public static String convertDecimalTo2sComplement(int val, int bits) {
		
		char[] out = new char[bits];
		
		if (val < 0) {
			
			out[0] = '1';
			val += twoto(bits);
			
		} else {
			
			out[0] = '0';
			
		}
		
		for (int i = out.length - 1; 0 < i; i--) {
			
			if (val % 2 == 1) {
				
				out[i] = '1';
				
			} else {
				
				out[i] = '0';
				
			}
			
			val /= 2;
			
		}
		
		return String.copyValueOf(out);
		
	}
	
	public static String invert(String s) {
		
		return convertDecimalTo2sComplement(-1 * convertToDecimal(s), s.length());
		
	}
	
	public static int twoto(int n) {
		
		int out = 1;
		
		for (int i = 0; i < n; i++) {
			
			out *= 2;
			
		}
		
		return out;
		
	}
	
}
