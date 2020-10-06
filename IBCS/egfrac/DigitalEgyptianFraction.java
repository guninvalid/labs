//package egfrac;

import java.util.List;
import java.util.LinkedList;

public class DigitalEgyptianFraction extends Fraction {
	
	public DigitalEgyptianFraction(int b) {
		
		super(1, b);
		
	}
	
	public static Fraction addAllDigitalEgyptianFractionsInList(List<DigitalEgyptianFraction> x) {
		
		Fraction sum = new Fraction(0, 1);
		
		for (Fraction elem: x) {
			
			sum.add(elem);
			
		}
		
		return sum;
		
	}
	
	public static List<DigitalEgyptianFraction> getListOfDigitalEgyptianFractions(Fraction x) {
		
		List<DigitalEgyptianFraction> out = new LinkedList<DigitalEgyptianFraction>();
		DigitalEgyptianFraction y = new DigitalEgyptianFraction(2);
		x = new Fraction(x.numerator(), x.denominator());
		Fraction zero = new Fraction(0, 1);
		
		while (0 < x.compareTo(zero)) {
			
			if (y.compareTo(x) <= 0) {
				
				out.add(y);
				x.subtract(y);
				
			}
			
			y = new DigitalEgyptianFraction(y.denominator() * 2);
			
		}
		
		return out;
		
	}
	
}
