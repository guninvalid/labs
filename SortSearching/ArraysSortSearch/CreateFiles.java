import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Note: You'll use this file to create some data files for your lab.
 * 			You just need to change the NUM_STUDENTS constant to the number of
 * 			student records you want created in the file - all else will be taken
 * 			care of for you.
 * 			Keep in mind, as you create larger and larger data sets, your account
 * 			will fill up fast. For example, I created a 500,000 record file and the
 * 			file size was 10.4Mb! (there are about 21 characters/bytes per record -
 * 			so 21 * 500,000 is about 10,000,000 bytes.
 */

public class CreateFiles {
	
	public static final int NUM_STUDENTS = 999;
	
	public static void main(String args[]) throws IOException {
		
		createFile();
		
	}
	
	public static void createFile(int num, boolean gpaSame, double pgpa, 
				boolean nameSame, String pname, boolean idSame, int pid) throws IOException {
		
		String fileName = "students" + num + ".txt";
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
		int id;
		double gpa;
		String gpaString;
		for (int i = 1; i <= num; i++) {
			
			if (idSame) {
				
				id = pid;
				
			} else {
				
				id = (int) (Math.random() * 10000);
				
			}
			
			if (gpaSame) {
				
				gpa = pgpa;
				
			} else {
				
				gpa = Math.random() * 100000;
				
			}
			
			gpaString = String.valueOf(Math.round(gpa * 100));
			gpaString = gpaString.substring(0, gpaString.length() - 2) + "." + 
						gpaString.substring(gpaString.length() - 2);
			
			String name = "";
			
			if (nameSame) {
				
				name = pname;
				
			} else {
				
				for (int j = 1; j <= 10; j++) {
					
					int letDig = (int) (Math.random() * 100) % 26;
					name += (char) (letDig + 'A');
					
				}
				
			}
			
			out.println(id + " " + gpaString);
			out.println(name);
			
		}
		
		out.close();
		System.out.println(fileName + " created successfully");
		
	}
	
	public static void createFile(int num) throws IOException {
		
		createFile(num, false, 0.0, false, "despacito", false, 0);
		
	}
	
	public static void createFile() throws IOException {
		
		createFile(NUM_STUDENTS);
		
	}
	
}
