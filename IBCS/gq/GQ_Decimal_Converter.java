//This scored a 100

//package gq;

public class GQ_Decimal_Converter {
	
	public static int toDecimal(String str) {
		
		final int L = str.length();
		int out = 0;
		
		for (int i = L - 1; 0 <= i; i--) {
			
			int digit = 0;
			
			switch (str.charAt(i)) {
				
				case '-':
					
					digit = -1;
					break;
					
				case '0':
					
					digit = 0;
					break;
					
				case '1':
					
					digit = 1;
					break;
					
				default:
					
					throw new RuntimeException("WTF is a " + String.valueOf(str.charAt(i)));
					
				
			}
			
			out += digit * ((int) Math.pow(3.0, (double) (L - i - 1)));
			
		}
		
		return out;
		
	}
	
	public static String toGQ(int num) {
		
		int len = (int) (Math.log1p(Math.abs(num)) / Math.log(3.0)) + 2;	
		String out = "";
		
		for (int i = 0; i < len; i++) {
			
			switch (num % 3) {
				
				case -2:
					
					out = "1" + out;
					num -= 3;
					break;
					
				case -1:
					
					out = "-" + out;
					break;
					
				case 0:
					
					out = "0" + out;
					break;
					
				case 1:
					
					out = "1" + out;
					break;
					
				case 2:
					
					out = "-" + out;
					num += 3;
					break;
					
				default:
					
					throw new RuntimeException("Wtf is a " + String.valueOf(num % 3));
					
				
			}
			
			num = num / 3;
			
		}
		
		if (out.charAt(0) == '0') {
			
			return out.substring(1);
			
		}
		
		return out;
		
	}
	
}
