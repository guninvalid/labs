/**
 * 
 * Author:
 * Date: 
 * Teacher: 
 * Lab: Racers
 * 
**/
	
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Enumeration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRecordsSortSearchApplication {
	
	private static final String STUDENT_FILENAME = "students999.txt";
	
	public static void main(String args[]) {
		
		Student[] sortedStudents = null;
		ClassPeriod p1 = new ClassPeriod("PERIOD 1");
		readClass(p1);
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		char choice = '-';
		
		while (choice != '8') {
			
			showMenu();
			
			try {
				
				choice = console.readLine().charAt(0);
				
			} catch (StringIndexOutOfBoundsException | IOException ex) {
				
				System.out.println("You must enter a choice...");
				continue;
				
			}
			
			System.out.println();
			
			switch (choice) {
				
				case '0':
						
						createFile(console);
						break;
						
				case '1':
						
						sortedStudents = p1.getStudents();
						showStudents(sortedStudents);
						break;
						
				case '2':
						
						System.out.println("Print name of file:");
						try {
							
							readClass(p1, console.readLine());
							
						} catch (IOException e) {
							
							System.out.println("That file (probably) doesn't exist!");
							
						}
						break;
						
				case '3':
						
						sortedStudents = p1.getStudents();
						sortViaArraysClass(sortedStudents);
						break;
						
				case '4':
						
						sortedStudents = p1.getStudents();
						sortViaInsertion(sortedStudents);
						break;
						
				case '5':
						
						sortedStudents = p1.getStudents();
						sortViaSelection(sortedStudents);
						break;
						
				case '6':
						
						sortedStudents = p1.getStudents();
						sortViaMerge(sortedStudents);
						break;
						
				case '7':
						
						showStudents(sortedStudents);
						break;
						
				case '8':
						
						System.out.println("Byeeeeeeeeeeeeee");
						break;
						
				default:
						
						System.out.println("That's not a choice!");
						break;
						
			}
		}
	}
	
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
	
	public static void showStudents(Student[] students) {
		
		for (int i = 0; i < students.length; i++) {
			
			System.out.println(students[i]);
			
		}
		
	}
	
	public static void readClass(ClassPeriod p1) {
		
		readClass(p1, STUDENT_FILENAME);
		
	}
	
	public static void readClass(ClassPeriod p1, String filename) {
		
		File tmp = new File(filename);
		
		if (!tmp.exists()) {
			
			System.out.println("That file does not exist!");
			return;
			
		}
		
		System.out.println("Please wait while data file loads...");
		p1.clear();
		BufferedReader in;
		
		try {
			
			in = new BufferedReader(new FileReader(filename));
			
		} catch (FileNotFoundException e1) {
			
			System.out.println("I could not find your file!");
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
					
					e.printStackTrace();
					
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
	
	public static void createFile(BufferedReader console) {
		
		System.out.println("How many students for the file?");
		int numberOfStudents;
		
		try {
			
			numberOfStudents = Integer.parseInt(console.readLine());
			CreateFiles.createFile(numberOfStudents);
			
		} catch (NumberFormatException e) {
			
			System.out.println("That's not a number!");
			
		} catch (IOException e) {
			
			System.out.println("This is an actual bug.");
			e.printStackTrace();
			
		}
		
	}
	
}
