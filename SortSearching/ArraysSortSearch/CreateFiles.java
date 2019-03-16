 

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
import chn.util.*;
import java.text.*;

public class CreateFiles {
	
	public static final int NUM_STUDENTS = 999;
	public static final double DEFGPA = 0.0;
	public static final String DEFNAME = "despacito";
	public static final int DEFID = 0;
	
	public static void main(String args[]) {
		
		createFile();
		
	}
	
	public static void createFile(int num, boolean gpaSame, double pgpa, 
				boolean nameSame, String pname, boolean idSame, int pid) {
		
		String fileName = "students" + num + ".txt";
		FileOutput out = new FileOutput(fileName);
		int id;
		double gpa;
		DecimalFormat fmt = new DecimalFormat("0.00");
		for (int i = 1; i <= num; i++) {
			
			id = (int) (Math.random() * 10000);
			
			if (idSame) {
				
				id = pid;
				
			} else {
				
				if (id < 1000) {
					
					id += 1000;
					
				}
				
			}
			
			if (gpaSame) {
				
				gpa = pgpa;
				
			} else {
				
				gpa = Math.random() * 100000;
				
			}
			String name = "";
			
			if (nameSame) {
				
				name = pname;
				
			} else {
				
				for (int j =1 ; j <= 10; j++) {
					
					int letDig = (int) (Math.random() * 100) % 26;
					name += (char) (letDig+'A');
					
				}
				
			}
			
			out.println(id + " " + fmt.format(gpa));
			out.println(name);
			
		}
		
		out.close();
		System.out.println(fileName + " created successfully");
		
	}
	
	public static void createFile(int n, boolean gpaSame, boolean nameSame, boolean idSame) {
		
		createFile(n, gpaSame, 0.0, nameSame, "despacito", idSame, 0);
		
	}
	
	public static void createFile(int n) {
		
		createFile(n, false, 0.0, false, "despacito", false, 0);
		
	}
	
	public static void createFile() {
		
		createFile(NUM_STUDENTS, false, 0.0, false, "despacito", false, 0);
		
	}
	
}
