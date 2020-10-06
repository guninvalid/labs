//package egfrac;

import java.util.List;

public class Fraction implements Comparable<Fraction> {
	
	private int num;
	private int denom;
	
	public Fraction(int pnum, int pdenom) {
		
		if (pdenom == 0) {
			
			throw new IllegalArgumentException("A fraction's denominator cannot be zero!");
			
		}
		
		this.num = pnum;
		this.denom = pdenom;
		this.simplify();
		
	}
	
	public int compareTo(Fraction y) {
		
		return new Integer(this.num * y.denom).compareTo(new Integer( y.num * this.denom));
		
	}
	
	@Deprecated public int getTop() {
		
		return numerator();
		
	}
	
	public int numerator() {
		
		return this.num;
		
	}
	
	@Deprecated public int getBottom() {
		
		return denominator();
		
	}
	
	public int denominator() {
		
		return this.denom;
		
	}
	
	public double getDecimal() {
		
		return ((double) num) / ((double) denom);
		
	}
	
	public static Fraction addAllFractionsInList(List<Fraction> x) {
		
		Fraction sum = new Fraction(0, 1);
		
		for (Fraction elem: x) {
			
			sum.add(elem);
			
		}
		
		return sum;
		
	}
	
	public void subtract(Fraction y) {
		
		add(new Fraction(-1 * y.num, y.denom));
		
	}
	
	public void add(Fraction y) {
		
		this.num = this.num * y.denom + y.num * this.denom;
		this.denom = this.denom * y.denom;
		this.simplify();
		
	}
	
	public void multiply(Fraction y) {
		
		this.denom = this.denom * y.denom;
		this.num = this.num * y.num;
		this.simplify();
		
	}
	
	public boolean equals(Object param) {
		
		if (!(param instanceof Fraction)) {
			
			return false;
			
		}
		
		Fraction y = (Fraction) param;
		Fraction x = new Fraction(this.num, this.denom);
		y = new Fraction(y.num, y.denom);
		x.simplify();
		y.simplify();
		return x.num == y.num && x.denom == y.denom;
		
	}
	
	public String toString() {
		
		return String.valueOf(num) + " / " + String.valueOf(denom);
		
	}
	
	public void simplify() {
		
		int gcd = gcd(num, denom);
		num = num / gcd;
		denom = denom / gcd;
		
		if (denom < 0) {
			
			num = num * -1;
			denom = denom * -1;
			
		}
		
	}
	
	public static int gcd(int a, int b) {
		
		while (b != 0) {
			
			 a = a % b;
			 int tmp = b;
			 b = a;
			 a = tmp;
			
		}
		
		return a;
		
	}
	
}
