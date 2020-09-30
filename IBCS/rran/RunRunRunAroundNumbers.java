//This scored a 100

//package rran;

public class RunRunRunAroundNumbers {
	
	public static boolean isRunRoundNumber(int num) {
		
		String s = String.valueOf(num);
		final int N = s.length();
		boolean[] sigma = new boolean[10];
		Digit[] digits = new Digit[N];
		
		for (double i = 0; i < N; i++) {
			
			int n = (num / ((int) Math.pow(10.0, i))) % 10;
			
			if (sigma[n]) {
				
				return false;
				
			}
			
			digits[N - (int) i - 1] = new Digit(n);
			sigma[n] = true;
			
		}
		
		int i = 0;
		
		for (double j = 0; j < N; j++) {
			
			if (digits[i].flag) {
				
				return false;
				
			}
			
			digits[i].flag = true;
			i += digits[i].N;
			i = i % N;
			
		}
		
		return i % N == 0;
		
	}
	
	public static int getNextRunAroundNumber(int seqNum) {
		
		while (!isRunRoundNumber(seqNum)) {
			
			seqNum++;
			
		}
		
		return seqNum;
		
	}
	
	private static class Digit {
		
		public final int N;
		public boolean flag;
		
		public Digit(int pN) {
			
			this.N = pN;
			this.flag = false;
			
		}
		
	}
	
}
