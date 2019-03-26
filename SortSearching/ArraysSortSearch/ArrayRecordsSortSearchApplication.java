/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRecordsSortSearchApplication {
	
	private static final String STUDENT_FILENAME = "students999.txt";
	
	//Main method.
	public static void main(String args[]) {
		
		Student[] sortedStudents = null;
		ClassPeriod p1 = new ClassPeriod("PERIOD 1");
		readClass(p1);
		
		//The console reader. The APCSA teachers used chn.util for this but I opted 
		//to use a buffered reader instead. Note that you can also use a buffered reader
		//instead on the magpie lab you'll probably do later.
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		//Apparently it is necessary for me to do this definition rather than 
		//just leaving it as char choice;
		char choice = '-';
		
		//Keeps showing menu again until user chooses 8 (8 is the quit option).
		while (choice != '8') {
			
			showMenu();
			
			//Reads an option. If the option is longer than one character
			//it will only read the first character. If the option is empty
			//it will say that the human has not entered a choice and reset 
			//the matrix.
			try {
				
				choice = console.readLine().charAt(0);
				
			} catch (StringIndexOutOfBoundsException | IOException ex) {
				
				System.out.println("You must enter a choice...");
				continue;
				
			}
			
			System.out.println();
			
			//The super mega useful switch that does everything.
			switch (choice) {
				
				//Creates a file using CreateFiles.
				case '0':
						
						createFile(console);
						break;
						
				//Outputs to console the students straight from the class.
				case '1':
						
						sortedStudents = p1.getStudents();
						showStudents(sortedStudents);
						break;
						
				//Reads a new class using human input for a different file.
				case '2':
						
						System.out.println("Print name of file:");
						try {
							
							readClass(p1, console.readLine());
							
						} catch (IOException e) {
							
							System.out.println("That file (probably) doesn't exist!");
							
						}
						break;
						
				//Sorts the current class using Arrays.sort.
				case '3':
						
						sortedStudents = p1.getStudents();
						sortViaArraysClass(sortedStudents);
						break;
						
				//Sorts the current class using insertion sort as implemented
				//by the human.
				case '4':
						
						sortedStudents = p1.getStudents();
						sortViaInsertion(sortedStudents);
						break;
						
				//Sorts the current class using selection sort as implemented
				//by the human.
				case '5':
						
						sortedStudents = p1.getStudents();
						sortViaSelection(sortedStudents);
						break;
						
				//Sorts the current class using merge sort as implemented by
				//the human.
				case '6':
						
						sortedStudents = p1.getStudents();
						sortViaMerge(sortedStudents);
						break;
						
				//Shows the current state of students, sorted or otherwise.
				case '7':
						
						showStudents(sortedStudents);
						break;
						
				//Ends the matrix. Note that the work is not done here but in 
				//the while loop from the start.
				case '8':
						
						System.out.println("Byeeeeeeeeeeeeee");
						break;
						
				//Continues if the choice is not a whole number from 0 to 8.
				default:
						
						System.out.println("That's not a choice!");
						break;
						
			}
		}
	}
	
	//Prints the menu.
	public static void showMenu() {
		
		String nameOfUserOnThisMachine = System.getProperties().getProperty("user.name");
		System.out.println("\nHello " + nameOfUserOnThisMachine + "!");
		System.out.println();
		System.out.println("0) Create new file using CreateFiles");
		System.out.println("1) Show students in original order");
		System.out.println("2) Recreate class from a different file");
		System.out.println("3) Sort via sort in Arrays Class");
		System.out.println("4) Sort via Insertion");
		System.out.println("5) Sort via Selection");
		System.out.println("6) Sort via Merge");
		System.out.println("7) Show students in current order (sorted or otherwise)");
		System.out.println("8) Quit?");
		System.out.print("choice: ");
		
	}
	
	//Prints the students in the argument.
	public static void showStudents(Student[] students) {
		
		for (int i = 0; i < students.length; i++) {
			
			System.out.println(students[i]);
			
		}
		
	}
	
	//Overloading statement.
	public static void readClass(ClassPeriod p1) {
		
		readClass(p1, STUDENT_FILENAME);
		
	}
	
	//Reads to p1 the class in file filename.
	public static void readClass(ClassPeriod p1, String filename) {
		
		//These test to make sure thre file exists. If it doesn't,
		//it ends the loop and says so.
		File tmp = new File(filename);
		
		if (!tmp.exists()) {
			
			System.out.println("That file does not exist!");
			return;
			
		}
		
		System.out.println("Please wait while data file loads...");
		p1.clear();
		BufferedReader in;
		
		//
		try {
			
			in = new BufferedReader(new FileReader(tmp));
			
		} catch (FileNotFoundException e) {
			
			System.out.println("This is an actual bug. Code 1");
			e.printStackTrace();
			return;
			
		}
		
		while (true) {
			
			try {
				
				StringTokenizer numLine = new StringTokenizer(in.readLine());
				int id = Integer.parseInt(numLine.nextToken());
				double gpa = Double.parseDouble(numLine.nextToken());
				String name = in.readLine();
				p1.addStudent(new Student(name, id, gpa));
				
			} catch (IOException | NullPointerException ex) {
				
				try {
					
					in.close();
					
				} catch (IOException e) {
					
					System.out.println("This is an actual bug. Code 2");
					e.printStackTrace();
					return;
					
				}
				
				break;
				
			}
			
		}
		
		System.out.println("File loaded.");
		System.out.println("Choose choice 1 to display students.");
		
	}
	
	public static void sortViaInsertion(Student[] students) {
		
		long time = Sorter.sortViaInsertion(students);
		System.out.print("\nIt took " + time + " milliseconds to sort these");
		System.out.println(" with the insertion sort");
		
	}
	
	public static void sortViaSelection(Student[] students) {
		
		long time = Sorter.sortViaSelection(students);
		System.out.print("\nIt took " + time + " milliseconds to sort these");
		System.out.println(" with the selection sort");
		
	}
	
	public static void sortViaArraysClass(Student[] students) {
		
		long time = Sorter.sortViaJavaArraysClass(students);
		System.out.print("\nIt took " + time + " milliseconds to sort these");
		System.out.println(" with the Arrays class");
		
	}
	
	public static void sortViaMerge(Student[] students) {
		
		long time = Sorter.sortViaMerge(students);
		System.out.print("\nIt took " + time + " milliseconds to sort these");
		System.out.println(" with the merge sort");
		
	}
	
	//Uses console to read the users desired number of students and passes on 
	//to CreateFiles.
	public static void createFile(BufferedReader console) {
		
		System.out.println("How many students for the file?");
		int numberOfStudents;
		
		try {
			
			numberOfStudents = Integer.parseInt(console.readLine());
			CreateFiles.createFile(numberOfStudents);
			
		} catch (NumberFormatException e) {
			
			System.out.println("That's not a number!");
			createFile(console);
			
		} catch (IOException e) {
			
			System.out.println("This is an actual bug. Code 0");
			e.printStackTrace();
			
		}
		
	}
	
}
