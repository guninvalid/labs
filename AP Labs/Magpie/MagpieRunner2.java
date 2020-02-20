import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MagpieRunner2 {
	
	public static void main(String[] args) throws IOException {
		
		Magpie2 magpie = new Magpie2();
		System.out.println(magpie.getGreeting());
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String statement = in.nextLine();
		
		while (!statement.equals("Bye")) {
			
			System.out.println(magpie.getResponse(statement));
			statement = in.readLine();
			
		}
		
	}

}
