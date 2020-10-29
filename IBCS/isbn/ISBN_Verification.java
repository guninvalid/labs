//package isbn;

import java.util.StringTokenizer;

public class ISBN_Verification {
	
	public boolean isValid(String isbn) {
		
		StringTokenizer parts = new StringTokenizer(isbn, "-");
		isbn = parts.nextToken();
		isbn += parts.nextToken();
		isbn += parts.nextToken();
		isbn += parts.nextToken();
		isbn += parts.nextToken();
		int check = 0;
		
		for (int i = 0; i < 12; i++) {
			
			if (i % 2 == 0) {
				
				check += Integer.parseInt(isbn.substring(i, i + 1));
				
			} else {
				
				check += 3 * Integer.parseInt(isbn.substring(i, i + 1));
				
			}
			
		}
		
		check = (10 - (check % 10)) % 10;
		return check == Integer.parseInt(isbn.substring(12, 13));
		
	}
	
}
